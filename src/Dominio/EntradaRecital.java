package Dominio;

import java.time.LocalDateTime;

public class EntradaRecital extends Entrada {

	public EntradaRecital(float precio, LocalDateTime fechaHora, boolean esVip) {
		super(precio, fechaHora);
		
		this.esVip = esVip;
	}

	private boolean esVip;
	
	@Override
	public String toString()
	{
		return super.toString() + 
				"\nVip: " + (esVip == true ? "S�" : "No");
	}
}
