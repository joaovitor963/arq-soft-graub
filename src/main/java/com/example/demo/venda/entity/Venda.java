package com.example.demo.venda.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Venda {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private Integer codigo;

	@Column(name = "valor_sem_desconto", nullable = false)
	private Integer valorSemDesconto;

	@Column(name = "valor_com_desconto")
	private Integer valorcomDesconto;

	@Column(name = "data_criacao", nullable = false)
	private Date dataCriacao;

	@Column(name = "data_modificacao", nullable = false)
	private Date dataModificacao;

	@Column(name = "data_venda", nullable = false)
	private Date dataVenda;

	@OneToOne
	@JoinColumn(name = "operador_id")
	private Pessoa operador;

	@OneToOne
	@JoinColumn(name = "cliente_id")
	private Pessoa cliente;
	
	@ManyToOne
	@JoinColumn(name = "caixa_id")
	private Caixa caixa;
	
	@OneToOne
	@JoinColumn(name = "pagamento_id")
	private Pagamento pagamento;

	@OneToMany(mappedBy = "venda")
	private List<Item> item;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getValorSemDesconto() {
		return valorSemDesconto;
	}

	public void setValorSemDesconto(Integer valorSemDesconto) {
		this.valorSemDesconto = valorSemDesconto;
	}

	public Integer getValorcomDesconto() {
		return valorcomDesconto;
	}

	public void setValorcomDesconto(Integer valorcomDesconto) {
		this.valorcomDesconto = valorcomDesconto;
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

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Pessoa getOperador() {
		return operador;
	}

	public void setOperador(Pessoa operador) {
		this.operador = operador;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

}
