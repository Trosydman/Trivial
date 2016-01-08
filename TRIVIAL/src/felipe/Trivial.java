package felipe;
import java.util.Arrays;
import java.util.Random;
import leer_por_teclado.Leer;
import norberto.Movimiento;
import carlos.Equipo;
import carlos.Tablero;
import alex.ListadoPreguntas;

public class Trivial {
	//ATRIBUTOS
	Equipo eq1;
	Equipo eq2;
	Equipo eq3;
	Equipo eq4;
	Equipo[] turno;
	ListadoPreguntas cache=new ListadoPreguntas();
	Tablero tab= new Tablero();
	Movimiento mov = new Movimiento();
	
	
	//CONSTRUCTORES
	public Trivial() {
			
	}
	
	
	//MÉTODOS
	
	
	//ladilla termina switch de elecion de jugadores
	public void jugarPartida(){
		int jug, menu, i=0,dado;
		boolean comproB=true;
		
		do{
		
		System.out.println("Indicamelo churrita:");
		System.out.println("1.alone in the world");
		System.out.println("2.sa pe�a");
		menu=Leer.datoInt();
		}while(menu<0 &&  menu >=2);
		
		switch(menu){
		case 1:
			
			comproB=false;
			do {
				System.out.println("indica cuantos jugadores sois\nrecuerda que maximo cuatro jugadores:");
				jug=Leer.datoInt();
			
				if (jug<=4 && jug>0){
						
						//TODO ladilla el syso se cambia por el metodo german
						cogerNombre(jug, comproB);
						
					
				}else{
					System.out.println("El numero de jugadores no es el correcto\n");
				}
			}while(jug>4 || jug<=0);
			break;
			
		case 2:
			
			
			do{
				System.out.println("indica cuantos equipos sois\nrecuerda que maximo cuatro equipos:");
				jug=Leer.datoInt();
				if(jug<=4 && jug>0){
				
				//TODO ladilla el syso se cambia por el metodo german
				
					cogerNombre(jug, comproB);
				
				}else{
				System.out.println("El numero de jugadores no es el correcto\n");
				}
			
			}while(jug>4 || jug<=0);
			break;
		
		default:
			System.out.println("no se contempla esa opcion");
			break;
		
		}
		
		
		do{
			
			tab.imprimeTablero();
			
			if(comproB){
			System.out.println("Es el turno de "+turno[i].getNombreEq());
			}else{
				System.out.println("Es el turno de "+turno[i].getJugador());
			}
			dado=lanzarDado();
			System.out.println(dado);
			
			tab.borrarEqTablero(turno[i]);
			mov.escogerMovimiento(turno[i], dado, tab.getCasillasTabl());
			tab.establecerEqTablero(turno[i]);
			tab.imprimeTablero();
			
			
			if(cache.imprimirPregBBDD()==false){
			i++;
			if(i==turno.length){
				i=0;
			}
			}
			
			
		}while(comprobarAllQuesitos(turno[i]) || i<turno.length);
		
		
		
		
		
		
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
					System.out.println("El nombre debe de tener minimo 3 caractereres.\n Prueba de nuevo: ");
				}
				}while(nomJug.length()<3);				
			
				switch(i) {
					case 0:
						eq1=new Equipo(numJ, nomJug, tipoEquipo);
						atribuirTurno(eq1);
						tab.establecerEqTablero(eq1);
						break;
			
					case 1:
						eq2=new Equipo(numJ, nomJug, tipoEquipo);
						atribuirTurno(eq2);
						tab.establecerEqTablero(eq2);
						break;
			
					case 2:
						eq3=new Equipo(numJ, nomJug,tipoEquipo);
						atribuirTurno(eq3);
						tab.establecerEqTablero(eq3);
						break;
			
					case 3:
						eq4=new Equipo(numJ, nomJug, tipoEquipo );
						atribuirTurno(eq4);
						tab.establecerEqTablero(eq4);
						break;
				}
				numJ++;
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
		
	/* ladilla metodo para comprobar ganador y establecer fin del juego. 
	 * Se utilizara como condicion para salir del bucle que cogera al metodo jugarpartida.
	 */

		public boolean comprobarAllQuesitos(Equipo eq){
			boolean [] proB =eq.getQuesitos();
			boolean fin = true;
			
			for(int i=0;i<proB.length && fin==true;i++){
				
				if(false==proB[i]){
					fin = false;
				}
			}	
			return fin;
		}
	
	
	
	
	
	
	
	
	//GETTERS, SETTERS Y TOSTRINGS
	
	
		public Tablero getTab() {
			return tab;
		}


		public void setTab(Tablero tab) {
			this.tab = tab;
		}
}
