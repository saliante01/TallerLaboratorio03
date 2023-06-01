package org.example;

public class Conductor {

	private String nombre;
	private String apellido;
	private int numeroTelefonico;
	private String tipoLicenciaDeConducir;


	public Conductor(){
	this.nombre=nombre;
	this.apellido=apellido;
	this.numeroTelefonico=numeroTelefonico;
	this.tipoLicenciaDeConducir=tipoLicenciaDeConducir;
	}
	public String getNombre(){return nombre;}
	public void setNombre(String nombre){this.nombre=nombre;}
	public String getApellido(){return apellido;}
	public void setApellido(String apellido){this.apellido=apellido;}
	public int getNumeroTelefonico(){return numeroTelefonico;}

	public void setNumeroTelefonico(int numeroTelefonico){this.numeroTelefonico=numeroTelefonico;}

	public String getTipoLicenciaDeConducir(){return tipoLicenciaDeConducir;}

	public void setTipoLicenciaDeConducir(String tipoLicenciaDeConducir){this.tipoLicenciaDeConducir=tipoLicenciaDeConducir;}








}