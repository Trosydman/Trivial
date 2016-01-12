package carlos;

import java.util.Arrays;

/**
 * Ayuda a gestionar los equipos/jugadores
 * 
 * @author Carlos Mesquita Mansilla
 *
 */
public class Equipo {
	// ATRIBUTOS
	/**
	 * Número del equipo
	 */
	private int numEq = 0;
	
	/**
	 * Nombre del EQUIPO
	 */
	private String nombreEq;
	/**
	 * Nombre del JUGADOR
	 */
	private String jugador;
	
	/**
	 * Array de booleanos que indica los quesitos que se tienen
	 */
	private boolean[] quesitos = new boolean[5];
	/**
	 * Posicion(filas, columnas) en el {@link Tablero}
	 */
	private int[] posEq = new int[2];

	
	
	// CONSTRUCTORES
	/**
	 * Constructor principal de {@link Equipo} que establece algunos valores y
	 * coloca a los {@link Equipo equipos} en el centro del tablero, en su lugar
	 * en la casilla
	 * 
	 * @param numEq número del equipo/jugador
	 * @param nombre nombre del equipo/jugador
	 * @param isEquipo identifica si lo que va a ser tratado es un equipo o un jugador
	 */
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
