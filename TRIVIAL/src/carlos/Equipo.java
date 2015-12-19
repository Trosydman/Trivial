package carlos;

import java.util.Arrays;

public class Equipo {
	// ATRIBUTOS
	public static int numEq = 0;
	private String nombreEq;
	//Creo que los nombres de los jugadores no son imprescindibles
	private String[] jugadores = new String[6];
	private boolean[] quesitos = new boolean[6];
	private int[] posEq = new int[2];

	// CONSTRUCTORES
	public Equipo(String jugadores) {
		Equipo.numEq++;
		this.jugadores[0] = jugadores;
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

	public Equipo(String nombreEquipo, String[] jugadores) {
		Equipo.numEq++;
		this.nombreEq = nombreEquipo;// Esto será para escribirlo en las
										// casillas: nombreEquipo.substring(0,
										// 3).toUpperCase();
		this.jugadores = jugadores;
		
		/*
		 * Aclaraciones en el constructor anterior.
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
		return "Equipo [nombreEq=" + nombreEq + ", jugadores=" + Arrays.toString(jugadores) + ", quesitos="
				+ Arrays.toString(quesitos) + ", posEq=" + Arrays.toString(posEq) + "]";
	}

}
