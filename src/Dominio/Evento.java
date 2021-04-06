package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Evento 
{
	public Evento(TiposEvento tipo, String descripcion, LocalDateTime fechaHora, int minutosDuracion, int cantidadCuponesMaximo)
	{
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.fechaHora = fechaHora;
		this.minutosDuracion = minutosDuracion;
		this.cantidadCuponesMaximo = cantidadCuponesMaximo;
		
		entradaList = new ArrayList<Entrada>();
	}

	// Propiedades
	private TiposEvento tipo;
	private String descripcion;
	private LocalDateTime fechaHora;
	private int minutosDuracion;
	private int cantidadCuponesMaximo;
	
	private ArrayList<Entrada> entradaList;
	
	// Metodos
	protected void VerEntradas()
	{
		for (Entrada entrada : entradaList)
		{
			System.out.println(entrada.toString());
		}
	}
	
	protected void GenerarEntradas(Entrada entrada) throws Exception
	{
		if (GetCantidadEntradas() > cantidadCuponesMaximo)
		{
			throw new Exception("Se ha llegado al limite de entradas disponibles del evento " + descripcion + ".");
		}

		entradaList.add(entrada);
	}
	
	// Getters y Setters
	public int GetCantidadEntradas()
	{
		return entradaList == null ? 0 : entradaList.size() + 1;
	}
	
	public String GetDescripcion() {
		return descripcion;
	}

	public LocalDateTime GetFechaHora() {
		return fechaHora;
	}

	public int GetMinutosDuracion() {
		return minutosDuracion;
	}
	
	public String toString() {
		return "----------------------------"
				+ "\nTipo: " + tipo
				+ "\nDescripcion: " + descripcion
				+ "\nFecha: " + fechaHora.toLocalDate() 
				+ "\nHora: " + fechaHora.getHour() + ":" + fechaHora.getMinute()
				+ "\nDuracion: " + minutosDuracion + " minutos.";
	}
}
