package norberto;

import com.sun.media.sound.SimpleSoundbank;

import carlos.Casilla;
import carlos.Equipo;
import leer_por_teclado.Leer;

public class Movimiento {

	/**
	 *Este  método sirve para escoger el tipo de movimiento que se desea realizar,
	 *también se utiliza o es llamado en el momento que uno de los movimientos escogidos
	 *se encuentra en una intercepción y da la opción de escoger otro movimiento que sea 
	 *adecuado.  
	 * 
	 * @param triv, este  es el equipo que se quiere mover.
	 * @param dado, este es el número aleatorio que indica la cantidad de casillas que debe 
	 * mover el equipo
	 * @param punto, Array bidimencional que conforma las casillas del tablero.
	 */	
	public void escogerMovimiento(Equipo triv, int dado, Casilla[][] punto) {
		int intro;
		
		/*
		 *Variable booleana que al ser verdadera permitirá ver el menú de los movimientos
		 *que se pueden realizar y ejecutarlo, si la variable es falsa se ejecuta un mensaje que nos
		 *dice que el movimiento no puede ser realizado.
		 *Será verdadera cuando se pueda realizar el movimiento y
		 *será falsa cuando el movimiento no se pueda realizar. 
		 *   
		 */
		boolean comprobar = true;
		/*
		 * En el caso de que el ususario quiera ir para arriba o para abajo, debera
		 * seguir esa dirección y no podra ir para abajo o para arriba respectivamente
		 */
		boolean puedeVertical = true;
		boolean puedeHorizontal= true;
		
		do {
			if (comprobar == false) {
				System.out.println("no puedes realizar este movimiento, escoge otro");
			}
			System.out.println("Para donde quieres moverte.\n" + "Pulsa 1 para ir a la derecha.\n"
					+ "Pulsa 2 Para ir a la Izquierda.\n" + "Pulsa 3 Para ir arriba.\n" + "Pulsa 4 para ir abajo.\n");
			intro = Leer.datoInt();
			switch (intro) {
			case 1:
				comprobar = moverDer(triv, dado, punto);
				break;

			case 2:
				comprobar = moverIzq(triv, dado, punto);
				break;

			case 3:
				comprobar = moverNort(triv, dado, punto);
				break;

			case 4:
				comprobar = moverSur(triv, dado, punto);
				break;

			}

		} while (comprobar == false);

	}
	
	/**
	 * 
	 * @param triv
	 * @param dado
	 * @param punto
	 * @return
	 */
	public boolean moverDer(Equipo triv, int dado, Casilla[][] punto) {
		int[] num = identifiCasilla(triv, punto);
		boolean movi = true;
		for (int i = 1; i <= dado && movi == true; i++) {
			if ((num[0] >= 0 && num[0] <= 6) && (num[1] + i >= 0 && num[1] + i <= 6)
					&& punto[num[0]][num[1] + i] != null) {
				switch (triv.getNumEq()) {
				case 1:
					triv.setPosEq(punto[num[0]][num[1] + i].getPosEq1());
					break;					

				case 2:
					triv.setPosEq(punto[num[0]][num[1] + i].getPosEq2());
					break;

				case 3:
					triv.setPosEq(punto[num[0]][num[1] + i].getPosEq3());
					break;

				case 4:
					triv.setPosEq(punto[num[0]][num[1] + i].getPosEq4());
					break;
				}
				if (punto[num[0]][num[1] + i].isInterseccion() && i >= 2 && i != dado) {
					escogerMovimiento(triv, dado - i, punto);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}

	public boolean moverIzq(Equipo triv, int dado, Casilla[][] punto) {
		int[] num = identifiCasilla(triv, punto);
		boolean movi = true;
		for (int i = 1; i <= dado; i++) {
			if ((num[0] >= 0 && num[0] <= 6) && (num[1] - i >= 0 && num[1] - i <= 6)
					&& punto[num[0]][num[1] - i] != null) {
				switch (triv.getNumEq()) {
				case 1:
					triv.setPosEq(punto[num[0]][num[1] - i].getPosEq1());
					break;

				case 2:
					triv.setPosEq(punto[num[0]][num[1] - i].getPosEq2());
					break;

				case 3:
					triv.setPosEq(punto[num[0]][num[1] - i].getPosEq3());
					break;

				case 4:
					triv.setPosEq(punto[num[0]][num[1] - i].getPosEq4());
					break;
				}
				if (punto[num[0]][num[1] - i].isInterseccion() && i >= 2 && i != dado) {
					escogerMovimiento(triv, dado - i, punto);
					dado = 0;
				}
			} else
				movi = false;

		}
		return movi;
	}

	public boolean moverNort(Equipo triv, int dado, Casilla[][] punto) {
		int[] num = identifiCasilla(triv, punto);
		boolean movi = true;
		for (int i = 1; i <= dado; i++) {
			if ((num[0] - i >= 0 && num[0] - i <= 6) && (num[1] >= 0 && num[1] <= 6)
					&& punto[num[0] - i][num[1]] != null) {
				switch (triv.getNumEq()) {
				case 1:
					triv.setPosEq(punto[num[0] - i][num[1]].getPosEq1());
					break;

				case 2:
					triv.setPosEq(punto[num[0] - i][num[1]].getPosEq2());
					break;

				case 3:
					triv.setPosEq(punto[num[0] - i][num[1]].getPosEq3());
					break;

				case 4:
					triv.setPosEq(punto[num[0] - i][num[1]].getPosEq4());
					break;
				}
				if (punto[num[0] - i][num[1]].isInterseccion() && i >= 2 && i != dado) {
					escogerMovimiento(triv, dado - i, punto);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}

	public boolean moverSur(Equipo triv, int dado, Casilla[][] punto) {
		int[] num = identifiCasilla(triv, punto);
		boolean movi = true;
		for (int i = 1; i <= dado; i++) {
			if ((num[0] + i >= 0 && num[0] + i <= 6) && (num[1] >= 0 && num[1] <= 6)
					&& punto[num[0] + i][num[1]] != null) {
				switch (triv.getNumEq()) {
				case 1:
					triv.setPosEq(punto[num[0] + i][num[1]].getPosEq1());
					break;

				case 2:
					triv.setPosEq(punto[num[0] + i][num[1]].getPosEq2());
					break;

				case 3:
					triv.setPosEq(punto[num[0] + i][num[1]].getPosEq3());
					break;

				case 4:
					triv.setPosEq(punto[num[0] + i][num[1]].getPosEq4());
					break;
				}
				if (punto[num[0] + i][num[1]].isInterseccion() && i >= 2 && i != dado) {
					escogerMovimiento(triv, dado - i, punto);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}

	public int[] identifiCasilla(Equipo triv, Casilla[][] punto) {
		int posit[] = new int[2];
		boolean salir = false;
		for (int i = 0; i < punto.length && salir == false; i++) {
			switch (triv.getNumEq()) {
			case 1:
				if (triv.getPosEq()[0] == punto[i][0].getPosEq1()[0]) {
					posit[0] = i;
					i = 0;
					salir = true;
				}
				break;

			case 2:
				if (triv.getPosEq()[0] == punto[i][0].getPosEq2()[0]) {
					posit[0] = i;
					i = 0;
					salir = true;
				}
				break;
			case 3:
				if (triv.getPosEq()[0] == punto[i][0].getPosEq3()[0]) {
					posit[0] = i;
					i = 0;
					salir = true;
				}
				break;

			case 4:
				if (triv.getPosEq()[0] == punto[i][0].getPosEq4()[0]) {
					posit[0] = i;
					i = 0;
					salir = true;
				}
				break;
			}
		}
		salir=false;
		for (int j = 0; j < punto[posit[0]].length && salir == false; j++) {
			if (punto[posit[0]][j] != null) {
				switch (triv.getNumEq()) {
				case 1:
					if (triv.getPosEq()[1] == punto[posit[0]][j].getPosEq1()[1]) {
						posit[1] = j;
						salir = true;
					}
					break;

				case 2:
					if (triv.getPosEq()[1] == punto[posit[0]][j].getPosEq2()[1]) {
						posit[1] = j;
						salir = true;
					}
					break;
				case 3:
					if (triv.getPosEq()[1] == punto[posit[0]][j].getPosEq3()[1]) {
						posit[1] = j;
						salir = true;
					}
					break;

				case 4:
					if (triv.getPosEq()[1] == punto[posit[0]][j].getPosEq4()[1]) {
						posit[1] = j;
						salir = true;
					}
					break;
				}
			}

		}
		  return posit;
	}
	
	
}
