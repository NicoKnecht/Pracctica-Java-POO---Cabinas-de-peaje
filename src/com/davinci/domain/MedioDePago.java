package com.davinci.domain;

public abstract class MedioDePago {
	private String descripcion;
	private Integer diasDemora;
	
	
	public MedioDePago(String descripcion, Integer diasDemora) {
	
		this.descripcion = descripcion;
		this.diasDemora = diasDemora;
	}

	//Getters y Setters

	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getDiasDemora() {
		return diasDemora;
	}


	public void setDiasDemora(Integer diasDemora) {
		this.diasDemora = diasDemora;
	}
	
	
	// metodo abstracto
	
	@Override
	public String toString() {
		return "MedioDePago [descripcion=" + descripcion + ", diasDemora=" + diasDemora + "]";
	}

	public abstract Double getDescuento();
	
}
