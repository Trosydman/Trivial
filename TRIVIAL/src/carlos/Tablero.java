package carlos;

public class Tablero {
	String[][] tableroBI = new String[28][69];
	Casilla[][] casillasTabl = new Casilla[7][7];
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

	public Tablero() {
		for (int i = 0; i < tablero.length; i++) {
			tableroBI[i] = tablero[i].split("");
		}
		identificaCasilla();
	}
	
	public void identificaCasilla() {
		int contCasFIL = 0;
		int contCasCOL = 0;

		for (int i = 0; i < tableroBI.length; i += 4) {
			for (int j = 0; j < tableroBI[i].length; j += 10) {
				if (tableroBI[i][j] != " ") {
					//TODO tal vez le venga mejor un switch...
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

					if (!(tableroBI[i][j].equals("=")) && tableroBI[i][j + 1].equals("=")) {
						casillasTabl[contCasFIL][contCasCOL].setQuesito(true);
					}
					contCasCOL++;
				}
			}
			contCasFIL++;
			contCasCOL = 0;
		}

	}

	public void imprimeTablero() {
		for (int i = 0; i < tableroBI.length; i++) {
			for (int j = 0; j < tableroBI[i].length; j++) {
				System.out.print(tableroBI[i][j]);
			}
			System.out.println();
		}
	}
	
	public void establecerEqTablero(Equipo eq) {
		for (int i = 0; i < 3; i++) {
			if(eq.getJugador() != null)
				tableroBI[eq.getPosEq()[0]][eq.getPosEq()[1]+i]=eq.getJugador().substring(0,3).toUpperCase().substring(i, i+1);
			else
				tableroBI[eq.getPosEq()[0]][eq.getPosEq()[1]+i]=eq.getNombreEq().substring(0,3).toUpperCase().substring(i, i+1);
		}
	}

	public Casilla[][] getCasillasTabl() {
		return casillasTabl;
	}

}
