package Dominio;

public class Actor {
	private String nombre;
	private String apellido;
	
	public Actor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "\n\tNombre: " + nombre + 
				"\n\tApellido: " + apellido;
	}
}
