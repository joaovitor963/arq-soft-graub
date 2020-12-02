package com.example.demo.venda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.venda.entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> { }