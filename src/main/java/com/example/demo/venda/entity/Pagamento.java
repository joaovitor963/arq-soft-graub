package com.example.demo.venda.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Pagamento {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column( name = "meio_pagamento")
	private int meioPagamento;
	
	@OneToOne
	@JoinColumn(name = "operador_id")
	private Pessoa operador;
	
	@OneToOne
	@JoinColumn(name = "venda_id")
	private Venda venda;
	
	@Column
	private int valor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMeioPagamento() {
		return meioPagamento;
	}

	public void setMeioPagamento(int meioPagamento) {
		this.meioPagamento = meioPagamento;
	}

	public Pessoa getOperador() {
		return operador;
	}

	public void setOperador(Pessoa operador) {
		this.operador = operador;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
