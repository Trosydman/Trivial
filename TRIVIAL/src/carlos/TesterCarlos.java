package carlos;

public class TesterCarlos {

	public static void main(String[] args) {
		Tablero tabl = new Tablero();
		Equipo eqJug=new Equipo("Carlos");
		String[] jug = {"Carlos", "Felipe", "Alex", "Germán", "Norberto"};
		Equipo eqEq= new Equipo("DAM", jug);
		
		System.out.println(eqJug+"\n\n"+eqEq);
		
		
		tabl.imprimeTablero();
		tabl.identificaCasilla();
		
		for (int i = 0; i < Tablero.casillasTabl.length; i++) {
			for (int j = 0; j < Tablero.casillasTabl[i].length; j++) {
				System.out.println(Tablero.casillasTabl[i][j]);
			}
		}
//		String jug1;
//		String[] jugadores = new String [6];
//		
//		System.out.println("Primer jugador:");
//		jug1 = Leer.dato();
//		jugadores[0] = jug1;
//		eq = new Equipo(Leer.dato()/*NOMBRE EQUIPO*/, jugadores);
//		System.out.println(eq);
	}

}
