package com.davinci.domain;

public class Vehiculo {
	private String patente;
	
	private CategoriaVehiculo categoria;
	
	
	

	public Vehiculo(String patente, CategoriaVehiculo categoria) {
		this.patente = patente;
		this.categoria = categoria;
	}


	
	// getters y setters
	

	public String getPatente() {
		return patente;
	}




	public void setPatente(String patente) {
		this.patente = patente;
	}




	public CategoriaVehiculo getCategoria() {
		return categoria;
	}




	public void setCategoria(CategoriaVehiculo categoria) {
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", categoria=" + categoria + " ,categoria.precio=" +categoria.getPrecio() +"]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}

	

}
