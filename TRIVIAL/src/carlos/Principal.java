package carlos;

import felipe.Trivial;
import leer_por_teclado.Leer;

public class Principal {

	public static void main(String[] args) {
		Trivial nuevaPartida;
		String repetir = "S";
		int opc;

		// TODO DISEÑO(Germán)
		// Imprime pantalla de bienvenida con titulo del juego(poner entre
		// parentesis al final que se pulse intro para continuar)
		Leer.dato();

		do {
			// TODO DISEÑO(Germán)
			// Imprimir mensaje con las diferentes opciones:
			// - Empezar a jugar
			// - Reglas del juego
			// - �Quienes somos?
			// - SALIR DEL MENÚ
			// (A�adir al final: Elija una opci�n(0-3) siendo el 0 la salida del men�)
			opc = Leer.datoInt();

			switch (opc) {
			case 0:
				repetir = "N";
				break;
			case 1:
				/*
				 * TODO TRIVIAL(Felipe)
				 * Dentro de este constructor se debería preguntar si
				 * el juego va a ser individual o por equipos y despu�s,
				 * en ambos casos, se piden los nombres de los jugadores o
				 * el nombre del equipo y los jugadores respectivamente. 
				 */
				 nuevaPartida = new Trivial();
				/*
				 * TODO FELIPE(Trivial)
				 * Inmediatamente despu�s de pedir los nombres empezaremos
				 * a jugar.
				 */
				 nuevaPartida.jugarPartida();
				break;
			case 2:
				// TODO DISE�O(Germ�n)
				// Imprime las reglas del juego. (Adem�s poner entre
				// parentesis que se pulse intro para continuar)
				Leer.dato();
				break;
			case 3:
				// TODO DISE�O(Germ�n)
				// Imprime los componentes del grupo. (Adem�s poner entre
				// parentesis que se pulse intro para continuar)
				Leer.dato();
				break;
			default:
				// TODO DISE�O(Germ�n)
				// Imprime el siguiente mensaje:
				// System.out.println("ERROR DE OPCI�N: la opci�n seleccionada
				// no existe. Int�ntelo de nuevo.\n"
				// + "(Pulse intro)");
				break;
			}
		} while (repetir.toUpperCase() == "S");

	}

}
