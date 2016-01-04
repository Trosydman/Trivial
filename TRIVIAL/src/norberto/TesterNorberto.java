package norberto;

import carlos.Equipo;
import carlos.Tablero;

public class TesterNorberto {

	public static void main(String[] args) {
		
		Movimiento mov=new Movimiento();
		Equipo equip=new Equipo("AAA", true);
		Tablero tablet=new Tablero();
		
		System.out.println(equip.toString());
		tablet.establecerEqTablero(equip);
		tablet.imprimeTablero();
		
		
		mov.moverNort(equip, 4, tablet.getCasillasTabl());
	    tablet.establecerEqTablero(equip);
		tablet.imprimeTablero();
		System.out.println(equip.toString());
		
		

	}

}
