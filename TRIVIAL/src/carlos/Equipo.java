package carlos;

import java.util.Arrays;

public class Equipo {
	// ATRIBUTOS
	/*
	 * El número de "equipo2(numEq) tiene que ser static para que
	 * el resto de números de "equipos" sea correlativo, sino 
	 * todos serían el mismo número.
	 */
	private static int numEq = 0;
	private String nombreEq;
	//Creo que los nombres de los jugadores no son imprescindibles
	private String jugador;
	private boolean[] quesitos = new boolean[6];
	private int[] posEq = new int[2];

	
	
	// CONSTRUCTORES
	public Equipo(String nombre, boolean isEquipo) {
		Equipo.numEq+=1;
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
		switch (Equipo.numEq) {
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
		default:
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
