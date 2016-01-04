package felipe;
import java.util.Arrays;
import java.util.Random;
import leer_por_teclado.Leer;
import carlos.Equipo;
import carlos.Tablero;

public class Trivial {
	//ATRIBUTOS
	Equipo eq1;
	Equipo eq2;
	Equipo eq3;
	Equipo eq4;
	Equipo[] turno;
	Tablero tab= new Tablero();
	
	
	//CONSTRUCTORES
	public Trivial() {
			
		
		/*
		 * Llamar a un método para escoger
		 * aleatoriamente el turno por equipos/
		 * jugadores
		 */
	}
	
	
	//M�TODOS
	
	
	
	
	
	//ladilla termina switch de elecion de jugadores
	public void jugarPartida(){
		int jug, menu, dado;
		
		
		
		System.out.println("Indicamelo churrita:");
		System.out.println("1.alone in the world");
		System.out.println("2.sa pe�a");
		menu=Leer.datoInt();
		
		switch(menu){
		case 1:
			
			do {
				System.out.println("indica cuantos jugadores sois\nrecuerda que maximo cuatro jugadores:");
				jug=Leer.datoInt();
			
				if (jug<=4 && jug>0){
						
						//ladilla el syso se cambia por el metodo german
						
						cogerNombre(jug, false);
						
					
				}else{
					System.out.println("pichita te estas equivocando");
				}
				}while(jug>4 && jug<=0);
			break;
			
		case 2:
			//TODO  ladilla meter bucles
			System.out.println("indica cuantos equipos sois\nrecuerda que maximo cuatro equipos:");
			jug=Leer.datoInt();
			if(jug<=4 && jug>0){
				
				//ladilla el syso se cambia por el metodo german
				
				cogerNombre(jug, true);
				
				
				
			}else{
				System.out.println("churri te has colao");
			}
			
			break;
		
		default:
			System.out.println("no se contempla esa opcion");
			break;
		
		}
		
		for (int i = 0; i < turno.length; i++) {
			tab.imprimeTablero();
			System.out.println("El es el turno de"+turno[i].getNombreEq());
			dado=lanzarDado();
			System.out.println(dado);
		}
		
		
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//ladilla metodo para tirar el dado para saber los movimientos
	public int lanzarDado(){
		int num,hasta=6, desde=1;
		System.out.println("Intro para tirar los dados");
		Leer.dato();
		Random numAle= new Random();
		num=numAle.nextInt(hasta-desde+1)+desde;
		return num;
	}
	
	
	
	
	
	
	//ladilla pide los nombres de los jugadores y distribuye con un metodo el orden de los turnos
	public void cogerNombre(int jug, boolean tipoEquipo) {
		int  numJ=1;
		String nomJug;
		
		
		turno= new Equipo[jug];
		
		for(int i=0;i<jug;i++){
			
			if(tipoEquipo){
				System.out.println("Diga el nombre del equipo "+numJ+"(Min 3 caracteres):");
			}else{
				System.out.println("Diga el nombre del jugador "+numJ+"(Min 3 caracteres):");
			}
			do{
			nomJug=Leer.dato();
			if(nomJug.length()<3){
			System.out.println("El nombre debe de tener minimo 3 caractereres.");
			}
			}while(nomJug.length()<3);
			numJ++;
			
			switch(i) {
				case 0:
					eq1=new Equipo(nomJug, tipoEquipo);
					atribuirTurno(eq1);
					tab.establecerEqTablero(eq1);
					break;
			
				case 1:
					eq2=new Equipo(nomJug, tipoEquipo);
					atribuirTurno(eq2);
					tab.establecerEqTablero(eq2);
					break;
			
				case 2:
					eq3=new Equipo(nomJug,tipoEquipo);
					atribuirTurno(eq3);
					tab.establecerEqTablero(eq3);
					break;
			
				case 3:
					eq4=new Equipo(nomJug, tipoEquipo );
					atribuirTurno(eq4);
					tab.establecerEqTablero(eq4);
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
	
	
		public Tablero getTab() {
			return tab;
		}


		public void setTab(Tablero tab) {
			this.tab = tab;
		}
}
