package Dominio;

public class Futbol extends Deporte {

	private final static float precio = (float)300;

	public Futbol(Clasificacion clasificacion) {
		super(TiposDeportes.Futbol, precio, clasificacion);
	}
}
