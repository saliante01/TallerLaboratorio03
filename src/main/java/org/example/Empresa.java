package org.example;

import java.util.List;
import java.util.ArrayList;

public class Empresa {

	private int rut;
	private String direccion;
	private String redesSociales;
	private ArrayList<Bus> listaBuses;

	public Empresa(){
		this.rut=rut;
		this.direccion=direccion;
		this.redesSociales=redesSociales;

	}

	public int getRut(){return rut;}
	public void  setRut(int rut){this.rut=rut;}
	public String getDireccion(){return direccion;}
	public void setDireccion(String direccion){this.direccion=direccion;}
	public List<Bus> getListaBuses() {
		return listaBuses;
	}

	public void agregarBus(Bus Bus) {
		// TODO - implement empresa.agregarBus
		//throw new UnsupportedOperationException();
		listaBuses.add(Bus);
	}

	public void asociarViaje() {
		// TODO - implement empresa.asociarViaje
		throw new UnsupportedOperationException();
	}

	public void viajesTotales() {
		// TODO - implement empresa.viajesTotales
		throw new UnsupportedOperationException();
	}

	public void descontinuarBus() {
		// TODO - implement empresa.descontinuarBus
		throw new UnsupportedOperationException();
	}

}