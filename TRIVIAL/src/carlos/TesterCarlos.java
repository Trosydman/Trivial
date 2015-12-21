package carlos;

public class TesterCarlos {

	public static void main(String[] args) {
		Tablero tabl = new Tablero();
		Equipo eqJug=new Equipo("Carlos");
		String[] jug = {"Carlos", "Felipe", "Alex", "Germán", "Norberto"};
		Equipo eqEq= new Equipo("DAM", jug);
		
		System.out.println(eqJug+"\n\n"+eqEq);
		
		
		tabl.imprimeTablero();
		
		for (int i = 0; i < 3; i++) {
			tabl.tableroBI[eqJug.getPosEq()[0]][eqJug.getPosEq()[1]+i]=eqJug.getJugadores()[0].substring(0,3).toUpperCase().substring(i, i+1);
		}
		
		tabl.imprimeTablero();
		
		for (int i = 0; i < 3; i++) {
			tabl.tableroBI[eqEq.getPosEq()[0]][eqEq.getPosEq()[1]+i]=eqEq.getNombreEq().substring(0,3).toUpperCase().substring(i, i+1);
		}
		
		tabl.imprimeTablero();
		
		tabl.identificaCasilla();
		
		for (int i = 0; i < tabl.casillasTabl.length; i++) {
			for (int j = 0; j < tabl.casillasTabl[i].length; j++) {
				System.out.println(tabl.casillasTabl[i][j]);
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
