package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bus {

	private String patente;
	private String marca;
	private String modeloDeBus;


	private ArrayList<Conductor> listaConductores;
	private ArrayList<Pasajero> listaDePasajeros;
	public Bus(){
		this.patente=patente;
		this.marca=marca;
		this.modeloDeBus=modeloDeBus;

	}

	public String getPatente(){return patente;}
	public void  setPatente(String patente){this.patente=patente;}
	public String getMarca(){return marca;}
	public void setModeloDeBus(String direccion){this.modeloDeBus=modeloDeBus;}
	public List<Pasajero> getListaPasajeros() {return listaDePasajeros;}


	public void agregarConductor(Conductor Conductor) {
		listaConductores.add(Conductor);
		// TODO - implement bus.agregarConductor
		//throw new UnsupportedOperationException();
	}

	public void agregarPasajero(Pasajero Pasajero) {
		// TODO - implement bus.agregarPasajero
		listaDePasajeros.add(Pasajero);

		//throw new UnsupportedOperationException();
	}

	public void mostrarPasajeros() {
		// TODO - implement bus.mostrarPasajeros
		//throw new UnsupportedOperationException();
		System.out.println(listaDePasajeros);
	}

}