package carlos;

/*
 * Grupo 1: Proyecto Trivial - Programación 1DAM
 * 
 * Carlos Mesquita Mansilla: Principal, Equipo, Tablero y Casilla
 * Felipe Fernández Barrero: Trivial
 * Alejandro Álvarez Guzmán: ListadoPreguntas
 * Norberto González Rendón: Movimiento
 * Germán López Pedriza: Disenio
 * 
 *  Pueden verse los comentarios generados en la carpeta "doc", en all-classes-frame.html .
 * 
 */


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
				Disenio.generarDespedida();
				break;
			case 1:
				 nuevaPartida = new Trivial();
				 nuevaPartida.jugarPartida(nuevaPartida.pedirDatos());
				break;
			case 2:
				Disenio.generarOpcReglas();
				Leer.dato();
				Disenio.limpiarConsola();
				break;
			case 3:
				Disenio.generarOpcComp();
				Leer.dato();
				Disenio.limpiarConsola();
				break;
			default:
				System.out.println("ERROR DE OPCIÓN: la opción seleccionadano no existe. Inténtelo de nuevo.");				
				break;
			}
		} while (repetir.toUpperCase() == "S");

	}

}
