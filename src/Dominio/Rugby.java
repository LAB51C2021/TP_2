package Dominio;

import Enum.Clasificacion;
import Enum.TiposDeportes;

public class Rugby extends Deporte {

	private final static float precio = (float)450;

	public Rugby(Clasificacion clasificacion) {
		super(TiposDeportes.Rugby, precio, clasificacion);
	}
	
	public String GetTypeBall() {
		return "Pelota ovalada N° 3";
	}
}
