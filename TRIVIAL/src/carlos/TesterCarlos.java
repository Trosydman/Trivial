package carlos;

import norberto.Movimiento;

public class TesterCarlos {

	public static void main(String[] args) {
		Tablero tabl = new Tablero();
		Movimiento mov = new Movimiento();
		
		//PROBANDO CON JUGADORES
		Equipo eqJug1=new Equipo("Carlos", false);
		Equipo eqJug2=new Equipo("Felipe", false);
		Equipo eqJug3= new Equipo("Germán", false);
		Equipo eqJug4= new Equipo("Norberto", false);
		
		System.out.println(eqJug1+"\n\n"+eqJug2+"\n\n"+eqJug3+"\n\n"+eqJug4);
		
		tabl.establecerEqTablero(eqJug1);
		tabl.establecerEqTablero(eqJug2);
		tabl.establecerEqTablero(eqJug3);
		tabl.establecerEqTablero(eqJug4);
		System.out.println();
		tabl.imprimeTablero();
		
//		tabl.borrarEqTablero(eqJug1);
//		System.out.println("\nMoviendo a la derecha a Carlos");
//		mov.moverIzq(eqJug1, 1, tabl.getCasillasTabl());
//		tabl.establecerEqTablero(eqJug1);
//		System.out.println(eqJug1);
//		tabl.imprimeTablero();
//		tabl.borrarEqTablero(eqJug1);
		
		//PROBANDO CON EQUIPOS
		Equipo eqEq1=new Equipo("Actimel", true);
		Equipo eqEq2=new Equipo("DuoDinámico", true);
		Equipo eqEq3= new Equipo("AC DC", true);
		Equipo eqEq4= new Equipo("DAM", true);
		
		System.out.println(eqEq1+"\n\n"+eqEq2+"\n\n"+eqEq3+"\n\n"+eqEq4);
		
		tabl.establecerEqTablero(eqEq1);
		tabl.establecerEqTablero(eqEq2);
		tabl.establecerEqTablero(eqEq3);
		tabl.establecerEqTablero(eqEq4);
		System.out.println();
		tabl.imprimeTablero();
		
		for (int i = 0; i < tabl.casillasTabl.length; i++) {
			for (int j = 0; j < tabl.casillasTabl[i].length; j++) {
				System.out.println(tabl.casillasTabl[i][j]);
			}
		}
		
	}

}
