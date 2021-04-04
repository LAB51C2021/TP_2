package Dominio;

import java.time.LocalDateTime;

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
	
	public static void main(String[] args) throws Exception {
		
		EventoDeportivo_SeteoCorrecto_Caso3();
	}
}
