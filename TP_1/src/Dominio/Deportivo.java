package Dominio;

import java.time.LocalDateTime;

public class Deportivo extends Evento {

	private final static String nombre = "Deportivo";

	public Deportivo(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadCuponesMaxima, Deporte deporte) {
		super(nombre, descripcion, fechaHora, minutosDuracion, cantidadCuponesMaxima);

		this.deporte = deporte;
	}
	
	// Propiedades
	private Deporte deporte;
	
	// Metodos
	public Entrada GenerarEntradas()
	{
		try
		{
			Entrada entrada = new Entrada(deporte.GetPrecio(), this.GetFechaHora(), this.GetMinutosDuracion());
			super.GenerarEntradas(entrada);
			
			return entrada;
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nDeporte: " + deporte.toString() +
				"\nInternacional: " + deporte.GetStringClasificacion();
	}
}
