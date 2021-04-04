package Dominio;

public class Futbol extends Deporte {

	private final static String nombre = "Futbol";
	private final static float precio = (float)300;

	public Futbol(Clasificacion clasificacion) {
		super(nombre, precio, clasificacion);
	}
}
