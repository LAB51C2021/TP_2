package Dominio;

import java.time.LocalDateTime;

import Enum.TiposEvento;

public class Deportivo extends Evento {

	public Deportivo(String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadCuponesMaxima, Deporte deporte) {
		super(TiposEvento.Deportivo, descripcion, fechaHora, minutosDuracion, cantidadCuponesMaxima);

		this.deporte = deporte;
	}
	
	// Propiedades
	private Deporte deporte;
	
	// Metodos
	public Entrada GenerarEntradas()
	{
		try
		{
			Entrada entrada = new Entrada(deporte.GetPrecio(), this.GetFechaHora());
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
				"\nPelota utilizada: " + deporte.GetTypeBall() +
				"\nClasificacion: " + deporte.GetStringClasificacion();
	}
}
