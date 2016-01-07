package norberto;

import java.util.Random;

import carlos.Equipo;
import carlos.Tablero;

public class TesterNorberto {

	public static void main(String[] args) {
		
		Movimiento mov=new Movimiento();
		Equipo equip=new Equipo("AAA", true);
		Tablero tablet=new Tablero();
		Random numale= new Random(System.nanoTime());
		System.out.println(equip.toString());
		tablet.establecerEqTablero(equip);
		tablet.imprimeTablero();
		
		
		mov.escogerMovimiento(equip, numale.nextInt(6-1 +1)+1, tablet.getCasillasTabl());
	    tablet.establecerEqTablero(equip);
		tablet.imprimeTablero();
		System.out.println(equip.toString());
		
		

	}

}
