package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import Enum.Clasificacion;

public class Ejercicio1 {
	
	public static void main(String[] args) throws Exception {
		Deportivo eventoChasqui = new Deportivo("11 vs 11 chasqui.", LocalDateTime.now(), 90, 50, new Futbol(Clasificacion.Nacional));
		
		ArrayList<Entrada> entradaList = new ArrayList<Entrada>();
		entradaList.add(eventoChasqui.GenerarEntradas());
		entradaList.add(eventoChasqui.GenerarEntradas());
		entradaList.add(eventoChasqui.GenerarEntradas());
		entradaList.add(eventoChasqui.GenerarEntradas());
		entradaList.add(eventoChasqui.GenerarEntradas());

		Iterator<Entrada> entradasListIterator = entradaList.iterator();
	
		while (entradasListIterator.hasNext())
		{
			Entrada entrada = entradasListIterator.next();
			System.out.print(entrada);
		}
	}
}
