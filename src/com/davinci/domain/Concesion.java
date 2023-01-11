package com.davinci.domain;

import java.util.ArrayList;
import java.util.List;

import com.davinci.domain.Estacion;

public class Concesion {
	
	private List<Estacion>estaciones;
	
	

	public Concesion() {
		this.estaciones = new ArrayList<>();
	}

	//getters and setters
	public List<Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(List<Estacion> estaciones) {
		this.estaciones = estaciones;
	}

	
	//add
	
	public void addEstacion(Estacion estacion) {
		this.estaciones.add(estacion);
	}

	public void addEstacion(Integer id, String nombre) {
		Estacion estacion = new Estacion(id, nombre);
		this.addEstacion(estacion);
	}

}
