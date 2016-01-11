package norberto;

import java.util.Random;

import carlos.Equipo;
import carlos.Tablero;

public class TesterNorberto {

	public static void main(String[] args) {
		
		Movimiento mov=new Movimiento();
		
		Equipo equip=new Equipo(1, "AAA", true);
		Equipo equip2 = new Equipo(2, "BBB", true);
		Equipo equip3 = new Equipo(3, "CCC", true);
		Equipo equip4 = new Equipo(4, "DDD", true);
		
		Tablero tablet=new Tablero();
		Random numale= new Random(System.nanoTime());
		int dado = numale.nextInt(6-1 +1)+1;
		
		System.out.println(equip4.toString());
		tablet.establecerEqTablero(equip4);
		tablet.imprimeTablero();
		System.out.println(dado);
		System.out.println();
		mov.escogerMovimiento(equip4, dado, tablet, false);
	    tablet.establecerEqTablero(equip4);
		tablet.imprimeTablero();
		System.out.println(equip4.toString());
		
		

	}

}
