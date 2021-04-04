package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Principal {

	public static void ValidacionLimiteEntradas_Caso1()
	{
		//Caso 1: Validación de límite de entradas
		Infantil eventoInfantil_1 = new Infantil("Infantil 1", LocalDateTime.now(), 120, 2, true);
		eventoInfantil_1.GenerarEntradas(5);
		eventoInfantil_1.GenerarEntradas(23);
		eventoInfantil_1.GenerarEntradas(6);
	}
	
	public static void EventoInfantil_SeteoCorrecto_Caso2()
	{
		//Caso 2: Seteo correcto de precios
		Infantil eventoInfantil_1 = new Infantil("infantil 2", LocalDateTime.now(), 120, 5, true);
		eventoInfantil_1.GenerarEntradas(5);
		eventoInfantil_1.GenerarEntradas(20); 
		eventoInfantil_1.GenerarEntradas(5);
		eventoInfantil_1.GenerarEntradas(13);

		System.out.print(eventoInfantil_1.toString());
		eventoInfantil_1.VerEntradas();
	}

	public static void EventoDeportivo_SeteoCorrecto_Caso3()
	{
		Deportivo eventoDeportivo_1 = new Deportivo("Deportivo 1 - Futbol Internacional", LocalDateTime.now(), 120, 5, new Futbol(Clasificacion.Internacional));
		eventoDeportivo_1.GenerarEntradas();
		eventoDeportivo_1.GenerarEntradas();
		eventoDeportivo_1.GenerarEntradas();
		
		System.out.print(eventoDeportivo_1.toString());
		eventoDeportivo_1.VerEntradas();

		Deportivo eventoDeportivo_2 = new Deportivo("Deportivo 2 - Futbol Nacional", LocalDateTime.now(), 120, 5, new Futbol(Clasificacion.Nacional));
		eventoDeportivo_2.GenerarEntradas();
		eventoDeportivo_2.GenerarEntradas();
		eventoDeportivo_2.GenerarEntradas();
		
		System.out.print(eventoDeportivo_2.toString());
		eventoDeportivo_2.VerEntradas();
	}
	
	public static void EventoRecital_SeteoCorrecto_Caso4()
	{
		Banda bandaPrincipal = new Banda("Linkin Park", GenerosMusicales.Rock);
		ArrayList<Banda> bandasSoporte = new ArrayList<Banda>();
		//bandasSoporte.add(new Banda("Alma Fuerte", GenerosMusicales.Heavy_metal));
		//bandasSoporte.add(new Banda("Turf", GenerosMusicales.Pop));
		
		
		Recital eventoRecital_1 = new Recital("Recital 1 - Linkin Park World Tour", LocalDateTime.now(), 120, 5, GenerosMusicales.Rock, bandaPrincipal, bandasSoporte);
		eventoRecital_1.GenerarEntradas(true);
		eventoRecital_1.GenerarEntradas(true);
		eventoRecital_1.GenerarEntradas(false);
		
		System.out.print(eventoRecital_1.toString());
		eventoRecital_1.VerEntradas();
	}
	
	public static void EventoTeatro_SeteoCorrecto_Caso1()
	{
		ArrayList<Actor> actoresPrincipales = new ArrayList<Actor>();
		actoresPrincipales.add(new Actor("Freddie","Mercury"));
		actoresPrincipales.add(new Actor("Brian","May"));
		actoresPrincipales.add(new Actor("Roger","Taylor"));
		//actoresPrincipales.add(new Actor("John","Deacon"));
		
		
		if(actoresPrincipales.size() > 0 & actoresPrincipales.size() <= 3 ) {
			Teatro eventoTeatral_1 = new Teatro("Bohemian Rhapsody", LocalDateTime.now(), 112, 4, GenerosTeatrales.Teatro , actoresPrincipales);
			eventoTeatral_1.GenerarEntradas();
			eventoTeatral_1.GenerarEntradas();
			eventoTeatral_1.GenerarEntradas();
			
			System.out.print(eventoTeatral_1.toString());
			eventoTeatral_1.VerEntradas();
		}
		else{
			System.out.print("Puede haber hasta 3 Actores principales");
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		//EventoRecital_SeteoCorrecto_Caso4();
		EventoTeatro_SeteoCorrecto_Caso1();
	}
}
