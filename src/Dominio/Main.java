package Dominio;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) throws Exception {

		Infantil eventoInfantilConSouvenir = new Infantil("descripcion evento infantil 1", LocalDateTime.now(), 40, 3, true);
		eventoInfantilConSouvenir.venderEntrada(22);
		eventoInfantilConSouvenir.venderEntrada(25);
		eventoInfantilConSouvenir.venderEntrada(6);
		eventoInfantilConSouvenir.venderEntrada(27);
		
		Infantil eventoInfantilSinSouvenir = new Infantil("descripcion evento infantil 2", LocalDateTime.now(), 45, 100, false);
		eventoInfantilConSouvenir.venderEntrada(22);
		eventoInfantilConSouvenir.venderEntrada(25);
		eventoInfantilConSouvenir.venderEntrada(6);
		eventoInfantilConSouvenir.venderEntrada(7);

	}
}
