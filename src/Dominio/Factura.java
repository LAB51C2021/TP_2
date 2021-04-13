package Dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Factura {

	public Factura(Cliente cliente, ArrayList<Entrada> entradas) {

		Formatter obj = new Formatter();
		
		this.cliente = cliente;
		this.entradas = entradas;
		this.montoTotal = GetTotalEntradas(entradas);
		this.fechaVenta = LocalDate.now();
		
		
		numeroFactura = String.valueOf(obj.format("%08d", id));
		id++;
	}
	
	private static int id = 1;
	
	/*Propiedades*/
	private String numeroFactura;
	private Cliente cliente;
	private float montoTotal;
	private LocalDate fechaVenta;
	
	private List<Entrada> entradas;
	
	/*Metodos*/
	private float GetTotalEntradas(List<Entrada> entradas)
	{
		float total = 0;
		
		for (Entrada entrada : entradas)
		{
			total += entrada.getPrecio();
		}
		
		return total;
	}

	public List<Entrada> getEntradas() {
		return entradas;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + cliente.getNombreCompleto()
				+ "\nNro de factura: " + numeroFactura
				+ "\nMonto total: " + "$" + montoTotal
				+ "\nFecha de emision: " + fechaVenta;
	}
}
