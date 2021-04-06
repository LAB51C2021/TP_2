package Dominio;

public abstract class Deporte {
	
	private final static float recargo = (float)1.30;
	
	public Deporte(TiposDeportes tipoDeporte, float precio, Clasificacion clasificacion) {
		super();
		this.tipoDeporte = tipoDeporte;
		this.precio = precio;
		this.clasificacion = clasificacion;
	}

	private TiposDeportes tipoDeporte;
	private float precio;
	private Clasificacion clasificacion;
	
	public abstract String GetTypeBall();
	
	public float GetPrecio() {
		return this.clasificacion == Clasificacion.Internacional ? this.precio*recargo : this.precio;
	}

	public String GetStringClasificacion() {
		return this.clasificacion.toString();
	}
	
	@Override
	public String toString()
	{
		return tipoDeporte.toString();
	}
}
