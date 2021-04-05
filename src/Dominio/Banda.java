package Dominio;

public class Banda {
	
	private String descripcion;
	private GenerosMusicales genero;
	
	public Banda(String descripcion, GenerosMusicales genero) {
		this.descripcion = descripcion;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "\n\tDescripcion: " + descripcion + 
				"\n\tGenero: " + genero;
	}
}
