package Dominio;

import java.util.ArrayList;
import java.util.List;

import Enum.GeneroPersona;

public class Cliente {
	
	public Cliente(String nombre, String apellido, String dni, String direccion, GeneroPersona genero, String localidad,
			String provincia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.genero = genero;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	// Propiedades
	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private GeneroPersona genero;
	private String localidad; // ver si crear clase.
	private String provincia; // crear clase
	
	// Metodos
	@Override
	public String toString() {
		return "Nombre y apellido: " + nombre + " " + apellido
				+ "Dni:" + dni
				+ "Direccion:" + direccion
				+ "Genero:" + genero
				+ "Localidad:" + localidad
				+ "Provincia:" + provincia;
	}
	
	// Getters and Setters
	public String getDni() {
		return dni;
	}
	
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
}
