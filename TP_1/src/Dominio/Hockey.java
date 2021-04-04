package Dominio;

public class Hockey extends Deporte {

	private final static String nombre = "Hockey";
	private final static float precio = (float)380;

	public Hockey(Clasificacion clasificacion) {
		super(nombre, precio, clasificacion);
	}
}
