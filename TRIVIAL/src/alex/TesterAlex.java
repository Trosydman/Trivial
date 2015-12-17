package alex;

public class TesterAlex {

	public static void main(String[] args) {

		
		ListadoPreguntas list = new ListadoPreguntas();
		
		for (int i = 0, j=0; i < 25; i++) {
				System.out.println(list.getListado()[i][j]+"\n"
						+ list.getListado()[i][j+1]+"\n"
						+list.getListado()[i][j+2]+"\n"
						+list.getListado()[i][j+3]	);
				System.out.println(" ");
		}
		
		
		
		
		
	}

}
