package Dominio;

import java.time.LocalDateTime;

public class EntradaRecital extends Entrada {

	public EntradaRecital(float precio, LocalDateTime fechaHora, int minutosDuracion, boolean esVip) {
		super(precio, fechaHora, minutosDuracion);
		
		this.esVip = esVip;
	}

	private boolean esVip;
	
	@Override
	public String toString()
	{
		return super.toString() + 
				"\nVip: " + (esVip == true ? "Sí" : "No");
	}
}
