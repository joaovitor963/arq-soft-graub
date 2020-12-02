package com.example.demo.venda.controller;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.venda.entity.Venda;
import com.example.demo.venda.repository.VendaRepository;


@RestController
public class VendaController {
    @Autowired
    private VendaRepository _vendaRepository;

    @RequestMapping(value = "/venda", method = RequestMethod.GET)
    public List<Venda> Get() {
        return _vendaRepository.findAll();
    }

    @RequestMapping(value = "/venda/{id}", method = RequestMethod.GET)
    public ResponseEntity<Venda> GetById(@PathVariable(value = "id") long id)
    {
        Optional<Venda> venda = _vendaRepository.findById(id);
        if(venda.isPresent())
            return new ResponseEntity<Venda>(venda.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/venda", method =  RequestMethod.POST)
    public Venda Post(@Valid @RequestBody Venda venda)
    {
        return _vendaRepository.save(venda);
    }

    @RequestMapping(value = "/venda/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Venda> Put(@PathVariable(value = "id") long id, @Valid @RequestBody Venda newVenda)
    {
        Optional<Venda> oldVenda = _vendaRepository.findById(id);
        if(oldVenda.isPresent()){
            Venda venda = oldVenda.get();
            //venda.setNome(newVenda.getNome());
            _vendaRepository.save(venda);
            return new ResponseEntity<Venda>(venda, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/venda/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
    {
        Optional<Venda> venda = _vendaRepository.findById(id);
        if(venda.isPresent()){
            _vendaRepository.delete(venda.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}