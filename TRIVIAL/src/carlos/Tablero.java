package carlos;

public class Tablero {
	String[][] tableroBI = new String[28][69];
	static Casilla[][] casillasTabl = new Casilla[7][7];
	// String princTab = "┏━━━━━━━━━━━━━━━━━━━━ ━━━━━━━━━━━━━━━━━━━━┓";
	// String finTab = "┗━━━━━━━━━━━━━━━━━━━━ ━━━━━━━━━━━━━━━━━━━━┛";
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

	public void imprimeTablero() {
		// System.out.println(princTab);
		for (int i = 0; i < tableroBI.length; i++) {
			for (int j = 0, cont = 1; j < tableroBI[i].length; j++) {
				System.out.print(tableroBI[i][j]);
				if (cont == tablero[i].length()) {
					System.out.println("");
					cont = 1;
				} else
					cont++;
			}
		}
		// System.out.println(finTab);
	}

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

}
