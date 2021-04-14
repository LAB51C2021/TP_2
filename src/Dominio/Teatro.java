package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

import Enum.TiposEvento;

public class Teatro extends Evento {
	
	private final float precio = (float) 1350.50;
	
	public Teatro(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadCuponesMaxima,
			GeneroTeatral generoTeatral, ArrayList<Actor> actoresPrincipales) {
		super(TiposEvento.Teatro, descripcion, fechaHora, minutosDuracion, cantidadCuponesMaxima);
		
		this.generoTeatral = generoTeatral;
		this.actoresPrincipales = actoresPrincipales;

	}
	
	private GeneroTeatral generoTeatral;
	private ArrayList<Actor> actoresPrincipales;

	public Entrada GenerarEntradas()
	{
		try
		{
			Entrada entrada = new EntradaTeatro(precio, LocalDateTime.now());
			if(actoresPrincipales.size() > 0 & actoresPrincipales.size() <= 3)
				super.GenerarEntradas(entrada);
			else
				throw new Exception("Puede haber hasta 3 Actores principales");
				
			return entrada;
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	public float GetPrecio()
	{
		return precio;
	}
	
	public GeneroTeatral getGeneroTeatral() {
		return generoTeatral;
	}

	public void setGeneroTeatral(GeneroTeatral generoTeatral) {
		this.generoTeatral = generoTeatral;
	}

	public String ActorPrincipalToString() {
		return actoresPrincipales.toString().substring(1, actoresPrincipales.toString().length() - 1);
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nGenero: " + getGeneroTeatral().GetGeneroDescripcion() +
				"\nActores Pricipales: " + (actoresPrincipales.size() <= 3 ? ActorPrincipalToString() : "");
	}
}
