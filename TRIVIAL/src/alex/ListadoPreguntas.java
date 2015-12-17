package alex;

public class ListadoPreguntas {
	//ATRIBUTOS
	public static final int PROG = 0;
	public static final int BBDD = 1;
	public static final int HTML = 2;
	public static final int SIS = 3;
	public static final int COL = 4;
	
	
	
	//PREGUNTAS DE PROGAMACI�N

		String pregProgALE1=" �Que es una cadena?";
			String opcAProgALE1=" Es una clase que no puede ser instanciada";
			String opcBProgALE1=" Secuencia de caracteres delimitada entre dobles comillas";
			String opcCProgALE1=" Secuencia de caracteres delimitada entre comillas simples";
			
		String pregProgALE2="�Cu�l es la descripci�n que crees que define mejor el concepto 'clase' en la programaci�n orientada a objetos?";
			String opcAProgALE2=" Es un tipo particular de variable";
			String opcBProgALE2=" Es un modelo o plantilla a partir de la cual creamos objetos";
			String opcCProgALE2=" Es una categoria de datos ordenada secuencialmente";
		
		String pregProgALE3=" �Qu� elementos crees que definen a un objeto?";
			String opcAProgALE3=" Sus cardinalidad y su tipo";
			String opcBProgALE3=" Sus atributos y sus m�todos";
			String opcCProgALE3=" La forma en que establece comunicaci�n e intercambia mensajes ";
		
		String pregProgALE4=" �Qu� significa instanciar una clase?";
			String opcAProgALE4=" Duplicar una clase";
			String opcBProgALE4=" Conectar dos clases entre s�";
			String opcCProgALE4=" Crear un objeto a partir de la clase";
		
		String pregProgALE5=" �Qu� significa sobrecargar (overload) un m�todo?";
			String opcAProgALE5=" Crear un m�todo con el mismo nombre pero diferentes argumentos";
			String opcBProgALE5=" Cambiarle el nombre dej�ndolo con la misma funcionalidad";
			String opcCProgALE5=" A�adirle funcionalidades a un m�todo";
		
		
			
			
			
			
			
			
		
		//PREGUNTAS DE BASE DE DATOS
		
		
		String pregBBDDALE1=" �Qu� es el grado de una relaci�n?";
			String opcABBDDALE1="  Es el n�mero de atributos que contiene la relaci�n";
			String opcBBBDDALE1=" Es el n�mero de tuplas que contiene la relaci�n";
			String opcCBBDDALE1=" Ninguna de las respuestas anteriores es correcta";
			
		String pregBBDDALE2=" Oracle es un SGBD que cumple el modelo:";
			String opcABBDDALE2=" Modelo de base de datos en red";
			String opcBBBDDALE2=" Modelo de base de datos jer�rquico";
			String opcCBBDDALE2=" Modelo de base de datos relacional";
			
		String pregBBDDALE3=" La sentencia SQL �SELECT NombreEmpleado, salario,comision FROM empleados WHERE comision IS NOT NULL�, �qu� resultado tendr�a?";
			String opcABBDDALE3=" Visualiza todos los empleados que no tienen comisi�n";
			String opcBBBDDALE3=" Visualiza todos los empleados con sus respectivos salarios y comisiones";
			String opcCBBDDALE3=" Ninguna de las respuestas anteriores es correcta";
			
		String pregBBDDALE4=" La sentencia SQL �SELECT Nombreproducto,precio FROM productos WHERE nombreproducto NOT LIKE �A_%� �, �qu� resultado tendr�a?";
			String opcABBDDALE4=" Visualiza todos los productos que empiecen con el car�cter �A� despu�s el car�cter �_� y despu�s el car�cter %";
			String opcBBBDDALE4=" Visualiza todos los productos que no empiecen con el car�cter �A� ni despu�s tengan el car�cter �_� ni despu�s el car�cter %";
			String opcCBBDDALE4=" Visualiza todos los productos que no empiezan con A y despu�s no tienen otro car�cter m�s como m�nimo";
			
		String pregBBDDALE5="La sentencia SQL �SELECT NombreEmpleado, COUNT(Id_pedido) FROM Pedidos p,empleados e WHERE p.id_empleado=e.id_empleado group by id_pedido HAVING COUNT(Id_pedido)=10 �, �qu� resultado tendr�a?";
			String opcABBDDALE5=" Visualiza los empleados que han gestionado el pedido n�mero 10";
			String opcBBBDDALE5=" Visualiza los empleados que han realizado un n�mero de pedidos igual a 10";
			String opcCBBDDALE5=" Visualiza todos los empleados y el n�mero de pedidos que han gestionado, incluyendo el pedido igual a 10";
			
			
		
			
			
			
			
			
			
		//PREGUNTAS DE HTML	
			
			String pregHTMLALE1=" �Cu�l es la forma correcta de insertar un comentario? ";
			String opcAHTMLALE1=" <!--...--> ";
			String opcBHTMLALE1=" <�--...--!>";
			String opcCHTMLALE1=" <comment>";
			
			
		String pregHTMLALE2="�Qu� entiende por HTML?";
			String opcAHTMLALE2=" Hyper Text Mask Language";
			String opcBHTMLALE2=" Hard Text Markup Language";
			String opcCHTMLALE2=" Hyper Text Markup Language";
		
		String pregHTMLALE3=" �C�mo definimos un color en sistema hexadecimal?";
			String opcAHTMLALE3=" <beige>";
			String opcBHTMLALE3=" <245,245,220>s";
			String opcCHTMLALE3=" <#F5F5DC> ";
		
		String pregHTMLALE4=" �Qu� etiquetas pueden figurar en la secci�n <head>?";
			String opcAHTMLALE4="<style>, <meta>, <table>";
			String opcBHTMLALE4=" link>, <title>, <base>";
			String opcCHTMLALE4=" <link>, <meta>, <p>";
		
		String pregHTMLALE5=" �Cu�l crees que es la mejor manera de aplicar estilos a una p�gina web? ";
			String opcAHTMLALE5=" Incluir los estilos en las etiquetas HTML para que se carguen y ejecuten antes";
			String opcBHTMLALE5=" Incluirlos en un fichero externo vinculado a ese fichero HTML";
			String opcCHTMLALE5=" Incluirlos en la secci�n cabecera ('head') para agruparlos en unmismo sitio en la misma p�gina";
			
			
			
			
			
			
			
			
			
			
			//PREGUNTAS DE SISTEMAS

			String pregSISALE1=" �El n�mero 1010 en binario a qu� n�mero decimal corresponde?";
				String opcASISALE1=" 10";
				String opcBSISALE1=" 100";
				String opcCSISALE1=" 1000";
				
			String pregSISALE2="�Podemos a�adir un disco duro nuevo a una m�quina virtual que est� iniciada?";
				String opcASISALE2=" No podemos a�adirlo hasta que la m�quina no est� apagada ";
				String opcBSISALE2=" S� podemos, pero es necesario reiniciar el sistema operativo iniciado para que �ste reconozca el nuevo disco";
				String opcCSISALE2=" S� podemos y el disco duro es reconocido directamente por el sistema operativo que est� iniciado";
			
			String pregSISALE3=" �Qu� es una partici�n?";
				String opcASISALE3=" Una divisi�n l�gica de un disco";
				String opcBSISALE3=" Una divisi�n f�sica de un disco";
				String opcCSISALE3=" Una divisi�n de un disco que puede ser f�sica o l�gica";
			
			String pregSISALE4=" �Qu� tipos de particiones existen?";
				String opcASISALE4=" Primarias y l�gicas";
				String opcBSISALE4=" Primarias, extendidas y l�gicas";
				String opcCSISALE4=" Primarias y secundarias";
			
			String pregSISALE5=" �Qu� significa sobrecargar (overload) un m�todo?";
				String opcASISALE5=" Crear un m�todo con el mismo nombre pero diferentes argumentos";
				String opcBSISALE5=" Cambiarle el nombre dej�ndolo con la misma funcionalidad";
				String opcCSISALE5=" A�adirle funcionalidades a un m�todo";
			
			
				
				
				
				
				
				
			
			//PREGUNTAS SOBRE EL COLEGIO
			
			
			String pregCOLALE1=" �D�nde se lleva a cabo el 'buenos dias' de los jueves?";
				String opcACOLALE1=" Clase";
				String opcBCOLALE1=" Teatro";
				String opcCCOLALE1=" Iglesia";
				
			String pregCOLALE2=" �Que necesitamos antes de un ex�men de base de datos?";
				String opcACOLALE2=" Vaselina";
				String opcBCOLALE2=" Una pata de conejo";
				String opcCCOLALE2=" Una caja de gambas y una paletilla";
				
			String pregCOLALE3=" �Qui�n fracas� en su intento de ser delegado de clase, cuya madre lo humill� a�n mas esa misma tarde siendo elegida delegada de padres?";
				String opcACOLALE3=" Miguel Casado";
				String opcBCOLALE3=" Jaime M�rquez ";
				String opcCCOLALE3=" Ninguna de las respuestas anteriores es correcta";
				
			String pregCOLALE4=" �?";
				String opcACOLALE4=" Visualiza todos los productos que empiecen con el car�cter �A� despu�s el car�cter �_� y despu�s el car�cter %";
				String opcBCOLALE4=" Visualiza todos los productos que no empiecen con el car�cter �A� ni despu�s tengan el car�cter �_� ni despu�s el car�cter %";
				String opcCCOLALE4=" Visualiza todos los productos que no empiezan con A y despu�s no tienen otro car�cter m�s como m�nimo";
				
			String pregCOLALE5="La sentencia SQL �SELECT NombreEmpleado, COUNT(Id_pedido) FROM Pedidos p,empleados e WHERE p.id_empleado=e.id_empleado group by id_pedido HAVING COUNT(Id_pedido)=10 �, �qu� resultado tendr�a?";
				String opcACOLALE5=" Visualiza los empleados que han gestionado el pedido n�mero 10";
				String opcBCOLALE5=" Visualiza los empleados que han realizado un n�mero de pedidos igual a 10";
				String opcCCOLALE5=" Visualiza todos los empleados y el n�mero de pedidos que han gestionado, incluyendo el pedido igual a 10";
				
			
	
	
	
	
	// CONSTRUCTORES

	
	
	// M�TODOS

		
		
	// GETTERS, SETTERS Y TOSTRINGS

}
