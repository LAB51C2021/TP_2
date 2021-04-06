package Dominio;

public class Banda {
	
	private String descripcion;
	private GeneroMusical genero;
	
	public Banda(String descripcion, GeneroMusical genero) {
		this.descripcion = descripcion;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "\n\tDescripcion: " + descripcion + 
				"\n\tGenero: " + genero.GetGeneroDescripcion();
	}
}
