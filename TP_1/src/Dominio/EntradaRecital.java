package Dominio;

import java.sql.Time;
import java.time.LocalDateTime;

public class EntradaRecital extends Entrada {

	public EntradaRecital(float precio, LocalDateTime fechaHora, Time tiempoDuracion, boolean esVip) {
		super(precio, fechaHora, tiempoDuracion);
		
		this.esVip = esVip;
	}

	private boolean esVip;
}
