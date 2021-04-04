package Dominio;

public class Rugby extends Deporte {

	private final static String nombre = "Rugby";
	private final static float precio = (float)450;

	public Rugby(Clasificacion clasificacion) {
		super(nombre, precio, clasificacion);
	}
}
