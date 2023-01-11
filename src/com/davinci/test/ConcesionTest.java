package com.davinci.test;

import com.davinci.domain.Concesion;
import com.davinci.domain.Efectivo;
import com.davinci.domain.Estacion;
import com.davinci.domain.Pase;
import com.davinci.domain.Sube;

import com.davinci.domain.Cabina;
import com.davinci.domain.CategoriaVehiculo;
import com.davinci.domain.Vehiculo;

public class ConcesionTest {

	public static void main(String[] args) {
		
		Concesion concesion1 = new Concesion();
		
		Estacion estacion1 = new Estacion(1, "SolDeGAlicia");
		
		concesion1.addEstacion(estacion1);
		
		estacion1.addCabina(1, new Sube(5));
		estacion1.addCabina(2, new Efectivo());
		estacion1.addCabina(3, new Efectivo());
		estacion1.addCabina(4, new Pase(2));
		estacion1.addCabina(5, new Pase(5));
		
		estacion1.mostrarCabinas();
		
		
		// Obtener la cabina 1 y asignarle un registro

				
				asignarregistroAcabinaPorId(estacion1,1 ,new Vehiculo("ccc222",CategoriaVehiculo.AUTO));
				asignarregistroAcabinaPorId(estacion1,1 ,new Vehiculo("bbb333",CategoriaVehiculo.MOTO));
				
				asignarregistroAcabinaPorId(estacion1,2 ,new Vehiculo("ccc333",CategoriaVehiculo.CAMION));
				asignarregistroAcabinaPorId(estacion1,2 ,new Vehiculo("ccc999",CategoriaVehiculo.AUTO));
			
				
				System.out.println("----------------------------------------");
				
				System.out.println("Cabinas que cobrabn en efectivo: "  + estacion1.cabinasEnEfectivo());
				
				System.out.println("----------------------------------------");
				System.out.println("El promedio de demora es " + estacion1.promedioDeDemora());

	}

	private static void asignarregistroAcabinaPorId(Estacion estacion1,Integer id, Vehiculo vehiculo) {
		if (estacion1.getCabinaById(id) != null) {
			Cabina cab = estacion1.getCabinaById(id);
			
			
			cab.cobrar(vehiculo, estacion1);


			System.out.println(estacion1.toString());
		} else {
			System.out.println("No existe cabina");
		}
	}

}
