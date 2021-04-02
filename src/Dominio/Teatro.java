package Dominio;

import java.time.LocalDateTime;

public class Teatro extends Evento {
	
	private final float precio = (float)1350.50;
	
	public Teatro(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadEntradas) {
		super(TiposEvento.Teatro, descripcion, fechaHora, minutosDuracion, cantidadEntradas);

	}

	//ArrayList<Actores> actorList;
	//Teatral generoTeatral;
	
	@Override
	public String toString() {
		return super.toString();
	}
}
