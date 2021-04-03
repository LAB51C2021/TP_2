package Dominio;

public class Rugby implements Deporte {

	private final String nombre = "Rugby";
	private final float precio = (float)450;

	public Rugby(Clasificacion clasificacion) {
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
