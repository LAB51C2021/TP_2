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
	
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaHora == null) ? 0 : fechaHora.hashCode());
		result = prime * result + idEntrada;
		result = prime * result + Float.floatToIntBits(precio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		if (fechaHora == null) {
			if (other.fechaHora != null)
				return false;
		} else if (!fechaHora.equals(other.fechaHora))
			return false;
		if (idEntrada != other.idEntrada)
			return false;
		if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
			return false;
		return true;
	}
	
	
}
