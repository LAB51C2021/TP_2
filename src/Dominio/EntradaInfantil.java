package Dominio;

import java.time.LocalDateTime;

public class EntradaInfantil extends Entrada {

	public EntradaInfantil(float precio, LocalDateTime fechaHora, int minutosDuracion, int edad) {
		super(precio, fechaHora, minutosDuracion);
		
		this.edad = edad;
	}
	
	private int edad;

	@Override
	public String toString()
	{
		return super.toString() + 
				"\nEdad: " + edad + " años";
	}
}
