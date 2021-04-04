package Dominio;

public class Futbol implements Deporte {

	private final String nombre = "Futbol";
	private final float precio = (float)300;

	public Futbol(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	private Clasificacion clasificacion;
	
	public float GetPrecio() {
		return this.clasificacion == Clasificacion.Internacional ? this.precio*(float)1.30 : this.precio;
	}

	@Override
	public String GetStringClasificacion() {
		return this.clasificacion.toString();
	}
	
	@Override
	public String toString()
	{
		return nombre;
	}
}
