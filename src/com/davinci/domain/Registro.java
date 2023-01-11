package com.davinci.domain;

public class Registro {

	private Integer hora;
	private Vehiculo vehiculo;
	//private Cabina cabina;
	
	
	
	
	public Registro(Integer hora, Vehiculo vehiculo) {
	
		this.hora = hora;
		this.vehiculo = vehiculo;
	}

// getters and setters
	public Integer getHora() {
		return hora;
	}


	public void setHora(Integer hora) {
		this.hora = hora;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Registro [hora=" + hora + ", vehiculo=" + vehiculo + "]";
	}



	
}
