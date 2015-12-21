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
	//TODO termina switch de elecion de jugadores
	public void jugarPartida(){
		int menu;
		int jug;
		String nomJug;
		System.out.println("Indicamelo churrita:");
		System.out.println("1.alone in the world");
		System.out.println("2.sa pe�a");
		menu=Leer.datoInt();
		
		switch(menu){
		case 1:
			
			System.out.println("indica cuantos sois\nrecuerda que maximo cuatro jugadores:");
			jug=Leer.datoInt();
			if (jug<=4 && jug>0){
				
				Equipo[] peticionEqs = new Equipo[jug]; 
				
				for(int i=0;i<peticionEqs.length;i++){
					System.out.println("Diga el nombre del jugador"+peticionEqs[i]+":");
					nomJug=Leer.dato();
					
				}
				
			}else{
				System.out.println("pichita te estas equivocando");
			}
			break;
			
		case 2:
			break;
		}
		
		
	}
	 
	
	//TODO metodo que va en jugar partida donde se comprueba el nombre con un aleatorio y el array de turnos
	
	@Override
	public String toString() {
		return "Trivial [eq1=" + eq1 + ", eq2=" + eq2 + ", eq3=" + eq3 + ", eq4=" + eq4 + ", turno="
				+ Arrays.toString(turno) + ", dado()=" + dado() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	public int dado(){
		int num;
		Random numAle= new Random();
		num=numAle.nextInt(6-1)+1;
		return num;
	}
	
	
	
	/*
	 * metodo con switch eleccion individual equipo , luego cuantos son y luego creo los jugadores equipos
	 */
	
	
	//GETTERS, SETTERS Y TOSTRINGS
	
	
	
}
