package org.example;
import java.util.ArrayList;
public class Pasajero{

	private String nombre;
	private int edad;
	private int numeroDeAsiento;

	private ArrayList<Boleto> numerosAsiento;
	public Pasajero(){
		this.nombre=nombre;
		this.edad=edad;
		this.numeroDeAsiento=numeroDeAsiento;

	}
	public String getNombre(){return nombre;}
	public void setNombre(String nombre ){this.nombre=nombre;}

	public int getEdad(){return edad;}

	public void setEdad(int edad){this.edad=edad;}

	public int getNumeroDeAsiento(){return numeroDeAsiento;}

	public void setNumeroDeAsiento(int numeroDeAsiento){this.numeroDeAsiento=numeroDeAsiento;}





}