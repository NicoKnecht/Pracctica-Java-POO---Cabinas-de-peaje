package com.davinci.domain;

public enum CategoriaVehiculo {
	
	AUTO (150d),
	MOTO (80d),
	CAMION (250d);
	
	private Double precio;


	
	//constructor privado
	
	private CategoriaVehiculo(Double precio) {
		this.precio = precio;
	}
	
	//getter

	public Double getPrecio(){
		return precio;
	}
}
