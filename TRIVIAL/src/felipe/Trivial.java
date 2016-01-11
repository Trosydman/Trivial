package felipe;

import java.util.Arrays;
import java.util.Random;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import leer_por_teclado.Leer;
import norberto.Movimiento;
import carlos.Casilla;
import carlos.Equipo;
import carlos.Tablero;
import german.Disenio;
import alex.ListadoPreguntas;

/**
 * Clase donde se desarrolla el juevo "TRIVIAL" con un tablero donde se mueven tantas fichas como jugadores/equipos 
 * se encuentren en la partida.
 * 
 * @author Felipe Fernandez Barrero
 *
 */

public class Trivial {
	// ATRIBUTOS
	Equipo eq1;
	Equipo eq2;
	Equipo eq3;
	Equipo eq4;
	Equipo[] turno;
	ListadoPreguntas cache = new ListadoPreguntas();
	Tablero tab = new Tablero();
	Movimiento mov = new Movimiento();

	// CONSTRUCTORES

	// MÉTODOS

	
	
	public boolean pedirDatos(){
		int menu, jug;
		boolean comproB=true;
		
		
		do {

			Disenio.generarMenuDatos();
			menu = Leer.datoInt();
			Disenio.contLin+=15;
			Disenio.limpiarConsola();
		} while (menu < 0 && menu >= 2);

		switch (menu) {
		case 1:

			comproB = false;
			do {
				Disenio.generarNumJug();
				jug = Leer.datoInt();
				
				if (jug <= 4 && jug > 1) {

					// TODO ladilla el syso se cambia por el metodo german
					cogerNombre(jug, comproB);

				} else {
					System.out.println("El numero de jugadores no es el correcto\n");
				}
			} while (jug > 4 || jug <= 1);
			break;

		case 2:

			do {
				Disenio.generarNumEq();
				jug = Leer.datoInt();
				
				if (jug <= 4 && jug > 1) {

					// TODO ladilla el syso se cambia por el metodo german

					cogerNombre(jug, comproB);

				} else {
					System.out.println("El numero de jugadores no es el correcto\n");
					Disenio.contLin+=2;
				}

			} while (jug > 4 || jug <= 1);
			break;

		default:
			System.out.println("no se contempla esa opcion");
			Disenio.contLin+=2;
			break;

		}
		return comproB;
	}
	
	
	
	
	
	
	
	
	// ladilla metodo donde se desarrolla el juego
	public void jugarPartida(boolean comproB) {
		int i = 0, dado;
		boolean  isNotFin = true;
		int[] posPreg;
		Casilla[][] saveCasilla;

	
		
		
		do {
			Disenio.limpiarConsola();
			Disenio.generarCabeTab(turno[i]);
			tab.imprimeTablero();
			Disenio.generarLeyenda();
			/*
			 
			if (comproB) {
				System.out.println("Es el turno de " + turno[i].getNombreEq());
			} else {
				System.out.println("Es el turno de " + turno[i].getJugador());
			}
			System.out.println("quesitos[" + Arrays.toString(turno[i].getQuesitos()) + "]");
			*/
			dado = lanzarDado();
			
			System.out.println("Ha salido el número "+dado+"\n(intro)");
			Leer.dato();
//			tab.borrarEqTablero(turno[i]);
			mov.escogerMovimiento(turno[i], dado, tab, false);
//			tab.establecerEqTablero(turno[i]);
			tab.imprimeTablero();
			Disenio.generarLeyenda();

			posPreg = mov.identifiCasilla(turno[i], tab.getCasillasTabl());
			saveCasilla = tab.getCasillasTabl();
			switch (saveCasilla[posPreg[0]][posPreg[1]].getTipo()) {

			case Casilla.PROG:

				Disenio.generarCabeceraPreg(Casilla.PROG);
				if (cache.imprimirPregPROG() == false) {

					if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
						cache.quitarQuesito(Casilla.PROG, turno[i]);
						System.out.println("\t\tHas perdido un quesito de PROGRAMACIÓN.");
					}
					i++;
					if (i == turno.length) {
						i = 0;
					}
				} else {
					if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
						cache.darQuesito(Casilla.PROG, turno[i]);
						System.out.println("\t\t¡Has ganado un quesito de PROGRAMACIÓN!");
					}

				}

				break;

			case Casilla.BBDD:

				Disenio.generarCabeceraPreg(Casilla.BBDD);
				if (cache.imprimirPregBBDD() == false) {

					if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
						cache.quitarQuesito(Casilla.BBDD, turno[i]);
						System.out.println("\t\tHas perdido un quesito de BBDD.");
					}
					i++;
					if (i == turno.length) {
						i = 0;
					}
				} else {
					if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
						cache.darQuesito(Casilla.BBDD, turno[i]);
						System.out.println("\t\t¡Has ganado un quesito de BBDD!");
					}

				}
				break;

			case Casilla.HTML:

				Disenio.generarCabeceraPreg(Casilla.HTML);
				if (cache.imprimirPregHTML() == false) {

					if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
						cache.quitarQuesito(Casilla.HTML, turno[i]);
						System.out.println("\t\tHas perdido un quesito de HTML.");
					}
					i++;
					if (i == turno.length) {
						i = 0;
					}
				} else {
					if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
						cache.darQuesito(Casilla.HTML, turno[i]);
						System.out.println("\t\t¡Has ganado un quesito de HTML!");
					}

				}
				break;

			case Casilla.SIS:

				Disenio.generarCabeceraPreg(Casilla.SIS);
				if (cache.imprimirPregSIS() == false) {

					if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
						cache.quitarQuesito(Casilla.SIS, turno[i]);
						System.out.println("\t\tHas perdido un quesito de SISTEMAS.");
					}
					i++;
					if (i == turno.length) {
						i = 0;
					}
				} else {
					if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
						cache.darQuesito(Casilla.SIS, turno[i]);
						System.out.println("\t\t¡Has ganado un quesito de SISTEMAS!");
					}

				}
				break;

			case Casilla.COL:

				if (!comprobarAllQuesitos(turno[i])) {
					Disenio.generarCabeceraPreg(Casilla.COL);
					if (cache.imprimirPregCOL() == false) {

						if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
							cache.quitarQuesito(Casilla.COL, turno[i]);
							System.out.println("\t\tHas perdido un quesito de COLEGIO.");
						}
						i++;
						if (i == turno.length) {
							i = 0;
						}
					} else {
						if (saveCasilla[posPreg[0]][posPreg[1]].isQuesito()) {
							cache.darQuesito(Casilla.COL, turno[i]);
							System.out.println("\t\t¡Has ganado un quesito de COLEGIO!");

						}

					}
				} else {
					isNotFin = listadoFinal();
					if(isNotFin) {
						i++;
						if (i == turno.length) {
							i = 0;
						}
					}
				}
				break;

			}

		} while (isNotFin);

	}

	public boolean listadoFinal() {
		boolean aux = false;

		for (int i = 0; i < 3 && aux == false; i++) {

			if (!cache.imprimirPregCOL()) {
				aux = true;
			}

		}

		return aux;
	}

	// ladilla pide los nombres de los jugadores y distribuye con un metodo el
	// orden de los turnos
	public void cogerNombre(int jug, boolean tipoEquipo) {
		int numJ = 1;
		String nomJug;
		turno = new Equipo[jug];

		for (int i = 0; i < jug; i++) {

			if (tipoEquipo) {

				System.out.println("Diga el nombre del equipo " + numJ + "(Min 3 caracteres):");
				Disenio.contLin+=2;
			} else {

				System.out.println("Diga el nombre del jugador " + numJ + "(Min 3 caracteres):");
				Disenio.contLin+=2;
			}

			do {

				nomJug = Leer.dato();
				if (nomJug.length() < 3) {
					System.out.println("El nombre debe de tener minimo 3 caractereres.\n Prueba de nuevo: ");
					Disenio.contLin+=3;
				}
			} while (nomJug.length() < 3);

			switch (i) {
			case 0:
				eq1 = new Equipo(numJ, nomJug, tipoEquipo);
				atribuirTurno(eq1);
				tab.establecerEqTablero(eq1);
				break;

			case 1:
				eq2 = new Equipo(numJ, nomJug, tipoEquipo);
				atribuirTurno(eq2);
				tab.establecerEqTablero(eq2);
				break;

			case 2:
				eq3 = new Equipo(numJ, nomJug, tipoEquipo);
				atribuirTurno(eq3);
				tab.establecerEqTablero(eq3);
				break;

			case 3:
				eq4 = new Equipo(numJ, nomJug, tipoEquipo);
				atribuirTurno(eq4);
				tab.establecerEqTablero(eq4);
				break;
			}
			numJ++;
		}

	}

	// ladilla metodo para tirar el dado para saber los movimientos
	public int lanzarDado() {
		int num, hasta = 6, desde = 1;
		//System.out.println("Intro para tirar los dados");
		Disenio.tirarDado();
		Leer.dato();
		Random numAle = new Random();
		num = numAle.nextInt(hasta - desde + 1) + desde;
		return num;
	}

	// ladilla metodo para asignar turno aleatoriamente

	public void atribuirTurno(Equipo eqTurn) {

		int num, hasta = turno.length - 1, desde = 0;
		boolean fin = false;

		do {
			Random numAle = new Random();
			num = numAle.nextInt(hasta - desde + 1) + desde;
			if (turno[num] == null) {
				turno[num] = eqTurn;
				fin = true;
			}
		} while (turno[num] != null && fin == false);
	}

	/*
	 * ladilla metodo para comprobar ganador y establecer fin del juego. Se
	 * utilizara como condicion para salir del bucle que cogera al metodo
	 * jugarpartida.
	 */

	/**
	 * Método que comprueba si tiene todos los quesitos rellenos de un jugador/equipo, utilizándose como condición para 
	 * saber quién accede al listado final de preguntas. Si tiene todos los quesitos terminará el juego y se proclama ganador.
	 * @param eq parámetro que identifica el jugador/equipo del turno correspondiente.
	 * @return boleano que indica el acceso al {@link #cache.listadoFinal() listado final}.
	 */
	public boolean comprobarAllQuesitos(Equipo eq) {
		boolean[] proB = eq.getQuesitos();
		boolean fin = true;

		for (int i = 0; i < proB.length && fin == true; i++) {

			if (false == proB[i]) {
				fin = false;
			}
		}
		return fin;
	}

	// GETTERS, SETTERS Y TOSTRINGS

	public Tablero getTab() {
		return tab;
	}

	public void setTab(Tablero tab) {
		this.tab = tab;
	}
}
