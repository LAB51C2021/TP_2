package Dominio;

import java.time.LocalDateTime;

public class Recital extends Evento {

	private final static String nombre = "Recital";
	private final float precio = 800;
	private final float precioVip = 1500;
	
	public Recital(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadCuponesMaxima, boolean incluyeSouvenir) {
		super(nombre, descripcion, fechaHora, minutosDuracion, cantidadCuponesMaxima);

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
