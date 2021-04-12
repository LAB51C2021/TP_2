package Dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {

	public Factura(ArrayList<Entrada> entradas, Cliente cliente, float montoTotal, LocalDate fechaVenta) {
		this.entradas = entradas;
		this.cliente = cliente;
		this.montoTotal = montoTotal;
		this.fechaVenta = fechaVenta;
		
		idFactura = id;
		id++;
	}
	
	
	private static int id = 1;
	
	/*Propiedades*/
	private int idFactura;
	private ArrayList<Entrada> entradas;
	private Cliente cliente;
	private float montoTotal;
	private LocalDate fechaVenta;
	
	
	@Override
	public String toString() {
		return 
				"\nFactura: " + idFactura
				+ "\nCliente: " + cliente.getDni()
				+ "\nMonto total: " + montoTotal
				+ "\nFecha: " + fechaVenta;
	}
}
