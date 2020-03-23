package com.gft.cobranca.model;

public enum StatusTitulo {
	PENDING("Pending"),
	PAIDOUT("PaidOut"),
	CANCELED("Cancelled");

	private String descricao;
	
	StatusTitulo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
