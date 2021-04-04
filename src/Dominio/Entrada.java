package Dominio;

import java.time.LocalDateTime;

public class Entrada {

	private static int id = 1;
	
	public Entrada(float precio, LocalDateTime fechaHora, int minutosDuracion) {
		super();
		
		this.precio = precio;
		this.fechaHora = fechaHora;
		this.minutosDuracion = minutosDuracion;
		
		idEntrada = id;
		id++;
	}
	
	// Propiedades
	private int idEntrada;
	private float precio;
	private LocalDateTime fechaHora;
	private int minutosDuracion;
	
	// Metodos
	
	@Override
	public String toString() {
		return "\n----------------------------" +
				"\nId: " + idEntrada + 
				"\nPrecio: " + precio + "$" +
				"\nFecha: " + fechaHora.toLocalDate() +
				"\nHora: " + fechaHora.getHour() + ":" + fechaHora.getMinute() +
				"\nDuracion: " + minutosDuracion + " minutos.";
	}
}
