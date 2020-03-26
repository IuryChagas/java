package com.gft.cobranca.model;

public enum StatusTitulo {
	PENDING("Pendente"),
	PAIDOUT("Recebido");

	private String descricao;
	
	StatusTitulo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
