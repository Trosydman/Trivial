package alex;

public class TesterAlex {

	public static void main(String[] args) {

		
		
		
		
		
		//RECORRER ARRAY DE PROGRAMACIÓN
		ListadoPreguntas list1 = new ListadoPreguntas();
		
		for (int i = 0, j=0; i < 10; i++) {
				System.out.println(list1.getListadoProgramacion()[i][j]+"\n"
						+ "\t"+"a) "+list1.getListadoProgramacion()[i][j+1]+"\n"
						+ "\t"+"b) "+list1.getListadoProgramacion()[i][j+2]+"\n"
						+ "\t"+"c) "+list1.getListadoProgramacion()[i][j+3]	);
				System.out.println(" ");
		}
		
		
		
		
		//RECORRER ARRAY DE BASE DE DATOS
				ListadoPreguntas list2 = new ListadoPreguntas();
				
				for (int i = 0, j=0; i < 10; i++) {
						System.out.println(list2.getListadoBBDD()[i][j]+"\n"
								+ "\t"+"a) "+list2.getListadoBBDD()[i][j+1]+"\n"
								+ "\t"+"b) "+list2.getListadoBBDD()[i][j+2]+"\n"
								+ "\t"+"c) "+list2.getListadoBBDD()[i][j+3]	);
						System.out.println(" ");
				}
				
				
				
				//RECORRER ARRAY DE HTML
				ListadoPreguntas list3 = new ListadoPreguntas();
				
				for (int i = 0, j=0; i < 10; i++) {
						System.out.println(list3.getListadoHTML()[i][j]+"\n"
								+ "\t"+"a) "+list3.getListadoHTML()[i][j+1]+"\n"
								+ "\t"+"b) "+list3.getListadoHTML()[i][j+2]+"\n"
								+ "\t"+"c) "+list3.getListadoHTML()[i][j+3]	);
						System.out.println(" ");
				}
				
				
				
				//RECORRER ARRAY DE SISTEMAS
				ListadoPreguntas list4 = new ListadoPreguntas();
				
				for (int i = 0, j=0; i < 10; i++) {
						System.out.println(list4.getListadoSIS()[i][j]+"\n"
								+ "\t"+"a) "+list4.getListadoSIS()[i][j+1]+"\n"
								+ "\t"+"b) "+list4.getListadoSIS()[i][j+2]+"\n"
								+ "\t"+"c) "+list4.getListadoSIS()[i][j+3]	);
						System.out.println(" ");
				}
				
				
				
				//ARRAY DE PROGRAMACIÓN
				ListadoPreguntas list5 = new ListadoPreguntas();
				
				for (int i = 0, j=0; i < 10; i++) {
						System.out.println(list5.getListadoCOL()[i][j]+"\n"
								+ "\t"+"a) "+list5.getListadoCOL()[i][j+1]+"\n"
								+ "\t"+"b) "+list5.getListadoCOL()[i][j+2]+"\n"
								+ "\t"+"c) "+list5.getListadoCOL()[i][j+3]	);
						System.out.println(" ");
				}
		
		
		
		
	}

}
