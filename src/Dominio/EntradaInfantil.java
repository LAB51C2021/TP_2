package Dominio;

import java.sql.Time;
import java.time.LocalDateTime;

public class EntradaInfantil extends Entrada {

	public EntradaInfantil(float precio, LocalDateTime fechaHora, Time tiempoDuracion, int edad) {
		super(precio, fechaHora, tiempoDuracion);
		
		this.edad = edad;
	}
	
	private int edad;
}
