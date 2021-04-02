package Dominio;

import java.time.LocalDateTime;

public class Infantil extends Evento {

	private final float precioMayor = 500;
	
	private final float precioMenor = 250;
	
	private final int limiteEdad = 8;
	
	private boolean incluyeSouvenir;
	
	public Infantil(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadEntradas, boolean incluyeSouvenir) {
		super(TiposEvento.Infantil, descripcion, fechaHora, minutosDuracion, cantidadEntradas);
		
		this.incluyeSouvenir = incluyeSouvenir;
	}
	
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
	
	public Entrada venderEntrada(int edad) throws Exception {
		try {
			EntradaInfantil entrada = new EntradaInfantil(this.GetPrecioPorEdad(edad), edad);
			super.venderEntrada(entrada);
			
			return entrada;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
