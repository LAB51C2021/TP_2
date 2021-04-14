package Dominio;

import Enum.Clasificacion;
import Enum.TiposDeportes;

public class Hockey extends Deporte {

	private final static float precio = (float)380;

	public Hockey(Clasificacion clasificacion) {
		super(TiposDeportes.Hockey, precio, clasificacion);
	}
	
	public String GetTypeBall() {
		return "Bocha de hockey";
	}
}
