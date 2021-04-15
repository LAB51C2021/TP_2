package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import Enum.Clasificacion;
import Enum.GeneroPersona;
import Enum.PuntosDeVenta;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {
		Deportivo eventoHockey = new Deportivo("5 vs 5 hockey.", LocalDateTime.now(), 90, 50, new Hockey(Clasificacion.Internacional));
		
		TreeSet<Entrada> entradaTreeSet = new TreeSet<Entrada>();
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		
		//------------------------Punto B---------------------------
		Iterator<Entrada> entradasTreeSetIterator = entradaTreeSet.iterator();
		
		while (entradasTreeSetIterator.hasNext())
		{
			Entrada entrada = entradasTreeSetIterator.next();
			System.out.print(entrada);
		}
		//------------------------Punto B---------------------------
		
		
		//------------------------Punto C---------------------------
		LocalDateTime date = LocalDateTime.now();
		
		Entrada entradaDummy = new Entrada(250, date);
		Entrada entradaDummy2 = entradaDummy;
		
		if(entradaDummy.equals(entradaDummy2)){
			System.out.print("Entradas iguales.");
		}
		//------------------------Punto C---------------------------
		
		//------------------------Punto D---------------------------
		Cliente cliente1 = new Cliente("Francisco", "Mansilla", "80865447", "Calle falsa 123", GeneroPersona.Masulino, "Virreyes", "Buenos Aires");
		Cliente cliente2 = new Cliente("Gabriel", "Robledo", "80865448", "Calle falsa 321", GeneroPersona.Femenino, "Tigre", "Buenos Aires");
		
		Deportivo eventoFutbol = new Deportivo("5 vs 5 futbol.", LocalDateTime.now(), 90, 50, new Futbol(Clasificacion.Nacional));
		
		eventoFutbol.GenerarEntradas();
		eventoFutbol.GenerarEntradas();
		eventoFutbol.GenerarEntradas();
		
		
		Venta venta1 = new Venta(PuntosDeVenta.uno, cliente1, eventoHockey.getEntradaList());
		Venta venta2 = new Venta(PuntosDeVenta.dos, cliente2, eventoFutbol.getEntradaList());
		
		System.out.print(venta1.toString());
		System.out.print(venta2.toString());
		//------------------------Punto D---------------------------
	}

}
