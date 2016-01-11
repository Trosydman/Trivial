package carlos;

import felipe.Trivial;
import german.Disenio;
import leer_por_teclado.Leer;

/**
 * Clase desde la cuál se arranca el programa del Trivial
 * 
 * @author Carlos Mesquita Mansilla
 *
 */
public class Principal {

	public static void main(String[] args) {
		Trivial nuevaPartida;
		String repetir = "S";
		int opc;

		Disenio.generarBienvenida();
		Leer.dato();
		Disenio.limpiarConsola();
		do {
			Disenio.generarMenu();
			opc = Leer.datoInt();
			Disenio.limpiarConsola();
			switch (opc) {
			case 0:
				repetir = "N";
				break;
			case 1:
				 nuevaPartida = new Trivial();
				 nuevaPartida.jugarPartida(nuevaPartida.pedirDatos());
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
				System.out.println("ERROR DE OPCIÓN: la opción seleccionadano no existe. Inténtelo de nuevo.");				
				break;
			}
		} while (repetir.toUpperCase() == "S");

	}

}
