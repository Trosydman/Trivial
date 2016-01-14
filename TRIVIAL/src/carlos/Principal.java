package carlos;

/*
 * Grupo 1: Proyecto Trivial - Programaci√≥n 1DAM
 * 
 * Carlos Mesquita Mansilla: Principal, Equipo, Tablero y Casilla
 * Felipe Fern·ndez Barrero: Trivial
 * Alejandro ¡lvarez Guzm·n: ListadoPreguntas
 * Norberto Gonz·lez RendÛn: Movimiento
 * Germ·n LÛpez Pedriza: Disenio
 * 
 *  Pueden verse los comentarios generados en la carpeta "doc", en all-classes-frame.html .
 * 
 */


import felipe.Trivial;
import german.Disenio;
import leer_por_teclado.Leer;

/**
 * Clase desde la cu√°l se arranca el programa del Trivial
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
				System.out.println("ERROR DE OPCI√ìN: la opci√≥n seleccionadano no existe. Int√©ntelo de nuevo.");				
				break;
			}
		} while (repetir.toUpperCase() == "S");

	}

}
