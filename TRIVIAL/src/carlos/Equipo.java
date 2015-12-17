package carlos;

import java.util.Arrays;

public class Equipo {
	// ATRIBUTOS
	String nombreEq;
	String[] jugadores = new String[6];
	boolean[] quesitos = new boolean[6];	
	
	// CONSTRUCTORES
	public Equipo(String jugadores) {
		this.jugadores[0] = jugadores;
	}

	public Equipo(String nombreEquipo, String[] jugadores) {
		this.nombreEq = nombreEquipo.substring(0, 3).toUpperCase();
		this.jugadores = jugadores;
	}
		
		
	// MÉTODOS

		
		
	// GETTERS, SETTERS Y TOSTRINGS
	@Override
	public String toString() {
		return "Equipo\n\tNombreEquipo=" + nombreEq + "\n\tJugadores=" + Arrays.toString(jugadores) + "\n\tQuesitos="
				+ Arrays.toString(quesitos) + "]";
	}
		
		
}
