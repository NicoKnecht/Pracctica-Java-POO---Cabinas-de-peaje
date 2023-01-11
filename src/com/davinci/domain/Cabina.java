package com.davinci.domain;

import java.util.ArrayList;
import java.util.List;

public class Cabina {
	private List <Registro>registros;
	private Integer id;
	private MedioDePago medioDePago;
	
	

	public Cabina(Integer id, MedioDePago medioDePago) {
		this.id = id;
		this.medioDePago = medioDePago;
		this.registros = new ArrayList<>();
	}

	public Cabina(Integer id) {
		this.id = id;
	}
	
	// getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	
	// add
	
	public void addRegistro(Registro registro) {
		this.registros.add(registro);
			
	}
	
	public void addRegistro(Integer hora, Vehiculo vehiculo) {
		Registro registro = new Registro(hora, vehiculo);
		this.addRegistro(registro);
	}
	
	public boolean plusPorHorario(Integer hora) {
		Boolean cobrarPlus = false;
		if(hora >= 17 && hora <= 20 ){
			cobrarPlus = true;
		}
		return cobrarPlus;
	}
	
	public Double cobrar(Vehiculo vehiculo,Estacion estacion) {
		Double PrecioMasplus;
		Integer hora = estacion.dameHoraActual();
		Double precioPorCategoria = vehiculo.getCategoria().getPrecio() ;
		
		if(plusPorHorario(hora) == true) {
			PrecioMasplus = precioPorCategoria *1.08;
		}else {
			PrecioMasplus = precioPorCategoria;
		}
		
		Double totalAcobrar = precioPorCategoria - ((precioPorCategoria * getMedioDePago().getDescuento())/100);
		
		addRegistro(hora, vehiculo);// agrego registro
		
		System.out.println("Se cobró " + totalAcobrar + " hora: " + hora );
		return totalAcobrar ;
	}

	@Override
	public String toString() {
		return "Cabina [registros=" + registros + ", id=" + id + ", medioDePago=" + medioDePago + "]";
	}
	
	
}
