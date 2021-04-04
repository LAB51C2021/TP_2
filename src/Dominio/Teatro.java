package Dominio;

import java.time.LocalDateTime;

public class Teatro extends Evento {

	private final float precio = (float)1350.50;
	
	public Teatro(String descripcion, LocalDateTime fechaHora, int cantidadCuponesMaxima, boolean incluyeSouvenir) {
		super(TiposEvento.Teatro, descripcion, fechaHora, cantidadCuponesMaxima);

	}

	//ArrayList<Actores> actorList;
	//Teatral generoTeatral;
	
	@Override
	public String toString() {
		return super.toString();
	}
}
