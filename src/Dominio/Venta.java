package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Formatter;

import Enum.PuntosDeVenta;

public class Venta {
	
	private static int id = 1;

	private int idVenta;
	private PuntosDeVenta puntoDeVenta;
	private Factura factura;
	
	public Venta(PuntosDeVenta puntoDeVenta, Cliente cliente, ArrayList<Entrada> entradas) {
		
		this.factura = new Factura(cliente, entradas);
		this.puntoDeVenta = puntoDeVenta;
		
		idVenta = id;
		id++;
	}
	
	@Override
	public String toString() {
		Formatter obj = new Formatter();
		
		return "\n----------------------------" +
				"\nId: " + idVenta + 
				"\nPunto de venta: " + puntoDeVenta.toString() +
				"\nFactura: \n\n\t" + factura.toString();
	}
	
	
	
}
