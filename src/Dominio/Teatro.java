package Dominio;

public class Teatro extends Evento {
	
	private final float precio = (float)1350.50;
	
	public Teatro(String descripcion, int cantidadCupones) {
		super(descripcion, cantidadCupones);

	}

	//ArrayList<Actores> actorList;
	//Teatral generoTeatral;
	
	@Override
	public String toString() {
		return super.toString();
	}
}
