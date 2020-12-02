package com.example.demo.venda.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Caixa {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private int codigo;
	
	@OneToOne
	@JoinColumn(name = "operador_id")
	private Pessoa operador;
	
	@Column(name = "hora_abertura")
	private Date horaAbertura;
	
	@Column(name = "hora_fechamento")
	private Date horaFechamento;
	
	@Column
	private Integer saldo;
	
	@Column(name = "is_aberto")
	private boolean isAberto;
	
	@Column(name = "valor_vendas")
	private Integer valorVendas;
	
	@Column(name = "valor_abertura")
	private Integer valorAbertura;
	
	@Column(name = "valor_fechamento")
	private Integer valorFechamento;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caixa")
	private List<Venda> vendas;
	
	@Column
	private String explicacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Pessoa getOperador() {
		return operador;
	}

	public void setOperador(Pessoa operador) {
		this.operador = operador;
	}

	public Date getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(Date horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public Date getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(Date horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	public boolean isAberto() {
		return isAberto;
	}

	public void setAberto(boolean isAberto) {
		this.isAberto = isAberto;
	}

	public Integer getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(Integer valorVendas) {
		this.valorVendas = valorVendas;
	}

	public Integer getValorAbertura() {
		return valorAbertura;
	}

	public void setValorAbertura(Integer valorAbertura) {
		this.valorAbertura = valorAbertura;
	}

	public Integer getValorFechamento() {
		return valorFechamento;
	}

	public void setValorFechamento(Integer valorFechamento) {
		this.valorFechamento = valorFechamento;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public String getExplicacao() {
		return explicacao;
	}

	public void setExplicacao(String explicacao) {
		this.explicacao = explicacao;
	}
}
