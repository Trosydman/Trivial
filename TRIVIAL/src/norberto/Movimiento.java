package norberto;

import com.sun.media.sound.SimpleSoundbank;

import carlos.Casilla;
import carlos.Equipo;
import carlos.Tablero;
import german.Disenio;
import leer_por_teclado.Leer;

public class Movimiento {

	/**
	 *Este  método sirve para escoger el tipo de movimiento que se desea realizar,
	 *también se utiliza o es llamado en el momento que uno de los movimientos escogidos
	 *se encuentra en una intercepción y da la opción de escoger otro movimiento que sea 
	 *adecuado.  
	 * 
	 * @param triv es el equipo que se quiere mover.
	 * @param dado es el número aleatorio que indica la cantidad de casillas que debe 
	 * mover el equipo.
	 * @param tab tablero del juego.
	 * @param girar es una variable encargada de hacer girar al equipo para dende este se lo indique.
	 */	
	public void escogerMovimiento(Equipo triv, int dado, Tablero tab, boolean girar) {
		int intro;
		
		/*
		 *Variable booleana que al ser verdadera permitir� ver el men� de los movimientos
		 *que se pueden realizar y ejecutarlo, si la variable es falsa se ejecuta un mensaje que nos
		 *dice que el movimiento no puede ser realizado.
		 *Ser� verdadera cuando se pueda realizar el movimiento y
		 *ser� falsa cuando el movimiento no se pueda realizar. 
		 *   
		 */
		boolean comprobar = true;
		
		do {
			if (comprobar == false) {
				System.out.println("No puedes realizar este movimiento, escoge otro");
			}
			if(girar) {
				tab.establecerEqTablero(triv);
				Disenio.generarCabeTab(triv);
				tab.imprimeTablero();
				System.out.println(
						triv.getNombreEq()!=null?triv.getNombreEq()+" es necesario girar en una direcci�n. Te quedan "+dado+" movimientos.":
							triv.getJugador()+" es necesario girar en una direcci�n. Te quedan "+dado+" movimientos.");
				girar = false;
			}
			System.out.println("�Para donde quieres moverte?\n"
							 + "\t(1) Derecha.\n"
							 + "\t(2) Izquierda.\n"
							 + "\t(3) Arriba.\n"
							 + "\t(4) Abajo.");
			System.out.println("Eleige un n�mero del 1-4 : ");
			intro = Leer.datoInt();
			System.out.println();
			switch (intro) {
			case 1:
				comprobar = moverDer(triv, dado, tab, girar);
				break;

			case 2:
				comprobar = moverIzq(triv, dado, tab, girar);
				break;

			case 3:
				comprobar = moverNort(triv, dado, tab, girar);
				break;

			case 4:
				comprobar = moverSur(triv, dado, tab, girar);
				break;
				
			default:
				comprobar = false;
				break;

			}

		} while (comprobar == false);
		
		tab.establecerEqTablero(triv);
		if(girar) {
			tab.imprimeTablero();
		}

	}

	/**
	 * Este m�todo es el encargado de realizar el moviento para la derecha, su funcionamiento 
	 * comienza en el momento que el m�todo escogerMovimiento lo llama, pero cuando se encuentra 
	 * con una intersecci�n es el m�todo moverDer quien llama a  escogerMoviento.
	 *     
	 * @param triv es el equipo que se quiere mover.
	 * @param dado es el n�mero aleatorio que indica la cantidad de casillas que debe 
	 * mover el  equipo 
	 * @param tab tablero del juego.
	 * @param girar es una variable encargada de hacer girar al equipo para dende este se lo indique. 
	 * @return que se puede realizar el movimiento.
	 */
	public boolean moverDer(Equipo triv, int dado, Tablero tab, boolean girar) {
		int[] num = identifiCasilla(triv, tab.getCasillasTabl());
		boolean movi = true;
		
		
		tab.borrarEqTablero(triv);
		
		/*
		 * Este bucle  se repite  la cantidad de veces que nos de  el dado y tiene en su condici�n
		 * una variable booleana que debe ser true (verdadera) para que se ejecute.
		 */
		for (int i = 1; i <= dado && movi == true; i++) {
			if ((num[0] >= 0 && num[0] <= 6) && (num[1] + i >= 0 && num[1] + i <= 6)
					&& tab.getCasillasTabl()[num[0]][num[1] + i] != null) {
				switch (triv.getNumEq()) {
				case 1:
					triv.setPosEq(tab.getCasillasTabl()[num[0]][num[1] + i].getPosEq1());
					break;

				case 2:
					triv.setPosEq(tab.getCasillasTabl()[num[0]][num[1] + i].getPosEq2());
					break;

				case 3:
					triv.setPosEq(tab.getCasillasTabl()[num[0]][num[1] + i].getPosEq3());
					break;

				case 4:
					triv.setPosEq(tab.getCasillasTabl()[num[0]][num[1] + i].getPosEq4());
					break;
				}
				if (tab.getCasillasTabl()[num[0]][num[1] + i].isInterseccion() && i != dado) {
					escogerMovimiento(triv, dado - i, tab, true);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}
    /**
     * Este m�todo es el encargado de realizar el moviento para la izquierda, su funcionamiento 
	 * comienza en el momento que el m�todo escogerMovimiento lo llama, pero cuando se encuentra 
	 * con una intersecci�n es el m�todo moverIzq quien llama a  escogerMoviento.
     * @param triv es el equipo que se quiere mover.
     * @param dado es el n�mero aleatorio que indica la cantidad de casillas que debe 
     * mover el  equipo.
     * @param tab  tablero del juego.
     * @param girar es una variable encargada de hacer girar al equipo para dende este se lo indique.
     * @return que se puede realizar el movimiento. 
     */
	
	public boolean moverIzq(Equipo triv, int dado, Tablero tab, boolean girar) {
		int[] num = identifiCasilla(triv, tab.getCasillasTabl());
		boolean movi = true;
		
		tab.borrarEqTablero(triv);
		
		/*
		 * Este bucle  se repite  la cantidad de veces que nos de  el dado y tiene en su condici�n
		 * una variable booleana que debe ser true (verdadera) para que se ejecute.
		 */
		for (int i = 1; i <= dado; i++) {
			if ((num[0] >= 0 && num[0] <= 6) && (num[1] - i >= 0 && num[1] - i <= 6)
					&& tab.getCasillasTabl()[num[0]][num[1] - i] != null) {
				switch (triv.getNumEq()) {
				case 1:
					triv.setPosEq(tab.getCasillasTabl()[num[0]][num[1] - i].getPosEq1());
					break;

				case 2:
					triv.setPosEq(tab.getCasillasTabl()[num[0]][num[1] - i].getPosEq2());
					break;

				case 3:
					triv.setPosEq(tab.getCasillasTabl()[num[0]][num[1] - i].getPosEq3());
					break;

				case 4:
					triv.setPosEq(tab.getCasillasTabl()[num[0]][num[1] - i].getPosEq4());
					break;
				}
				if (tab.getCasillasTabl()[num[0]][num[1] - i].isInterseccion() && i != dado) {
					escogerMovimiento(triv, dado - i, tab, true);
					dado = 0;
				}
			} else
				movi = false;

		}
		return movi;
	}

	/**
	 * Este m�todo es el encargado de realizar el moviento para arriba, su funcionamiento 
	 * comienza en el momento que el m�todo escogerMovimiento lo llama, pero cuando se encuentra 
	 * con una intersecci�n es el m�todo moverNort quien llama a  escogerMoviento.
	 * 
     * @param triv es el equipo que se quiere mover.
	 * @param dado  es el n�mero aleatorio que indica la cantidad de casillas que debe 
     * mover el  equipo.
	 * @param tab tablero del juego.
	 * @param girar es una variable encargada de hacer girar al equipo para dende este se lo indique.
	 * @return que se puede realizar el movimiento.
	 */
	
	public boolean moverNort(Equipo triv, int dado, Tablero tab, boolean girar) {
		int[] num = identifiCasilla(triv, tab.getCasillasTabl());
		boolean movi = true;
		
		tab.borrarEqTablero(triv);
        /*
         * Este bucle  se repite  la cantidad de veces que nos de  el dado y tiene en su condici�n
		 * una variable booleana que debe ser true (verdadera) para que se ejecute.
         */
		for (int i = 1; i <= dado; i++) {
			if ((num[0] - i >= 0 && num[0] - i <= 6) && (num[1] >= 0 && num[1] <= 6)
					&& tab.getCasillasTabl()[num[0] - i][num[1]] != null) {
				switch (triv.getNumEq()) {
				case 1:
					triv.setPosEq(tab.getCasillasTabl()[num[0] - i][num[1]].getPosEq1());
					break;

				case 2:
					triv.setPosEq(tab.getCasillasTabl()[num[0] - i][num[1]].getPosEq2());
					break;

				case 3:
					triv.setPosEq(tab.getCasillasTabl()[num[0] - i][num[1]].getPosEq3());
					break;

				case 4:
					triv.setPosEq(tab.getCasillasTabl()[num[0] - i][num[1]].getPosEq4());
					break;
				}
				if (tab.getCasillasTabl()[num[0] - i][num[1]].isInterseccion() && i != dado) {
					escogerMovimiento(triv, dado - i, tab, true);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}

	/**
	 * Este m�todo es el encargado de realizar el moviento para abajo, su funcionamiento 
	 * comienza en el momento que el m�todo escogerMovimiento lo llama, pero cuando se encuentra 
	 * con una intersecci�n es el m�todo moverSur quien llama a  escogerMoviento.
	 * 
	 * @param triv  es el equipo que se quiere mover.
	 * @param dado es el n�mero aleatorio que indica la cantidad de casillas que debe 
     * mover el  equipo.
	 * @param tab tablero del juego.
	 * @param girar es una variable encargada de hacer girar al equipo para dende este se lo indique.
	 * @return  que se puede realizar el movimiento.
	 */
	public boolean moverSur(Equipo triv, int dado, Tablero tab, boolean girar) {
		int[] num = identifiCasilla(triv, tab.getCasillasTabl());
		boolean movi = true;
		
		tab.borrarEqTablero(triv);
		
		/*
		 * Este bucle  se repite  la cantidad de veces que nos de  el dado y tiene en su condici�n
		 * una variable booleana que debe ser true (verdadera) para que se ejecute.
		 */
		for (int i = 1; i <= dado; i++) {
			if ((num[0] + i >= 0 && num[0] + i <= 6) && (num[1] >= 0 && num[1] <= 6)
					&& tab.getCasillasTabl()[num[0] + i][num[1]] != null) {
				switch (triv.getNumEq()) {
				case 1:
					triv.setPosEq(tab.getCasillasTabl()[num[0] + i][num[1]].getPosEq1());
					break;

				case 2:
					triv.setPosEq(tab.getCasillasTabl()[num[0] + i][num[1]].getPosEq2());
					break;

				case 3:
					triv.setPosEq(tab.getCasillasTabl()[num[0] + i][num[1]].getPosEq3());
					break;

				case 4:
					triv.setPosEq(tab.getCasillasTabl()[num[0] + i][num[1]].getPosEq4());
					break;
				}
				if (tab.getCasillasTabl()[num[0] + i][num[1]].isInterseccion() && i != dado) {
					escogerMovimiento(triv, dado - i, tab, true);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}

	
	/**
	 * M�todo  para identificar la casilla donde se encuentra el equipo en ese momento. 
	 * @param triv es el equipo que se quiere mover.
	 * @param punto es el array bidimencional donde se encuentran las casillas del tablero.
	 * @return la posici�n de la casilla.
	 */
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
		salir = false;

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
