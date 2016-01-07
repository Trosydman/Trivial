package norberto;

import com.sun.media.sound.SimpleSoundbank;

import carlos.Casilla;
import carlos.Equipo;
import leer_por_teclado.Leer;

public class Movimiento {

	int intro;

	// MÉTODOS
	public boolean moverDer(Equipo x, int dado, Casilla[][] pos) {
		int[] num = identifiCasilla(x, pos);
		boolean movi = true;
		for (int i = 1; i <= dado && movi == true; i++) {
			if ((num[0] >= 0 && num[0] <= 6) && (num[1] + i >= 0 && num[1] + i <= 6)) {
				switch (x.getNumEq()) {
				case 1:
					x.setPosEq(pos[num[0]][num[1] + i].getPosEq1());
					break;

				case 2:
					x.setPosEq(pos[num[0]][num[1] + i].getPosEq2());
					break;

				case 3:
					x.setPosEq(pos[num[0]][num[1] + i].getPosEq3());
					break;

				case 4:
					x.setPosEq(pos[num[0]][num[1] + i].getPosEq4());
					break;
				default:
					System.out.println("Este equipo no existe.");
					break;
				}
				if (pos[num[0]][num[1] + i].isInterseccion() && i >= 2 && i != dado) {
					escogerMovimiento(x, dado - i, pos);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}

	public boolean moverIzq(Equipo x, int dado, Casilla[][] pos) {
		int[] num = identifiCasilla(x, pos);
		boolean movi = true;
		for (int i = 1; i <= dado; i++) {
			if ((num[0] >= 0 && num[0] <= 6) && (num[1] - i >= 0 && num[1] - i <= 6)) {
				switch (x.getNumEq()) {
				case 1:
					x.setPosEq(pos[num[0]][num[1] - i].getPosEq1());
					break;

				case 2:
					x.setPosEq(pos[num[0]][num[1] - i].getPosEq2());
					break;

				case 3:
					x.setPosEq(pos[num[0]][num[1] - i].getPosEq3());
					break;

				case 4:
					x.setPosEq(pos[num[0]][num[1] - i].getPosEq4());
					break;
				default:
					System.out.println("Este equipo no existe.");
					break;
				}
				if (pos[num[0]][num[1] - i].isInterseccion() && i >= 2 && i != dado) {
					escogerMovimiento(x, dado - i, pos);
					dado = 0;
				}
			} else
				movi = false;

		}
		return movi;
	}

	public boolean moverNort(Equipo x, int dado, Casilla[][] pos) {
		int[] num = identifiCasilla(x, pos);
		boolean movi = true;
		for (int i = 1; i <= dado; i++) {
			if ((num[0] - i >= 0 && num[0] - i <= 6) && (num[1] >= 0 && num[1] <= 6)) {
				switch (x.getNumEq()) {
				case 1:
					x.setPosEq(pos[num[0] - i][num[1]].getPosEq1());
					break;

				case 2:
					x.setPosEq(pos[num[0] - i][num[1]].getPosEq2());
					break;

				case 3:
					x.setPosEq(pos[num[0] - i][num[1]].getPosEq3());
					break;

				case 4:
					x.setPosEq(pos[num[0] - i][num[1]].getPosEq4());
					break;
				default:
					System.out.println("Este equipo no existe.");
					break;
				}
				if (pos[num[0] - i][num[1]].isInterseccion() && i >= 2 && i != dado) {
					escogerMovimiento(x, dado - i, pos);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}

	public boolean moverSur(Equipo x, int dado, Casilla[][] pos) {
		int[] num = identifiCasilla(x, pos);
		boolean movi = true;
		for (int i = 1; i <= dado; i++) {
			if ((num[0] + i >= 0 && num[0] + i <= 6) && (num[1] >= 0 && num[1] <= 6)) {
				switch (x.getNumEq()) {
				case 1:
					x.setPosEq(pos[num[0] + i][num[1]].getPosEq1());
					break;

				case 2:
					x.setPosEq(pos[num[0] + i][num[1]].getPosEq2());
					break;

				case 3:
					x.setPosEq(pos[num[0] + i][num[1]].getPosEq3());
					break;

				case 4:
					x.setPosEq(pos[num[0] + i][num[1]].getPosEq4());
					break;
				default:
					System.out.println("Este equipo no existe.");
					break;
				}
				if (pos[num[0] + i][num[1]].isInterseccion() && i >= 2 && i != dado) {
					escogerMovimiento(x, dado - i, pos);
					dado = 0;
				}
			} else
				movi = false;
		}
		return movi;
	}

	
	
	public int[] identifiCasilla(Equipo uno, Casilla[][] pos) {
		int posit[] = new int[2];
		boolean salir = false;
		for (int i = 0; i < pos.length && salir == false; i++) {
			if (uno.getPosEq()[0] == pos[i][0].getPosEq1()[0]) {
				posit[0] = i;
				i = 0;
				for (int j = 0; j < pos[i].length && salir == false; j++) {
					if (uno.getPosEq()[1] == pos[i][j].getPosEq1()[1]) {

						posit[1] = j;
						salir = true;
					}

				}

			}

		}
		return posit;
	}

	public void escogerMovimiento(Equipo x, int dado, Casilla[][] pos) {
		boolean comprobar = true;
		do {
			if (comprobar == false) {
				System.out.println("no puedes realizar este movimiento, escoge otro");
			}
			System.out.println("Para donde quieres moverte.\n" + "Pulsa 1 para ir a la derecha.\n"
					+ "Pulsa 2 Para ir a la Izquierda.\n" + "Pulsa 3 Para ir arriba.\n" + "Pulsa 4 para ir abajo.\n");
			intro = Leer.datoInt();
			switch (intro) {
			case 1:
				comprobar = moverDer(x, dado, pos);
				break;

			case 2:
				comprobar = moverIzq(x, dado, pos);
				break;

			case 3:
				comprobar = moverNort(x, dado, pos);
				break;

			case 4:
				comprobar = moverSur(x, dado, pos);
				break;

			}

		} while (comprobar == false);

	}

}
