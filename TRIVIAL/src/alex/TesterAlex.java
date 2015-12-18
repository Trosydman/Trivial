package alex;

public class TesterAlex {

	public static void main(String[] args) {

		
		
		
		
		
		//RECORRER ARRAY DE PROGRAMACI�N
		ListadoPreguntas list = new ListadoPreguntas();
		
		for (int i = 0, j=0; i < 10; i++) {
				System.out.println(list.getListadoProgramacion()[i][j]+"\n"
						+ "\t"+"a) "+list.getListadoProgramacion()[i][j+1]+"\n"
						+ "\t"+"b) "+list.getListadoProgramacion()[i][j+2]+"\n"
						+ "\t"+"c) "+list.getListadoProgramacion()[i][j+3]	);
				System.out.println(" ");
		}
		
		
		
		
		//RECORRER ARRAY DE BASE DE DATOS
				
				
				for (int i = 0, j=0; i < 10; i++) {
						System.out.println(list.getListadoBBDD()[i][j]+"\n"
								+ "\t"+"a) "+list.getListadoBBDD()[i][j+1]+"\n"
								+ "\t"+"b) "+list.getListadoBBDD()[i][j+2]+"\n"
								+ "\t"+"c) "+list.getListadoBBDD()[i][j+3]	);
						System.out.println(" ");
				}
				
				
				
				//RECORRER ARRAY DE HTML
				
				
				for (int i = 0, j=0; i < 10; i++) {
						System.out.println(list.getListadoHTML()[i][j]+"\n"
								+ "\t"+"a) "+list.getListadoHTML()[i][j+1]+"\n"
								+ "\t"+"b) "+list.getListadoHTML()[i][j+2]+"\n"
								+ "\t"+"c) "+list.getListadoHTML()[i][j+3]	);
						System.out.println(" ");
				}
				
				
				
				//RECORRER ARRAY DE SISTEMAS
				
				
				for (int i = 0, j=0; i < 10; i++) {
						System.out.println(list.getListadoSIS()[i][j]+"\n"
								+ "\t"+"a) "+list.getListadoSIS()[i][j+1]+"\n"
								+ "\t"+"b) "+list.getListadoSIS()[i][j+2]+"\n"
								+ "\t"+"c) "+list.getListadoSIS()[i][j+3]	);
						System.out.println(" ");
				}
				
				
				
				//ARRAY DE PROGRAMACI�N
				
				
				for (int i = 0, j=0; i < 10; i++) {
						System.out.println(list.getListadoCOL()[i][j]+"\n"
								+ "\t"+"a) "+list.getListadoCOL()[i][j+1]+"\n"
								+ "\t"+"b) "+list.getListadoCOL()[i][j+2]+"\n"
								+ "\t"+"c) "+list.getListadoCOL()[i][j+3]	);
						System.out.println(" ");
				}
		
		
		
		
	}

}
