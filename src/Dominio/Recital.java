package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

import Enum.TiposEvento;

public class Recital extends Evento {

	private final float precio = 800;
	private final float precioVip = 1500;
	
	public Recital(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadCuponesMaximo, 
			GeneroMusical generoMusical, Banda bandaPrincipal, ArrayList<Banda> bandasSoporte) {
		super(TiposEvento.Recital, descripcion, fechaHora, minutosDuracion, cantidadCuponesMaximo);
		
		this.generoMusical = generoMusical;
		this.bandaPrincipal = bandaPrincipal;
		this.bandasSoporte = bandasSoporte;
	}
	
	private GeneroMusical generoMusical;
	private Banda bandaPrincipal;
	private ArrayList<Banda> bandasSoporte;
	
	public Entrada GenerarEntradas(boolean esVip)
	{
		try
		{
			Entrada entrada = new EntradaRecital(this.GetPrecio(esVip), LocalDateTime.now(), esVip);
			super.GenerarEntradas(entrada);
			
			return entrada;
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
	}	
	
	public float GetPrecio(boolean esVip)
	{
		return esVip ? precioVip : precio;
	}
	
	public GeneroMusical getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(GeneroMusical generoMusical) {
		this.generoMusical = generoMusical;
	}

	public String bandaPrincipalToString() {
		return bandaPrincipal.toString();
	}

	public String bandasSoporteToString() {
		return bandasSoporte.toString().substring(1, bandasSoporte.toString().length() - 1);
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nGenero: " + getGeneroMusical().GetGeneroDescripcion() +
				"\nBanda principal: " + this.bandaPrincipalToString() +
				(bandasSoporte.size() > 0 ? "\nBandas soporte: " + bandasSoporteToString() : "");
	}
}
