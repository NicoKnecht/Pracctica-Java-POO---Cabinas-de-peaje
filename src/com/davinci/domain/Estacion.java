package com.davinci.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.davinci.domain.Cabina;
import com.davinci.domain.MedioDePago;

public class Estacion {
	private Integer id;
	private String nombre;
	
	private List<Cabina>cabinas;

	public Estacion(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cabinas = new ArrayList<>();
	}

	//Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cabina> getCabinas() {
		return cabinas;
	}

	public void setCabinas(List<Cabina> cabinas) {
		this.cabinas = cabinas;
	}

//add
	public void addCabina(Cabina cabina) {
		this.cabinas.add(cabina);
	}

	public void addCabina(Integer id, MedioDePago medioDePago) {
		Cabina cabina = new Cabina(id, medioDePago);
		this.addCabina(cabina);
	}
	
	
	public int dameHoraActual() {
		Random rand = new Random();
		return rand.nextInt(23);
	}
	

	public Cabina getCabinaById(Integer id){
		int cab = 0;
		for (Cabina cabina : cabinas) {
			if(cabina.getId()== id) {
				System.out.println("Id cabina existe");
				return cabina;
				}
			}
		return null;
		
	}
	
	public void mostrarCabinas() {
		System.out.println("Lista de Cabinas:");
		for(Cabina cabina : cabinas) {
			System.out.println( cabina.toString());
		}
		
	}
	
	public int cabinasEnEfectivo() {
		int contador= 0;
		for(Cabina cabina : cabinas) {
			if(cabina.getMedioDePago().getDescripcion() == "EFECTIVO"){
				contador++;
			}
		}
		return contador;
		
		
	}
	
	public Double promedioDeDemora() {
		Integer acumulador = 0;
		Integer contador = 0;
		Double result = 0.0;
		for(Cabina cabina : cabinas) {
			if(cabina.getMedioDePago().getDiasDemora() != 0) {
				contador ++;
			acumulador += cabina.getMedioDePago().getDiasDemora() ;
			}
		}	
		System.out.println("contador: " + contador + "  acumulador: " +  acumulador);
		result = (double) (acumulador / contador);
		
		return result;
		
	}
	
	
	

	@Override
	public String toString() {
		return "Estacion [id=" + id + ", nombre=" + nombre + ", cabinas=" + cabinas + "]";
	}
	
	
}
