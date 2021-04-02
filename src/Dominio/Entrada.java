package Dominio;

public class Entrada {

	private static int id = 1;

	private int codigoEntrada;
	
	private float precio;
	
	public Entrada(float precio) {
		
		this.precio = precio;
		id++;
		codigoEntrada = id;
	}
	
}
