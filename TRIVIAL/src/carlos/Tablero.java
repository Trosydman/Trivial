package carlos;

/**
 * Gestiona todo tipo de acciones con el tablero y ademas lo crea.
 *
 * @author Carlos Mesquita Mansilla
 *
 */
public class Tablero {
	/**
	 * Array bidimensional, donde se guardan todos los caracteres del tablero.
	 */
	String[][] tableroBI = new String[28][69];
	/**
	 * Array bidimensional con las {@link Casilla casillas} del tablero en orden de disposicion.
	 */
	Casilla[][] casillasTabl = new Casilla[7][7];
	/**
	 * Array donde se guardan los diferentes Strings para despues utilizarlo en {@link #Tablero() Tablero()}
	 */
	String[] tablero = { "********* +++++++++ ///////// *===*===* --------- +++++++++ /////////",
			"*       * +       + /       / =       = -       - +       + /       /",
			"*       * +       + /       / =       = -       - +       + /       /",
			"********* +++++++++ ///////// *===*===* --------- +++++++++ /////////",
			"---------                     +++++++++                     ---------",
			"-       -                     +       +                     -       -",
			"-       -                     +       +                     -       -",
			"---------                     +++++++++                     ---------",
			"+++++++++                     /////////                     *********",
			"+       +                     /       /                     *       *",
			"+       +                     /       /                     *       *",
			"+++++++++                     /////////                     *********",
			"/===/===/ --------- +++++++++ ========= ********* ///////// +===+===+",
			"=       = -       - +       + =       = *       * /       / =       =",
			"=       = -       - +       + =       = *       * /       / =       =",
			"/===/===/ --------- +++++++++ ========= ********* ///////// +===+===+",
			"*********                     ---------                     ---------",
			"*       *                     -       -                     -       -",
			"*       *                     -       -                     -       -",
			"*********                     ---------                     ---------",
			"---------                     /////////                     +++++++++",
			"-       -                     /       /                     +       +",
			"-       -                     /       /                     +       +",
			"---------                     /////////                     +++++++++",
			"+++++++++ ///////// ********* -===-===- +++++++++ ///////// *********",
			"+       + /       / *       * =       = +       + /       / *       *",
			"+       + /       / *       * =       = +       + /       / *       *",
			"+++++++++ ///////// ********* -===-===- +++++++++ ///////// *********" };

	/**
	 * Constructor vacio que divide los String del array de {@link #tablero} en caracteres y los introduce en
	 * {@link #tableroBI}
	 */
	public Tablero() {
		for (int i = 0; i < tablero.length; i++) {
			tableroBI[i] = tablero[i].split("");
		}
		identificaCasilla();
	}

	/**
	 * Metodo que obtiene de {@link #tableroBI} las caracteristicas de cada {@link Casilla} para introducirlas en {@link #casillasTabl}
	 */
	public void identificaCasilla() {
		int contCasFIL = 0;
		int contCasCOL = 0;

		for (int i = 0; i < tableroBI.length; i += 4) {
			for (int j = 0; j < tableroBI[i].length; j += 10) {
				if (tableroBI[i][j] != " ") {
					if (tableroBI[i][j].equals("*")) {
						casillasTabl[contCasFIL][contCasCOL] = new Casilla(i + 1, j + 1, Casilla.PROG);
					} else if (tableroBI[i][j].equals("-")) {
						casillasTabl[contCasFIL][contCasCOL] = new Casilla(i + 1, j + 1, Casilla.BBDD);
					} else if (tableroBI[i][j].equals("+")) {
						casillasTabl[contCasFIL][contCasCOL] = new Casilla(i + 1, j + 1, Casilla.HTML);
					} else if (tableroBI[i][j].equals("/")) {
						casillasTabl[contCasFIL][contCasCOL] = new Casilla(i + 1, j + 1, Casilla.SIS);
					} else if (tableroBI[i][j].equals("=")) {
						casillasTabl[contCasFIL][contCasCOL] = new Casilla(i + 1, j + 1, Casilla.COL);
					}

					if (tableroBI[i][j + 1].equals("=")) {
						casillasTabl[contCasFIL][contCasCOL].setQuesito(true);
					}
					contCasCOL++;
				}
			}
			contCasFIL++;
			contCasCOL = 0;
		}
		comprobInters();

	}

	/**
	 * Metodo que comprueba si las {@link Casilla casillas} de {@link #casillasTabl} son intersecciones o no
	 */
	private void comprobInters() {
		for(int i = 0; i < casillasTabl.length; i++) {
			for (int j = 0; j < casillasTabl[i].length; j++) {
				if((i==0 && j==0) || (i==0 && j==3) || (i==0 && j==6) ||
						(i==3 && j==0) || (i==3 && j==3) || (i==3 && j==6)
						|| (i==6 && j==0) || (i==6 && j==3) || (i==6 && j==6)) {
					casillasTabl[i][j].setInterseccion(true);
				}
			}
		}
	}

	/**
	 * Metodo que imprime el tablero dejando una tabulacion a su izquierda
	 */
	public void imprimeTablero() {
		for (int i = 0; i < tableroBI.length; i++) {
			for (int j = 0; j < tableroBI[i].length; j++) {
				if(i==0 && j==0)
					System.out.print("\t\t");
				System.out.print(tableroBI[i][j]);
			}
			System.out.print("\n\t\t");
		}
		System.out.println("");
	}

	/**
	 * Metodo que coge la ficha de ese {@link Equipo equipo} y la establece dentro del {@link #tableroBI tablero}
	 *
	 * @param eq equipo que este jugando en ese momento
	 */
	public void establecerEqTablero(Equipo eq) {
		for (int i = 0; i < 3; i++) {
			if(eq.getJugador() != null)
				tableroBI[eq.getPosEq()[0]][eq.getPosEq()[1]+i]=eq.getJugador().substring(0,3).toUpperCase().substring(i, i+1);
			else
				tableroBI[eq.getPosEq()[0]][eq.getPosEq()[1]+i]=eq.getNombreEq().substring(0,3).toUpperCase().substring(i, i+1);
		}
	}

	/**
	 * Metodo que coge la ficha de ese {@link Equipo equipo} y la borra de dentro del {@link #tableroBI tablero}
	 *
	 * @param eq equipo que este jugando en ese momento
	 */
	public void borrarEqTablero(Equipo eq) {
		for (int i = 0; i < 3; i++) {
			if(eq.getJugador() != null)
				tableroBI[eq.getPosEq()[0]][eq.getPosEq()[1]+i]=" ";
			else
				tableroBI[eq.getPosEq()[0]][eq.getPosEq()[1]+i]=" ";
		}
	}

	public Casilla[][] getCasillasTabl() {
		return casillasTabl;
	}

}
