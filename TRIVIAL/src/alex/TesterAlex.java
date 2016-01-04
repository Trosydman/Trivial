package alex;


import carlos.Equipo;
import carlos.Tablero;

public class TesterAlex {

	public static void main(String[] args) {

	
		ListadoPreguntas list = new ListadoPreguntas();
		Equipo Malandrines = new Equipo("Malandrines",true);
		
		Tablero tab1 = new Tablero();
		
		
	
		
		System.out.println("\nPREGUNTA DE PROGRAMACIÓN\n");
		list.imprimirPregPROG();
		
		System.out.println("\nPREGUNTA DE BASE DE DATOS\n");
		list.imprimirPregBBDD();
		
		System.out.println("\nPREGUNTA DE SISTEMAS\n");
		list.imprimirPregSIS();
		
		System.out.println("\nPREGUNTA DE HTML\n");
		list.imprimirPregHTML();
		
		System.out.println("\nPREGUNTA DEL COLEGIO\n");
		list.imprimirPregCOL();
		
		
		list.darQuesito(tab1.getCasillasTabl()[0][3],Malandrines);
		System.out.println(Malandrines.toString());
		
		
		
				
				
				
				
				
			
				
				
		
		
		
		
	}

}
