package Dominio;

public class Evento 
{
	public Evento(String descripcion, int cantidadCupones)
	{
		this.descripcion = descripcion;
		
		this.cantidadEntradas = cantidadCupones;
	}
	
	private int cantidadEntradas;
	
	private int cantidadVendida;
	
	
	public String getCaracteristicas() {
		return descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	private String descripcion;

	private float precio;
	
	//private ArrayList<Entradas> entradaList;
	
}
