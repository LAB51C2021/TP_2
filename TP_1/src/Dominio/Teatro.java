package Dominio;

import java.time.LocalDateTime;

public class Teatro extends Evento {

	private final static String nombre = "Teatro";
	private final float precio = (float)1350.50;
	
	public Teatro(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadCuponesMaxima, boolean incluyeSouvenir) {
		super(nombre, descripcion, fechaHora, minutosDuracion, cantidadCuponesMaxima);

	}

	//ArrayList<Actores> actorList;
	//Teatral generoTeatral;
	
	@Override
	public String toString() {
		return super.toString();
	}
}
