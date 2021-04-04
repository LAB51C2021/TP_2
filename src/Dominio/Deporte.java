package Dominio;

public class Deporte {
	
	private final static float recargo = (float)1.30;
	
	public Deporte(String nombre, float precio, Clasificacion clasificacion) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.clasificacion = clasificacion;
	}

	private String nombre;
	private float precio;
	private Clasificacion clasificacion;
	
	public float GetPrecio() {
		return this.clasificacion == Clasificacion.Internacional ? this.precio*recargo : this.precio;
	}

	public String GetStringClasificacion() {
		return this.clasificacion.toString();
	}
	
	@Override
	public String toString()
	{
		return nombre;
	}
}