package com.davinci.domain;

public class Efectivo extends MedioDePago {

	public Efectivo() {
		super("EFECTIVO",0);// seteo valor 
	
	}

	@Override
	public Double getDescuento() {
		return 0d;
	}

	
	
}
