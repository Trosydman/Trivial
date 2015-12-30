package felipe;
import java.util.Arrays;
import java.util.Random;
import leer_por_teclado.Leer;
import carlos.Equipo;

public class Trivial {
	//ATRIBUTOS
	Equipo eq1;
	Equipo eq2;
	Equipo eq3;
	Equipo eq4;
	Equipo[] turno;
	
	
	//CONSTRUCTORES
	public Trivial() {
		
	
	
	
	//la cantidad de jugadores/equipos se mete por teclado
		
		/*
		 * Preguntar: individual o por grupos?
		 * 
		 * 
		 * INDIVIDUAL: Pedir nombre de los jugadores
		 * GRUPOS: Pedir número de jugadores
		 * 		   Pedir nombre equipo.
		 */
		
		
		/*
		 * Llamar a un método para escoger
		 * aleatoriamente el turno por equipos/
		 * jugadores
		 */
	}
	
	
	//M�TODOS
	
	
	
	
	
	//ladilla termina switch de elecion de jugadores
	public void jugarPartida(){
		int jug, menu;
		
		
		
		System.out.println("Indicamelo churrita:");
		System.out.println("1.alone in the world");
		System.out.println("2.sa pe�a");
		menu=Leer.datoInt();
		
		switch(menu){
		case 1:
			
			do {
				System.out.println("indica cuantos sois\nrecuerda que maximo cuatro jugadores:");
				jug=Leer.datoInt();
			
				if (jug<=4 && jug>0){
						
						//ladilla el syso se cambia por el metodo german
						
						cogerNombre(jug);
						
					
				}else{
					System.out.println("pichita te estas equivocando");
				}
				}while(jug>4 && jug<=0);
			break;
			
		case 2:
			//TODO  ladilla meter bucles
			System.out.println("indica cuantos sois\nrecuerda que maximo cuatro jugadores:");
			jug=Leer.datoInt();
			if(jug<=4 && jug>0){
				
				//ladilla el syso se cambia por el metodo german
				
				cogerNombre(jug);
				
				
				
			}else{
				System.out.println("churri te has colao");
			}
			
			break;
		
		default:
			System.out.println("no se contempla esa opcion");
			break;
		
		}
		System.out.println(eq1);
		System.out.println(eq2);
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//ladilla metodo para tirar el dado para saber los movimientos
	public int dado(){
		int num,hasta=6, desde=1;
		System.out.println("Intro para tirar los dados");
		Leer.dato();
		Random numAle= new Random();
		num=numAle.nextInt(hasta-desde+1)+desde;
		return num;
	}
	
	
	
	
	
	
	//ladilla pide los nombres de los jugadores y distribuye con un metodo el orden de los turnos
	public void cogerNombre(int jug) {
		int  numJ=1;
		String nomJug;
		
		
		turno= new Equipo[jug];
		
		for(int i=0;i<jug;i++){
			System.out.println("Diga el nombre del jugador "+numJ+":");
			nomJug=Leer.dato();
			numJ++;
			
			switch(i) {
				case 0:
					eq1=new Equipo(nomJug);
					atribuirTurno(eq1);
					break;
			
				case 1:
					eq2=new Equipo(nomJug);
					atribuirTurno(eq2);
					break;
			
				case 2:
					eq3=new Equipo(nomJug);
					atribuirTurno(eq3);
					break;
			
				case 3:
					eq4=new Equipo(nomJug);
					atribuirTurno(eq4);
					break;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	// ladilla metodo para asignar turno aleatoriamente
	
	
		public void atribuirTurno(Equipo eqTurn){
			
			int num,hasta=turno.length-1,desde=0;
			boolean fin = false;
			
			do {
				Random numAle=new Random();
				num=numAle.nextInt(hasta-desde+1)+desde;
				if(turno[num]==null){
					turno[num]=eqTurn;
					fin = true;
				}
			}while(turno[num]!=null && fin == false);
		}
	
	
	
	
	
	
	
	
	//GETTERS, SETTERS Y TOSTRINGS
	
	
	
}
