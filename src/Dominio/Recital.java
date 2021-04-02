package Dominio;

import java.time.LocalDateTime;

public class Recital extends Evento {
	
	private final float precio = 800;
	
	private final float precioVip = 1500;
	
	public Recital(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadEntradas) {
		super(TiposEvento.Recital, descripcion, fechaHora, minutosDuracion, cantidadEntradas);

	}
	
	//private GeneroMusical generoMusical;
	
	//private Banda bandaPrincipal;
	
	//private ArrayList<Banda> bandaSoporteList;
	
	public float GetPrecio(boolean esVip)
	{
		if (esVip)
		{
			return precioVip;
		}
		else
		{
			return precio;
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
