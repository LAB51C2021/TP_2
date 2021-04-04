package Dominio;

import java.time.LocalDateTime;

public class Recital extends Evento {

	private final float precio = 800;
	private final float precioVip = 1500;
	
	public Recital(String descripcion, LocalDateTime fechaHora, int cantidadCuponesMaxima, boolean incluyeSouvenir) {
		super(TiposEvento.Recital, descripcion, fechaHora, cantidadCuponesMaxima);

	}
	
	//private GeneroMusical generoMusical;
	
	//private Banda bandaPrincipal;
	
	//private ArrayList<Banda> bandaSoporteList;
	
	public float GetPrecio(boolean esVip)
	{
		return esVip ? precioVip : precio;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
