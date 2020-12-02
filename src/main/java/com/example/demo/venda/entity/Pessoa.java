package com.example.demo.venda.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Pessoa
{
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
    @Column
	private String cpf;

    @Column(nullable = false, unique=true)
    private String nome;

	@Column(name = "data_criacao")
	private Date dataCriacao;

	@Column(name = "data_modificacao")
	private Date dataModificacao;
    
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(long id) {
        this.id = id;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
}