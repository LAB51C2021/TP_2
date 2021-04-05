package Dominio;

public class Rugby extends Deporte {

	private final static float precio = (float)450;

	public Rugby(Clasificacion clasificacion) {
		super(TiposDeportes.Rugby, precio, clasificacion);
	}
}
