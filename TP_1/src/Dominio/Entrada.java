package Dominio;

import java.sql.Time;
import java.time.LocalDateTime;

public class Entrada {

	private static int id = 1;
	
	public Entrada(float precio, LocalDateTime fechaHora, Time tiempoDuracion) {
		super();
		this.precio = precio;
		this.fechaHora = fechaHora;
		this.tiempoDuracion = tiempoDuracion;
	}
	
	private float precio;
	
	private LocalDateTime fechaHora;
	
	private Time tiempoDuracion;
}
