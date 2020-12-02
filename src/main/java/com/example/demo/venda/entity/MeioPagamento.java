package com.example.demo.venda.entity;

public enum MeioPagamento {
	DINHEIRO(1), CARTAODEBITO(2), CARTAOCREDITO(3), CHEQUE(4), VALEPRESENTE(5);

	private final int valor;

	MeioPagamento(int valorOpcao) {
		valor = valorOpcao;
	}

	public int getValor() {
		return valor;
	}
}
