package carlos;

import java.util.Arrays;

public class Equipo {
	// ATRIBUTOS
	/*
	 * El número de "equipo2(numEq) tiene que ser static para que
	 * el resto de números de "equipos" sea correlativo, sino 
	 * todos serían el mismo número.
	 */
	private int numEq = 0;
	private String nombreEq;
	//Creo que los nombres de los jugadores no son imprescindibles
	private String jugador;
	private boolean[] quesitos= {false, true, true, true, true};// = new boolean[5];
	private int[] posEq = new int[2];

	
	
	// CONSTRUCTORES
	public Equipo(int numEq, String nombre, boolean isEquipo) {
		/*
		 * Si se quisiera volver a jugar, el número de equipo
		 * tiene que inicializarse a 0;
		 */
		if(numEq > 4)
			numEq=0;
		
		this.numEq = numEq;
		
		if(isEquipo)
			this.nombreEq = nombre;
		else
			this.jugador = nombre;
		/*
		 * La posición (31,13) representa la casilla inicial desde dónde
		 * todos empiezan la partida.
		 * Las sumas son las diferentes posiciones de los distintos
		 * componentes en la casilla.
		 */
		switch (numEq) {
		case 1:
			posEq[0]=13;
			posEq[1]=31;
			break;
		case 2:
			posEq[0]=13;
			posEq[1]=31+4;
			break;
		case 3:
			posEq[0]=13+1;
			posEq[1]=31;
			break;
		case 4:
			posEq[0]=13+1;
			posEq[1]=31+4;
			break;
		
		}
	}

	
	
	// MÉTODOS

	
	
	// GETTERS, SETTERS Y TOSTRINGS
	
	@Override
	public String toString() {
		return "Equipo [nombreEq=" + nombreEq + ", jugadores=" + jugador + ", quesitos="
				+ Arrays.toString(quesitos) + ", posEq=" + Arrays.toString(posEq) + "]";
	}

	public int getNumEq() {
		return numEq;
	}



	public String getNombreEq() {
		return nombreEq;
	}

	public void setNombreEq(String nombreEq) {
		this.nombreEq = nombreEq;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public boolean[] getQuesitos() {
		return quesitos;
	}

	public void setQuesitos(boolean[] quesitos) {
		this.quesitos = quesitos;
	}

	public int[] getPosEq() {
		return posEq;
	}

	public void setPosEq(int[] posEq) {
		this.posEq = posEq;
	}

}
