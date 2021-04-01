package Dominio;

import java.util.ArrayList;

public class Infantil extends Evento {

	private final float precioMayor = 500;
	
	private final float precioMenor = 250;
	
	private final int limiteEdad = 8;
	
	public Infantil(String descripcion, float precio, int cantidadEntradas, boolean incluyeSouvenir) {
		super(descripcion, cantidadEntradas);
		
		this.incluyeSouvenir = incluyeSouvenir;
	}
	
	private boolean incluyeSouvenir;
	
	public float GetPrecioPorEdad(int edad)
	{
		if (edad >= limiteEdad)
		{
			return precioMayor;
		}
		else
		{
			return precioMenor;
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
