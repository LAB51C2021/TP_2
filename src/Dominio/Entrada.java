package Dominio;

import java.time.LocalDateTime;
import java.util.Formatter;

public class Entrada {

	private static int id = 1;
	
	public Entrada(float precio, LocalDateTime fechaHora) {
		super();
		
		this.precio = precio;
		this.fechaHora = fechaHora;
		
		idEntrada = id;
		id++;
	}
	
	// Propiedades
	private int idEntrada;
	private float precio;
	private LocalDateTime fechaHora;
	
	// Metodos
	
	@Override
	public String toString() {
		Formatter obj = new Formatter();
		
		return "\n----------------------------" +
				"\nId: " + idEntrada + 
				"\nPrecio: $ " + precio +
				"\nFecha: " + fechaHora.toLocalDate() +
				"\nHora: " + fechaHora.getHour() + ":" + String.valueOf(obj.format("%02d", fechaHora.getMinute()));
	}
}
