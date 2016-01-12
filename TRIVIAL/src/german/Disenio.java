package german;

import carlos.Casilla;
import carlos.Equipo;
import leer_por_teclado.Leer;

/**
 * @author Carlos
 *
 */
public class Disenio {
	
	/**
	 * Declaramos la variable que nos 
	 * permitirá introducir espacios
	 * más tarde en el texto con la 
	 * finalidad de ver más limpio
	 * el programa.
	 * 
	 * @author Germán López Pedriza
	 */
	public static int contLin;

	
	/**
	 * Diseño estético para 
	 * mejorar la armonía del 
	 * programa.
	 * 
	 * @author Germán López Pedriza
	 */
	public static void generarCabecera() {

		System.out.println(
				"===================================================================================================");
		Disenio.contLin++;
		System.out.println(
				"===================================================================================================");
		Disenio.contLin++;
		System.out.println(
				"===================================================================================================");
		Disenio.contLin++;
	}

	/**
	 * El título del programa, se crea la cabecera.
	 * 
	 * @author Germán López Pedriza
	 */
	public static void generarBienvenida() {

		Disenio.generarCabecera();
		System.out.println(
				"::::::::::::::::::'########:'########::'####:'##::::'##:'####::::'###::::'##:::::::::::::::::::::::\n"
						+ "::::::::::::::::::... ##..:: ##.... ##:. ##:: ##:::: ##:. ##::::'## ##::: ##:::::::::::::::::::::::\n"
						+ "::::::::::::::::::::: ##:::: ##:::: ##:: ##:: ##:::: ##:: ##:::'##:. ##:: ##:::::::::::::::::::::::\n"
						+ "::::::::::::::::::::: ##:::: ########::: ##:: ##:::: ##:: ##::'##:::. ##: ##:::::::::::::::::::::::\n"
						+ "::::::::::::::::::::: ##:::: ##.. ##:::: ##::. ##:: ##::: ##:: #########: ##:::::::::::::::::::::::\n"
						+ "::::::::::::::::::::: ##:::: ##::. ##::: ##:::. ## ##:::: ##:: ##.... ##: ##:::::::::::::::::::::::\n"
						+ "::::::::::::::::::::: ##:::: ##:::. ##:'####:::. ###::::'####: ##:::: ##: ########:::::::::::::::::\n"
						+ ":::::::::::::::::::::..:::::..:::::..::....:::::...:::::....::..:::::..::........::::::::::::::::::");
		Disenio.contLin += 8;
		System.out.println(
				":'######:::::'###::::'##:::::::'########::'######::'####::::'###::::'##::: ##::'#######:::'######::\n"
						+ "'##... ##:::'## ##::: ##::::::: ##.....::'##... ##:. ##::::'## ##::: ###:: ##:'##.... ##:'##... ##:\n"
						+ " ##:::..:::'##:. ##:: ##::::::: ##::::::: ##:::..::: ##:::'##:. ##:: ####: ##: ##:::: ##: ##:::..::\n"
						+ "  ######::'##:::. ##: ##::::::: ######:::. ######::: ##::'##:::. ##: ## ## ##: ##:::: ##:. ######::\n"
						+ ":..... ##: #########: ##::::::: ##...:::::..... ##:: ##:: #########: ##. ####: ##:::: ##::..... ##:\n"
						+ "'##::: ##: ##.... ##: ##::::::: ##:::::::'##::: ##:: ##:: ##.... ##: ##:. ###: ##:::: ##:'##::: ##:\n"
						+ ". ######:: ##:::: ##: ########: ########:. ######::'####: ##:::: ##: ##::. ##:. #######::. ######::\n"
						+ ":......:::..:::::..::........::........:::......:::....::..:::::..::..::::..:::.......::::......:::");
		
		Disenio.contLin += 8;
		Disenio.generarCabecera();
		System.out.println("(Intro)");
		

	}

	/**
	 * Se elabora el menú del programa que veremos al empezar
	 *  a interactuar con él después de ver la pantalla del título.
	 * @author Germán López Pedriza
	 */
	public static void generarMenu() {

		System.out.println(
				"                                  __  __   ______   _   _   _    _         /                        \n"
						+ "=================================|  \\/  | |  ____| | \\ | | | |  | |================================\n"
						+ "=================================| \\  / | | |__    |  \\| | | |  | |================================\n"
						+ "=================================| |\\/| | |  __|   |     | | |  | |================================\n"
						+ "=================================| |  | | | |____  | |\\  | | |__| |================================\n"
						+ "=================================|_|  |_| |______| |_| \\_|  \\____/ ================================");
		Disenio.contLin += 7;
		System.out.println(
				"    _  __     ___                                                       _                            \n"
						+ "   / | \\ \\   | __|  _ __    _ __   ___   ___  __ _   _ _     __ _      (_)  _  _   __ _   __ _   _ _ \n"
						+ "   | |  | |  | _|  | '  \\  | '_ \\ / -_) |_ / / _` | | '_|   / _` |     | | | || | / _` | / _` | | '_|\n"
						+ "   |_|  | |  |___| |_|_|_| | .__/ \\___| /__| \\__,_| |_|     \\__,_|    _/ |  \\_,_| \\__, | \\__,_| |_|  \n"
						+ "       /_/                 |_|                                       |__/         |___/              ");

		Disenio.contLin += 6;

		System.out.println(
				"  ___  __     ___                _                    _         _       _                           \n"
						+ " |_  ) \\ \\   | _ \\  ___   __ _  | |  __ _   ___    __| |  ___  | |     (_)  _  _   ___   __ _   ___ \n"
						+ "  / /   | |  |   / / -_) / _` | | | / _` | (_-<   / _` | / -_) | |     | | | || | / -_) / _` | / _ \\\n"
						+ " /___|  | |  |_|_\\ \\___| \\__, | |_| \\__,_| /__/   \\__,_| \\___| |_|    _/ |  \\_,_| \\___| \\__, | \\___/\n"
						+ "       /_/               |___/                                       |__/               |___/       ");

		Disenio.contLin += 6;
		System.out.println(
				"  ____ __      ___           _                                                           ___ \n"
						+ " |__ / \\ \\    / _ \\   _  _  (_)  ___   _ _    ___   ___    ___  ___   _ __    ___   ___ |__ \\\n"
						+ "  |_ \\  | |  | (_) | | || | | | / -_) | ' \\  / -_) (_-<   (_-< / _ \\ | '  \\  / _ \\ (_-<   /_/\n"
						+ " |___/  | |   \\__\\_\\  \\_,_| |_| \\___| |_||_| \\___| /__/   /__/ \\___/ |_|_|_| \\___/ /__/  (_) \n"
						+ "       /_/                                                                                       ");

		Disenio.contLin += 6;
		System.out.println("   __  __      ___          _   _              _         _                               \n"
				+ "  /  \\ \\ \\    / __|  __ _  | | (_)  _ _     __| |  ___  | |    _ __    ___   _ _    _  _/ \n"
				+ " | () | | |   \\__ \\ / _` | | | | | | '_|   / _` | / -_) | |   | '  \\  / -_) | ' \\  | || |\n"
				+ "  \\__/  | |   |___/ \\__,_| |_| |_| |_|     \\__,_| \\___| |_|   |_|_|_| \\___| |_||_|  \\_,_|\n"
				+ "       /_/                                                                               \n");

		Disenio.contLin += 6;

		System.out.println("Elija una opción (0-3)");

		contLin++;

		Disenio.generarCabecera();

	}
	
	/**
	 * Se crea el conjunto de reglas que hay que seguir
	 * para que el usuario sepa como tiene que 
	 * interactuar con el programa.
	 * @author Germán López Pedriza
	 */
	public static void generarOpcReglas() {
		System.out.println("                       _____    ______    _____   _                    _____\n"+
						   "======================|  __ \\  |  ____|  / ____| | |          /\\      / ____|======================\n"+
						   "======================| |__) | | |__    | |  __  | |         /  \\    | (___  ======================\n"+
						   "======================|  _  /  |  __|   | | |_ | | |        / /\\ \\    \\___ \\ ======================\n"+
						   "======================| | \\ \\  | |____  | |__| | | |____   / ____ \\   ____) |======================\n"+
						   "======================|_|  \\_\\ |______|  \\_____| |______| /_/    \\_\\ |_____/ ======================");
		Disenio.contLin+=6;
		System.out.println("\n1) Todos los jugadores/equipos empezarán en el centro del tablero.\n");
		System.out.println("2) A los jugadores/equipos se les atribuirá un turno aleatorimente antes de comenzar la partida.\n");
		System.out.println("3) Cada jugador/equipo podrá moverse libremente por el tablero, exceptuando el caso que tenga todos\n"
				+ "   los \"quesitos\". En tal caso deberá dirigir al centro del tablero para la ronda final.\n"); 
		System.out.println("4) En la ronda final tendrá que responder una serie de preguntas sobre el colegio. Si fallara\n"
				+ "   alguna de ellas, perderá el turno.\n");
		System.out.println("5) Si tiene todos los \"quesitos\" y está cerca del centro, pero su tirada no ha sido exacta para\n"
				+ "   caer en la casilla central, deberá repetir la tirada tantas veces hasta que se caiga de forma \n"
				+ "  exacta.\n");
		System.out.println("6) Si un jugador/equipo cae en la casilla que se encuentra al final de uno de los 6 pasillos,\n"
				+ "   podrá conseguir 1 \"quesito\" si aún no lo tiene y acierta la pregunta; pero podrá perder 1 quesito \n"
				+ "   si ya lo tenía y erra en la respuesta.\n");
		System.out.println("7) Si un jugador/equipo se dirige a la derecha o arriba, podrá girar en la siguiente intersección\n"
				+ "   a la izquierda o arriba respectivamente.\n");
		System.out.println("(Intro)");
		Disenio.contLin+=7;
	}
	
	/**
	 * La pantalla donde se ven las 
	 * líneas de credito con los 
	 * componentes del programa.
	 * @author Germán López Pedriza
	 */
	public static void generarOpcComp(){
		System.out.println("   _____    ____    __  __   _____     ____    _   _   ______   _   _   _______   ______    _____\n"+ 
						   "  / ____|  / __ \\  |  \\/  | |  __ \\   / __ \\  | \\ | | |  ____| | \\ | | |__   __| |  ____|  / ____|\n"+
						   " | |      | |  | | | \\  / | | |__) | | |  | | |  \\| | | |__    |  \\| |    | |    | |__    | (___  \n"+
						   " | |      | |  | | | |\\/| | |  ___/  | |  | | | . ` | |  __|   | . ` |    | |    |  __|    \\___ \\ \n"+
						   " | |____  | |__| | | |  | | | |      | |__| | | |\\  | | |____  | |\\  |    | |    | |____   ____) |\n"+
						   "  \\_____|  \\____/  |_|  |_| |_|       \\____/  |_| \\_| |______| |_| \\_|    |_|    |______| |_____/ ");
		System.out.println(
						   "==================================================================================================");
		Disenio.contLin+=7;
		System.out.println("   ___                _                __  __                            _   _              __  __                      _   _   _\n"+        
						   "  / __|  __ _   _ _  | |  ___   ___   |  \\/  |  ___   ___  __ _   _  _  (_) | |_   __ _    |  \\/  |  __ _   _ _    ___ (_) | | | |  __ _\n"+ 
						   " | (__  / _` | | '_| | | / _ \\ (_-<   | |\\/| | / -_) (_-< / _` | | || | | | |  _| / _` |   | |\\/| | / _` | | ' \\  (_-< | | | | | | / _` |\n"+
						   "  \\___| \\__,_| |_|   |_| \\___/ /__/   |_|  |_| \\___| /__/ \\__, |  \\_,_| |_|  \\__| \\__,_|   |_|  |_| \\__,_| |_||_| /__/ |_| |_| |_| \\__,_|\n"+
						   "                                                             |_|");
		System.out.println("  ___         _   _                  ___                                       _                ___\n"+                                      
						   " | __|  ___  | | (_)  _ __   ___    | __|  ___   _ _   _ _    __ /_   _ _    __| |  ___   ___   | _ )  __ _   _ _   _ _   ___   _ _   ___\n"+ 
						   " | _|  / -_) | | | | | '_ \\ / -_)   | _|  / -_) | '_| | ' \\  / _` | | ' \\  / _` | / -_) |_ /   | _ \\ / _` | | '_| | '_| / -_) | '_| / _ \\\n"+
						   " |_|   \\___| |_| |_| | .__/ \\___|   |_|   \\___| |_|   |_||_| \\__,_| |_||_| \\__,_| \\___| /__|   |___/ \\__,_| |_|   |_|   \\___| |_|   \\___/\n"+
						   "                     |_|");
		System.out.println("    _     _           _                    _                   _     _                                    ___\n"+                                   
						   "   /_\\   | |  ___    (_)  __ _   _ _    __| |  _ _   ___      /_\\   | | __ __  __ _   _ _   ___   ___    / __|  _  _   ___  _ __    __ _   _ _\n"+  
						   "  / _ \\  | | / -_)   | | / _` | | ' \\  / _` | | '_| / _ \\    / _ \\  | | \\ V / / _` | | '_| / -_) |_ /   | (_ | | || | |_ / | '  \\  / _` | | ' \\\n"+ 
						   " /_/ \\_\\ |_| \\___|  _/ | \\__,_| |_||_| \\__,_| |_|   \\___/   /_/ \\_\\ |_|  \\_/  \\__,_| |_|   \\___| /__|    \\___|  \\_,_| /__| |_|_|_| \\__,_| |_||_|\n"+
						   "                   |__/\n");
		System.out.println("  _  _               _                  _              ___                            _                ___                   _\n"+              
						   " | \\| |  ___   _ _  | |__   ___   _ _  | |_   ___     / __|  ___   _ _    ___  __ _  | |  ___   ___   | _ \\  ___   _ _    __| |  ___   _ _\n"+  
						   " | .` | / _ \\ | '_| | '_ \\ / -_) | '_| |  _| / _ \\   | (_ | / _ \\ | ' \\  |_ / / _` | | | / -_) |_ /   |   / / -_) | ' \\  / _` | / _ \\ | ' \\\n"+ 
						   " |_|\\_| \\___/ |_|   |_.__/ \\___| |_|    \\__| \\___/    \\___| \\___/ |_||_| /__| \\__,_| |_| \\___| /__|   |_|_\\ \\___| |_||_| \\__,_| \\___/ |_||_|\n");
		System.out.println("   ___                                       _                                ___            _         _\n"+             
						   "  / __|  ___   _ _   _ __    __ /_   _ _     | |     __/_   _ __   ___   ___   | _ \\  ___   __| |  _ _  (_)  ___  __ _\n"+ 
						   " | (_ | / -_) | '_| | '  \\  / _` | | ' \\    | |__  / _ \\ | '_ \\ / -_) |_ /   |  _/ / -_) / _` | | '_| | | |_ / / _` |\n"+
						   "  \\___| \\___| |_|   |_|_|_| \\__,_| |_||_|   |____| \\___/ | .__/ \\___| /__|   |_|   \\___| \\__,_| |_|   |_| /__| \\__,_|\n"+
						   "                                                         |_|");
		Disenio.contLin+=20;
		System.out.println("(Intro)");
	}

	/**
	 * La pantalla de elección del modo
	 * de juego si solo o por equipos.
	 * @author Germán López Pedriza
	 */
	public static void generarMenuDatos() {

		System.out.println("   _____                                   _                           _         ___  \n"
				+ "  / ____|                                 (_)                         (_)       |__ \\ \n"
				+ " | |        ___    _ __ ___     ___        _   _   _    __ _    __ _   _   ___     ) |\n"
				+ " | |       / _ \\  | '_ ` _ \\   / _ \\      | | | | | |  / _` |  / _` | | | / __|   / / \n"
				+ " | |____  | (_) | | | | | | | | (_) |     | | | |_| | | (_| | | (_| | | | \\__ \\  |_|  \n"
				+ "  \\_____|  \\___/  |_| |_| |_|  \\___/      | |  \\__,_|  \\__, |  \\__,_| |_| |___/  (_)  \n"
				+ "	                                 _/ |           __/ |                         \n"
				+ "                                        |__/           |___/                          ");
		Disenio.contLin += 7;

		System.out.println("\t  _  __      ___             _   _         _      _                 _ \n"
				+ "\t / | \\ \\    |_ _|  _ _    __| | (_) __ __ (_)  __| |  _  _   __ _  | |\n"
				+ "\t | |  | |    | |  | ' \\  / _` | | | \\ V / | | / _` | | || | / _` | | |\n"
				+ "\t |_|  | |   |___| |_||_| \\__,_| |_|  \\_/  |_| \\__,_|  \\_,_| \\__,_| |_|\n"
				+ "\t     /_/                                                              ");
		Disenio.contLin += 4;

		System.out.println("\t  ___  __      ___                                     _                   \n"
				+ "\t |_  ) \\ \\    | _ \\  ___   _ _     ___   __ _   _  _  (_)  _ __   ___   ___\n"
				+ "\t  / /   | |   |  _/ / _ \\ | '_|   / -_) / _` | | || | | | | '_ \\ / _ \\ (_-<\n"
				+ "\t /___|  | |   |_|   \\___/ |_|     \\___| \\__, |  \\_,_| |_| | .__/ \\___/ /__/\n"
				+ "\t       /_/                                 |_|            |_|              \n");
		Disenio.contLin += 5;
	}

	/**
	 * En esta pantalla debemos introducir 
	 * el número de componentes que tendrá
	 * el juego.
	 * @author Germán López Pedriza
	 */
	public static void generarNumJug() {

		System.out.println("  ___             _   _                                                       \n"
				+ " |_ _|  _ _    __| | (_)  __   __ _     _ _    _  _   _ __    ___   _ _   ___ \n"
				+ "  | |  | ' \\  / _` | | | / _| / _` |   | ' \\  | || | | '  \\  / -_) | '_| / _ \\ \n"
				+ " |___| |_||_| \\__,_| |_| \\__| \\__,_|   |_||_|  \\_,_| |_|_|_| \\___| |_|   \\___/");
		Disenio.contLin += 10;
		System.out.println("     _             _                           _                        \n"
				+ "  __| |  ___      (_)  _  _   __ _   __ _   __| |  ___   _ _   ___   ___\n"
				+ " / _` | / -_)     | | | || | / _` | / _` | / _` | / _ \\ | '_| / -_) (_-<\n"
				+ " \\__,_| \\___|    _/ |  \\_,_| \\__, | \\__,_| \\__,_| \\___/ |_|   \\___| /__/\n"
				+ "                |__/         |___/                                      \n");
		Disenio.contLin += 10;

		System.out.println("(Mínimo 2, máximo 4)");
		Disenio.contLin++;

	}

	/**
	 * En la siguiente pantalla indicamos
	 * el número de equipos.
	 * @author Germán López Pedriza
	 */
	public static void generarNumEq() {

		System.out.println("  ___             _   _                                                       \n"
				+ " |_ _|  _ _    __| | (_)  __   __ _     _ _    _  _   _ __    ___   _ _   ___ \n"
				+ "  | |  | ' \\  / _` | | | / _| / _` |   | ' \\  | || | | '  \\  / -_) | '_| / _ \\ \n"
				+ " |___| |_||_| \\__,_| |_| \\__| \\__,_|   |_||_|  \\_,_| |_|_|_| \\___| |_|   \\___/");
		Disenio.contLin += 10;
		System.out.println("     _                               _                   \n"
				+ "  __| |  ___     ___   __ _   _  _  (_)  _ __   ___   ___\n"
				+ " / _` | / -_)   / -_) / _` | | || | | | | '_ \\ / _ \\ (_-<\n"
				+ " \\__,_| \\___|   \\___| \\__, |  \\_,_| |_| | .__/ \\___/ /__/\n"
				+ "                         |_|            |_|              \n");
		Disenio.contLin += 10;
		System.out.println("(Mínimo 2, máximo 4)");
		Disenio.contLin++;

	}

	/**
	 * Una cabecera para ir indicando que jugador
	 * o equipo juega en ese momento y el número 
	 * de quesitos que lleva.
	 * @param eq
	 * @author  Germán López Pedriza
	 */
	public static void generarCabeTab(Equipo eq) {

		System.out.println(
				"\n===================================================================================================");
		Disenio.contLin++;
		if (eq.getJugador() != null) {
			System.out.println("\t\t\t\t\tEstá jugando el jugador " + eq.getJugador());
			Disenio.contLin++;
		} else {
			System.out.println("\t\t\t\t\tEstá jugando el equipo " + eq.getNombreEq());
			Disenio.contLin++;
		}
		Disenio.generarNumQuesitos(eq);
		System.out.println(
				"===================================================================================================");
		Disenio.contLin++;
	}

	/**
	 * Indica el número de quesitos que 
	 * Lleva el jugador y su tipo.
	 * @param eq
	 * @author Germán López Pedriza
	 */
	public static void generarNumQuesitos(Equipo eq) {

		System.out.print("\t\tTiene los siguientes quesitos:");

		for (int i = 0; i < eq.getQuesitos().length; i++) {

			switch (i) {
			case Casilla.PROG:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("PROG\t");

				} else {
					System.out.print("  -\t");
				}

				break;
			case Casilla.BBDD:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("BBDD\t");

				} else {
					System.out.print("-\t");
				}

				break;
			case Casilla.HTML:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("HTML\t");

				} else {
					System.out.print("  -\t");
				}

				break;
			case Casilla.SIS:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("SISTEMA\t");

				} else {
					System.out.print("  -\t");
				}

				break;
			case Casilla.COL:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("COLEGIO\t");

				} else {
					System.out.print("  -\t");
				}

				break;
				
			}

		}
		System.out.println();
		Disenio.contLin+=3;
	}

	/**
	 * Un diseño para acompañar la 
	 * tirada del dado.
	 * 
	 * @author Germán López Pedriza
	 */
	public static void tirarDado() {
		System.out.println(
				"                          		    ______    \n" + "                          		   /     /\\   \n"
						+ "                          		  /  '  /  \\ \n"
						+ "Intro para tirar los dados		 /_____/. . \\ \n"
						+ "                          		 \\ . . \\    /  \n"
						+ "                          		  \\ . . \\  /   \n"
						+ "                          		   \\_____\\/ ");
		Disenio.contLin+=5;
	}

	/**
	 * Una cabecera para mostrar el tipo de pregunta en cada 
	 * caso. Se introduce la variable tipo para decidir el tipo
	 * de pregunta.
	 * @param tipo
	 * @author Germán López Pedriza
	 */
	public static void generarCabeceraPreg (int tipo){
		System.out.println();
		switch (tipo){
		
		case Casilla.PROG:
			
			System.out.println("=====================  ___   ___   ___    ___         ___   ___    ___     ___ =====================\n"+
							   "===================== | _ \\ | _ \\ | __|  / __|       | _ \\ | _ \\  / _ \\   / __|=====================\n"+
							   "===================== |  _/ |   / | _|  | (_ |       |  _/ |   / | (_) | | (_ |=====================\n"+
							   "===================== |_|   |_|_\\ |___|  \\___|       |_|   |_|_\\  \\___/   \\___|=====================\n"+
							   "=====================                                                          ===================== ");
			Disenio.contLin+=5;
			
			break;
		
			case Casilla.BBDD:
						
						System.out.println(	"=====================  ___   ___   ___    ___         ___   ___   ___    ___  =====================\n"+
											"===================== | _ \\ | _ \\ | __|  / __|       | _ ) | _ ) |   \\  |   \\ =====================\n"+
											"===================== |  _/ |   / | _|  | (_ |       | _ \\ | _ \\ | |) | | |) |=====================\n"+
											"===================== |_|   |_|_\\ |___|  \\___|       |___/ |___/ |___/  |___/ =====================\n"+
											"=====================                                                         =====================");

						Disenio.contLin+=5;
						break;
			case Casilla.HTML:
				
				System.out.println("==================  ___   ___   ___    ___         _  _   _____   __  __   _    ===================\n"+
								   "================== | _ \\ | _ \\ | __|  / __|       | || | |_   _| |  \\/  | | |   ===================\n"+
								   "================== |  _/ |   / | _|  | (_ |       | __ |   | |   | |\\/| | | |__ ===================\n"+
								   "================== |_|   |_|_\\ |___|  \\___|       |_||_|   |_|   |_|  |_| |____|===================\n"+
								   "==================						                 ===================");
				Disenio.contLin+=5;
				break;
			case Casilla.SIS:
				
				System.out.println("========================  ___   ___   ___    ___         ___   ___   ___  =========================\n"+
								   "======================== | _ \\ | _ \\ | __|  / __|       / __| |_ _| / __| =========================\n"+
								   "======================== |  _/ |   / | _|  | (_ |       \\__ \\  | |  \\__ \\ =========================\n"+
								   "======================== |_|   |_|_\\ |___|  \\___|       |___/ |___| |___/ =========================\n"+
								   "========================                                                  =========================");
				Disenio.contLin+=5;
				break;
			case Casilla.COL:
				
				System.out.println("=======================  ___   ___   ___    ___          ___    ___    _    =======================\n"+
								   "======================= | _ \\ | _ \\ | __|  / __|        / __|  / _ \\  | |   =======================\n"+
								   "======================= |  _/ |   / | _|  | (_ |       | (__  | (_) | | |__ =======================\n"+
								   "======================= |_|   |_|_\\ |___|  \\___|        \\___|  \\___/  |____|=======================\n"+
								   "=======================                                                     =======================");

				Disenio.contLin+=5;
				break;
		
		}
		
	}

	/**
	 * Método de diseño para generar un texto en
	 * una respuesta que no es correcta.
	 * 
	 * @author Germán López Pedriza
	 */
	public static void responderMal() {

		System.out.println(
				"  ___                                       _              _                                            _          \n"
						+ " | _ \\  ___   ___  _ __   _  _   ___   ___ | |_   __ _    (_)  _ _    __   ___   _ _   _ _   ___   __  | |_   __ _ \n"
						+ " |   / / -_) (_-< | '_ \\ | || | / -_) (_-< |  _| / _` |   | | | ' \\  / _| / _ \\ | '_| | '_| / -_) / _| |  _| / _` |\n"
						+ " |_|_\\ \\___| /__/ | .__/  \\_,_| \\___| /__/  \\__| \\__,_|   |_| |_||_| \\__| \\___/ |_|   |_|   \\___| \\__|  \\__| \\__,_|\n"
						+ "                  |_|                                                                                              \n");

		System.out.println("(Intro)");
		Disenio.contLin+=4;
	}

	/**
	 * Método de diseño para generar un texto en
	 * una respuesta que es correcta.
	 * @author Germán López Pedriza
	 */
	public static void responderBien() {

		System.out.println(
				"  ___                                       _                                                _            _ \n"
						+ " | _ \\  ___   ___  _ __   _  _   ___   ___ | |_   __ _     __   ___   _ _   _ _   ___   __  | |_   __ _  | |\n"
						+ " |   / / -_) (_-< | '_ \\ | || | / -_) (_-< |  _| / _` |   / _| / _ \\ | '_| | '_| / -_) / _| |  _| / _` | |_|\n"
						+ " |_|_\\ \\___| /__/ | .__/  \\_,_| \\___| /__/  \\__| \\__,_|   \\__| \\___/ |_|   |_|   \\___| \\__|  \\__| \\__,_| (_)\n"
						+ "                  |_|                                                                                       \n");
		System.out.println("(Intro)");
		Disenio.contLin+=4;
	}

	/**
	 * Una leyenda que indica algunos datos del juego
	 * para estar informados a tiempo real.
	 * 
	 * @author Germán López Pedriza
	 */
	public static void generarLeyenda() {

		System.out.println("\t*** PROG \t--- BBDD \t+++ HTML \t/// SISTEMAS \t === COLEGIO ");
		System.out.println("*== Quesito PROG \t-== Quesito BBDD \t+== Quesito HTML \t/== SIS \t=== COL");
		Disenio.contLin+=2;
	}

	/**
	 * Texto de despedida.
	 * 
	 * @author Germán López Pedriza
	 */
	public static void generarDespedida(){
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"+
						   ":::::::::::'######:::'########:::::'###:::::'######::'####::::'###:::::'######::::::::::::\n"+
						   "::::::::::'##... ##:: ##.... ##:::'## ##:::'##... ##:. ##::::'## ##:::'##... ##:::::::::::\n"+
						   ":::::::::: ##:::..::: ##:::: ##::'##:. ##:: ##:::..::: ##:::'##:. ##:: ##:::..::::::::::::\n"+
					       ":::::::::: ##::'####: ########::'##:::. ##: ##:::::::: ##::'##:::. ##:. ######::::::::::::\n"+
						   ":::::::::: ##::: ##:: ##.. ##::: #########: ##:::::::: ##:: #########::..... ##:::::::::::\n"+
						   ":::::::::: ##::: ##:: ##::. ##:: ##.... ##: ##::: ##:: ##:: ##.... ##:'##::: ##:::::::::::\n"+
						   "::::::::::. ######::: ##:::. ##: ##:::: ##:. ######::'####: ##:::: ##:. ######::::::::::::\n"+
						   ":::::::::::......::::..:::::..::..:::::..:::......:::....::..:::::..:::......:::::::::::::");
		
		System.out.println("'########:::'#######::'########:::::::::::'##:'##::::'##::'######::::::'###::::'########::\n"+
						   " ##.... ##:'##.... ##: ##.... ##:::::::::: ##: ##:::: ##:'##... ##::::'## ##::: ##.... ##:\n"+
						   " ##:::: ##: ##:::: ##: ##:::: ##:::::::::: ##: ##:::: ##: ##:::..::::'##:. ##:: ##:::: ##:\n"+
						   " ########:: ##:::: ##: ########::::::::::: ##: ##:::: ##: ##::'####:'##:::. ##: ########::\n"+
						   " ##.....::: ##:::: ##: ##.. ##::::::'##::: ##: ##:::: ##: ##::: ##:: #########: ##.. ##:::\n"+
						   " ##:::::::: ##:::: ##: ##::. ##::::: ##::: ##: ##:::: ##: ##::: ##:: ##.... ##: ##::. ##::\n"+
						   " ##::::::::. #######:: ##:::. ##::::. ######::. #######::. ######::: ##:::: ##: ##:::. ##:\n"+
						   " ..::::::::::.......:::..:::::..::::::......::::.......::::......::::..:::::..::..:::::..::\n");

		
		
	}
	
	
	/**
	 * 
	 * 
	 * @author Germán López Pedriza
	 */
	public static void limpiarConsola() {

		for (int i = 0; i < Disenio.contLin; i++) {
			System.out.println();
		}

		Disenio.contLin = 0;

	}

}
