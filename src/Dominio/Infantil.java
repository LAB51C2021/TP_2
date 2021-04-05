package Dominio;

import java.time.LocalDateTime;

public class Infantil extends Evento {

	private final static float precioMayor = 500;
	private final static float precioMenor = 250;
	private final static int limiteEdad = 8;
	
	public Infantil(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadCuponesMaximo, boolean incluyeSouvenir) {
		super(TiposEvento.Infantil, descripcion, fechaHora, minutosDuracion, cantidadCuponesMaximo);
		
		this.incluyeSouvenir = incluyeSouvenir;
	}
	
	// Propiedades
	private boolean incluyeSouvenir;
	
	// Metodos
	public Entrada GenerarEntradas(int edad)
	{
		try
		{
			Entrada entrada = new EntradaInfantil(GetPrecioPorEdad(edad), this.GetFechaHora(), edad);
			super.GenerarEntradas(entrada);
			
			return entrada;
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	//Getters y Setters
	public float GetPrecioPorEdad(int edad)
	{
		return edad >= limiteEdad ? precioMayor : precioMenor;
	}
	
	public String GetStringSouvenir()
	{
		return incluyeSouvenir == true ? "Si" : "No";
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nSouvenir: " + GetStringSouvenir();
	}
}
