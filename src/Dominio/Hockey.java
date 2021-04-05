package Dominio;

public class Hockey extends Deporte {

	private final static float precio = (float)380;

	public Hockey(Clasificacion clasificacion) {
		super(TiposDeportes.Hockey, precio, clasificacion);
	}
}
