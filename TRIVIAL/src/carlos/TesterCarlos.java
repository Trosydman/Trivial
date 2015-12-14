package carlos;

import leer_por_teclado.Leer;

public class TesterCarlos {

	public static void main(String[] args) {
		Tablero tabl = new Tablero();
		Equipo eq;
		
		tabl.imprimeTablero();
		
		tabl.identificaCasilla();
		
		for (int i = 0; i < Tablero.casillasTabl.length; i++) {
			for (int j = 0; j < Tablero.casillasTabl[i].length; j++) {
				System.out.println(Tablero.casillasTabl[i][j]);
			}
		}
		String jug1;
		String[] jugadores = new String [6];
		
		System.out.println("Primer jugador:");
		jug1 = Leer.dato();
		jugadores[0] = jug1;
		eq = new Equipo(Leer.dato()/*NOMBRE EQUIPO*/, jugadores);
		System.out.println(eq);
	}

}
