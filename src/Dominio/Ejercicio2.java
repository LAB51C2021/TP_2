package Dominio;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.TreeSet;
import Enum.Clasificacion;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {
		Deportivo eventoHockey = new Deportivo("5 vs 5 hockey.", LocalDateTime.now(), 90, 50, new Hockey(Clasificacion.Internacional));
		
		TreeSet<Entrada> entradaTreeSet = new TreeSet<Entrada>();
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		entradaTreeSet.add(eventoHockey.GenerarEntradas());
		entradaTreeSet.add(eventoHockey.GenerarEntradas());

		Iterator<Entrada> entradasTreeSetIterator = entradaTreeSet.iterator();
		
		while (entradasTreeSetIterator.hasNext())
		{
			Entrada entrada = entradasTreeSetIterator.next();
			System.out.print(entrada);
		}
	}

}
