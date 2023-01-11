package com.davinci.test;

import com.davinci.domain.CategoriaVehiculo;
import com.davinci.domain.Vehiculo;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo auto1 = new Vehiculo("ABC123", CategoriaVehiculo.AUTO );
		
		System.out.println("Vehiculo: " + auto1.toString());
		System.out.println("Vehiculo: " + auto1.getCategoria().getPrecio());

	}

}
