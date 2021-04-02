package Dominio;

public class EntradaRecital extends Entrada {

	public EntradaRecital(float precio, boolean esVip) {
		super(precio);
		this.esVip = esVip;
	}

	private boolean esVip;
}
