package com.gft.cobranca.model;

public enum StatusTitle {
	PENDING("Pending"),
	PAIDOUT("Paid out");
	
	private String description;
	
	StatusTitle(String description){
		this.description = description; 
	}
	
	public String getDescription() {
		return description;
	}
}
