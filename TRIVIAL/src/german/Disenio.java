package german;

import carlos.Casilla;
import carlos.Equipo;

public class Disenio {
	
	public static int contLin;

	public static void generarCabecera(){
		
		System.out.println("===================================================================================================");
		Disenio.contLin++;
		System.out.println("===================================================================================================");
		Disenio.contLin++;
		System.out.println("===================================================================================================");
		Disenio.contLin++;
	}
	

	public static void generarBienvenida(){
		
		Disenio.generarCabecera();
		System.out.println("::::::::::::::::::'########:'########::'####:'##::::'##:'####::::'###::::'##:::::::::::::::::::::::\n"+
							"::::::::::::::::::... ##..:: ##.... ##:. ##:: ##:::: ##:. ##::::'## ##::: ##:::::::::::::::::::::::\n"+
							"::::::::::::::::::::: ##:::: ##:::: ##:: ##:: ##:::: ##:: ##:::'##:. ##:: ##:::::::::::::::::::::::\n"+
							"::::::::::::::::::::: ##:::: ########::: ##:: ##:::: ##:: ##::'##:::. ##: ##:::::::::::::::::::::::\n"+
							"::::::::::::::::::::: ##:::: ##.. ##:::: ##::. ##:: ##::: ##:: #########: ##:::::::::::::::::::::::\n"+
							"::::::::::::::::::::: ##:::: ##::. ##::: ##:::. ## ##:::: ##:: ##.... ##: ##:::::::::::::::::::::::\n"+
							"::::::::::::::::::::: ##:::: ##:::. ##:'####:::. ###::::'####: ##:::: ##: ########:::::::::::::::::\n"+
							":::::::::::::::::::::..:::::..:::::..::....:::::...:::::....::..:::::..::........::::::::::::::::::");
		Disenio.contLin+=8;
		System.out.println(":'######:::::'###::::'##:::::::'########::'######::'####::::'###::::'##::: ##::'#######:::'######::\n"+
						   "'##... ##:::'## ##::: ##::::::: ##.....::'##... ##:. ##::::'## ##::: ###:: ##:'##.... ##:'##... ##:\n"+
						   " ##:::..:::'##:. ##:: ##::::::: ##::::::: ##:::..::: ##:::'##:. ##:: ####: ##: ##:::: ##: ##:::..::\n"+
						   "  ######::'##:::. ##: ##::::::: ######:::. ######::: ##::'##:::. ##: ## ## ##: ##:::: ##:. ######::\n"+
						   ":..... ##: #########: ##::::::: ##...:::::..... ##:: ##:: #########: ##. ####: ##:::: ##::..... ##:\n"+
						   "'##::: ##: ##.... ##: ##::::::: ##:::::::'##::: ##:: ##:: ##.... ##: ##:. ###: ##:::: ##:'##::: ##:\n"+
					       ". ######:: ##:::: ##: ########: ########:. ######::'####: ##:::: ##: ##::. ##:. #######::. ######::\n"+
						   ":......:::..:::::..::........::........:::......:::....::..:::::..::..::::..:::.......::::......:::");
		Disenio.contLin+=8;
		Disenio.generarCabecera();
		
		
	}
		
	public static void generarMenu (){
		
		System.out.println("                                  __  __   ______   _   _   _    _                                 \n"+
						   "=================================|  \\/  | |  ____| | \\ | | | |  | |================================\n"+
				           "=================================| \\  / | | |__    |  \\| | | |  | |================================\n"+
						   "=================================| |\\/| | |  __|   |     | | |  | |================================\n"+
						   "=================================| |  | | | |____  | |\\  | | |__| |================================\n"+
						   "=================================|_|  |_| |______| |_| \\_|  \\____/ ================================\n"+
						   "                                   ");
		Disenio.contLin+=7;
		System.out.println("  _  __     ___                                                       _                            \n"+
						   " / | \\ \\   | __|  _ __    _ __   ___   ___  __ _   _ _     __ _      (_)  _  _   __ _   __ _   _ _ \n"+
						   " | |  | |  | _|  | '  \\  | '_ \\ / -_) |_ / / _` | | '_|   / _` |     | | | || | / _` | / _` | | '_|\n"+
						   " |_|  | |  |___| |_|_|_| | .__/ \\___| /__| \\__,_| |_|     \\__,_|    _/ |  \\_,_| \\__, | \\__,_| |_|  \n"+
						   "     /_/                 |_|                                       |__/         |___/              ");
		
		Disenio.contLin+=6;
		
		System.out.println("  ___  __     ___                _                    _         _       _                           \n"+
						   " |_  ) \\ \\   | _ \\  ___   __ _  | |  __ _   ___    __| |  ___  | |     (_)  _  _   ___   __ _   ___ \n"+
						   "  / /   | |  |   / / -_) / _` | | | / _` | (_-<   / _` | / -_) | |     | | | || | / -_) / _` | / _ \\\n"+
						   " /___|  | |  |_|_\\ \\___| \\__, | |_| \\__,_| /__/   \\__,_| \\___| |_|    _/ |  \\_,_| \\___| \\__, | \\___/\n"+
						   "       /_/               |___/                                       |__/               |___/       ");
									
		Disenio.contLin+=6;
		System.out.println("  ____ __        ___           _                                                           ___ \n"+
						   " |__ / \\ \\      / _ \\   _  _  (_)  ___   _ _    ___   ___    ___  ___   _ __    ___   ___ |__ \\\n"+
						   "  |_ \\  | |    | (_) | | || | | | / -_) | ' \\  / -_) (_-<   (_-< / _ \\ | '  \\  / _ \\ (_-<   /_/\n"+
					       " |___/  | |     \\__\\_\\  \\_,_| |_| \\___| |_||_| \\___| /__/   /__/ \\___/ |_|_|_| \\___/ /__/  (_) \n"+
						   "       /_/                                                                                         ");
									
		Disenio.contLin+=6;
		System.out.println("   __  __      ___          _   _              _         _                               \n"+
						   "  /  \\ \\ \\    / __|  __ _  | | (_)  _ _     __| |  ___  | |    _ __    ___   _ _    _  _ \n"+
						   " | () | | |   \\__ \\ / _` | | | | | | '_|   / _` | / -_) | |   | '  \\  / -_) | ' \\  | || |\n"+
					       "  \\__/  | |   |___/ \\__,_| |_| |_| |_|     \\__,_| \\___| |_|   |_|_|_| \\___| |_||_|  \\_,_|\n"+
						   "       /_/                                                                               \n");
											
				
		Disenio.contLin+=6;		
				
				
				
		System.out.println("Elija una opción (0-3)");
			
		contLin++;
		
		Disenio.generarCabecera();
		
	}
		
	public static void generarMenuDatos (){
		
		System.out.println("   _____                                   _                           _         ___  \n"+
						   "  / ____|                                 (_)                         (_)       |__ \\ \n"+
						   " | |        ___    _ __ ___     ___        _   _   _    __ _    __ _   _   ___     ) |\n"+
					       " | |       / _ \\  | '_ ` _ \\   / _ \\      | | | | | |  / _` |  / _` | | | / __|   / / \n"+
					       " | |____  | (_) | | | | | | | | (_) |     | | | |_| | | (_| | | (_| | | | \\__ \\  |_|  \n"+
					       "  \\_____|  \\___/  |_| |_| |_|  \\___/      | |  \\__,_|  \\__, |  \\__,_| |_| |___/  (_)  \n"+
						   "	                                 _/ |           __/ |                         \n"+
						   "                                        |__/           |___/                          ");
		Disenio.contLin+=7;
		
		System.out.println("\t  _  __      ___             _   _         _      _                 _ \n"+
						   "\t / | \\ \\    |_ _|  _ _    __| | (_) __ __ (_)  __| |  _  _   __ _  | |\n"+
					       "\t | |  | |    | |  | ' \\  / _` | | | \\ V / | | / _` | | || | / _` | | |\n"+
						   "\t |_|  | |   |___| |_||_| \\__,_| |_|  \\_/  |_| \\__,_|  \\_,_| \\__,_| |_|\n"+
						   "\t     /_/                                                              ");
		Disenio.contLin+=4;
		
		System.out.println("\t  ___  __      ___                                     _                   \n"+
						   "\t |_  ) \\ \\    | _ \\  ___   _ _     ___   __ _   _  _  (_)  _ __   ___   ___\n"+
					   	   "\t  / /   | |   |  _/ / _ \\ | '_|   / -_) / _` | | || | | | | '_ \\ / _ \\ (_-<\n"+
						   "\t /___|  | |   |_|   \\___/ |_|     \\___| \\__, |  \\_,_| |_| | .__/ \\___/ /__/\n"+
						   "\t       /_/                                 |_|            |_|              \n");
		Disenio.contLin+=5;							
	}
	
	public static void generarNumJug (){
		
		System.out.println("  ___             _   _                                                       \n"+
						   " |_ _|  _ _    __| | (_)  __   __ _     _ _    _  _   _ __    ___   _ _   ___ \n"+
						   "  | |  | ' \\  / _` | | | / _| / _` |   | ' \\  | || | | '  \\  / -_) | '_| / _ \\ \n"+
						   " |___| |_||_| \\__,_| |_| \\__| \\__,_|   |_||_|  \\_,_| |_|_|_| \\___| |_|   \\___/");
		Disenio.contLin+=4;
		System.out.println("     _             _                           _                        \n"+
						   "  __| |  ___      (_)  _  _   __ _   __ _   __| |  ___   _ _   ___   ___\n"+
						   " / _` | / -_)     | | | || | / _` | / _` | / _` | / _ \\ | '_| / -_) (_-<\n"+
						   " \\__,_| \\___|    _/ |  \\_,_| \\__, | \\__,_| \\__,_| \\___/ |_|   \\___| /__/\n"+
						   "                |__/         |___/                                      \n");
		Disenio.contLin+=5;
						 	
		System.out.println("(Mínimo 2 jugadores, máximo 4)");
		Disenio.contLin++;						
		
	}
	
	
public static void generarNumEq (){
		
		System.out.println("  ___             _   _                                                       \n"+
						   " |_ _|  _ _    __| | (_)  __   __ _     _ _    _  _   _ __    ___   _ _   ___ \n"+
						   "  | |  | ' \\  / _` | | | / _| / _` |   | ' \\  | || | | '  \\  / -_) | '_| / _ \\ \n"+
						   " |___| |_||_| \\__,_| |_| \\__| \\__,_|   |_||_|  \\_,_| |_|_|_| \\___| |_|   \\___/");
		Disenio.contLin+=4;
		System.out.println("     _                               _                   \n"+
						   "  __| |  ___     ___   __ _   _  _  (_)  _ __   ___   ___\n"+
						   " / _` | / -_)   / -_) / _` | | || | | | | '_ \\ / _ \\ (_-<\n"+
						   " \\__,_| \\___|   \\___| \\__, |  \\_,_| |_| | .__/ \\___/ /__/\n"+
						   "                         |_|            |_|              \n");
		Disenio.contLin+=5;				 	
		System.out.println("(Mínimo 2 jugadores, máximo 4)");
		Disenio.contLin++;						
		
	}
	
	public static void generarCabeTab (Equipo eq){
		
		System.out.println("===================================================================================================");
		Disenio.contLin++;
		if(eq.getJugador()!= null){
		System.out.println("\t\t\t\t\tEstá jugando el jugador "+eq.getJugador());
		Disenio.contLin++;
		}else{
			System.out.println("\t\t\t\t\tEstá jugando el equipo "+eq.getNombreEq());	
			Disenio.contLin++;
		}
		Disenio.generarNumQuesitos(eq);
		System.out.println("===================================================================================================");
		Disenio.contLin++;
	}


	public static void generarNumQuesitos(Equipo eq){
		
		System.out.print("\t\tTiene los siguientes quesitos:");
		
		for (int i = 0; i < eq.getQuesitos().length; i++) {
			
			switch (i){
			case Casilla.PROG:
				
				if(eq.getQuesitos()[i]==true){
					
					System.out.print("PROG\t");
					
				}else{
					System.out.print("  -\t");
				}
				
			break;
			case Casilla.BBDD:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("BBDD\t");

				}else{
					System.out.print("-\t");
				}

				break;
			case Casilla.HTML:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("HTML\t");

				}else{
					System.out.print("  -\t");
				}

				break;
			case Casilla.SIS:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("SISTEMA\t");

				}else{
					System.out.print("  -\t");
				}

				break;
			case Casilla.COL:

				if (eq.getQuesitos()[i] == true) {

					System.out.print("COLEGIO\t");

				}else{
					System.out.print("  -\t");
				}

				break;
			
			}
			
		}
		System.out.println();
	}
	
	public static void tirarDado(){
		System.out.println("                          		    ______    \n"+
					       "                          		   /     /\\   \n"+
				           "                          		  /  '  /  \\ \n"+
					       "Intro para tirar los dados		 /_____/. . \\ \n"+
				           "                          		 \\ . . \\    /  \n"+
					       "                          		  \\ . . \\  /   \n"+
			          	   "                          		   \\_____\\/ ");

		
	}
	
	public static void limpiarConsola(){
		
		for (int i = 0; i < Disenio.contLin; i++) {
			System.out.println();
		} 
	
		Disenio.contLin=0;
		
	}
		
		
		
		
		
		
		
		
		
		
		

		
	}
	
	

