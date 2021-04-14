package Dominio;

import java.time.LocalDateTime;
import java.util.Formatter;

public class Entrada implements Comparable<Entrada> {

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

	//Getters and setters
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Entrada o) {
		if (this == o) return 0;
        if (o == null) return 1;
        if (this.getClass() != o.getClass()) return 1;
        Entrada entrada = (Entrada) o;
        if(id == entrada.id 
                && idEntrada == entrada.idEntrada 
                && precio == entrada.precio
                && fechaHora.equals(entrada.fechaHora))
        	return 0;
        return 1;
	}
}
