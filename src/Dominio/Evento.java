package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Evento {
	
	public Evento(TiposEvento tipo, String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadEntradas)
	{
		this.descripcion = descripcion;
		
		this.cantidadEntradas = cantidadEntradas;
		
		this.cantidadEntradasVendidas = 0;
	}
	
	private TiposEvento tipo;
	
	private int cantidadEntradas;
	
	private static int cantidadEntradasVendidas;
	
	private String descripcion;

	private float precio;
	
	private LocalDateTime fechaHora;
	
	private int minutosDuracion;
	
	private ArrayList<Entrada> entradas;
	
	protected void venderEntrada(Entrada entrada) throws Exception {
		try {
			if(cantidadEntradasVendidas < cantidadEntradas) {
				cantidadEntradasVendidas++;
				entradas.add(entrada);
			}else {
				throw new Exception("No hay entradas disponibles para este evento.");
			}
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	public String getCaracteristicas() {
		return descripcion;
	}

	public float getPrecio() {
		return precio;
	}
	
}
