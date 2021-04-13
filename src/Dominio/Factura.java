package Dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Factura {

	public Factura(Cliente cliente) {

		Formatter obj = new Formatter();
		
		this.cliente = cliente;
		this.montoTotal = GetTotalEntradas(cliente.getEntradas());
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
	
	@Override
	public String toString() {
		return "Cliente: " + cliente.getNombreCompleto()
				+ "\nNro de factura: " + numeroFactura
				+ "\nMonto total: " + "$" + montoTotal
				+ "\nFecha de emision: " + fechaVenta;
	}
}
