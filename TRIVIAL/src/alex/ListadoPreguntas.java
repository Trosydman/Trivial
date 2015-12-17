package alex;

public class ListadoPreguntas {
	//ATRIBUTOS
	public static final int PROG = 0;
	public static final int BBDD = 1;
	public static final int HTML = 2;
	public static final int SIS = 3;
	public static final int COL = 4;
	
	
	
	//PREGUNTAS DE PROGAMACIÓN

		String pregProgALE1=" ¿Que es una cadena?";
			String opcAProgALE1=" Es una clase que no puede ser instanciada";
			String opcBProgALE1=" Secuencia de caracteres delimitada entre dobles comillas";
			String opcCProgALE1=" Secuencia de caracteres delimitada entre comillas simples";
			
		String pregProgALE2="¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?";
			String opcAProgALE2=" Es un tipo particular de variable";
			String opcBProgALE2=" Es un modelo o plantilla a partir de la cual creamos objetos";
			String opcCProgALE2=" Es una categoria de datos ordenada secuencialmente";
		
		String pregProgALE3=" ¿Qué elementos crees que definen a un objeto?";
			String opcAProgALE3=" Sus cardinalidad y su tipo";
			String opcBProgALE3=" Sus atributos y sus métodos";
			String opcCProgALE3=" La forma en que establece comunicación e intercambia mensajes ";
		
		String pregProgALE4=" ¿Qué significa instanciar una clase?";
			String opcAProgALE4=" Duplicar una clase";
			String opcBProgALE4=" Conectar dos clases entre sí";
			String opcCProgALE4=" Crear un objeto a partir de la clase";
		
		String pregProgALE5=" ¿Qué significa sobrecargar (overload) un método?";
			String opcAProgALE5=" Crear un método con el mismo nombre pero diferentes argumentos";
			String opcBProgALE5=" Cambiarle el nombre dejándolo con la misma funcionalidad";
			String opcCProgALE5=" Añadirle funcionalidades a un método";
		
		
			
			
			
			
			
			
		
		//PREGUNTAS DE BASE DE DATOS
		
		
		String pregBBDDALE1=" ¿Qué es el grado de una relación?";
			String opcABBDDALE1="  Es el número de atributos que contiene la relación";
			String opcBBBDDALE1=" Es el número de tuplas que contiene la relación";
			String opcCBBDDALE1=" Ninguna de las respuestas anteriores es correcta";
			
		String pregBBDDALE2=" Oracle es un SGBD que cumple el modelo:";
			String opcABBDDALE2=" Modelo de base de datos en red";
			String opcBBBDDALE2=" Modelo de base de datos jerárquico";
			String opcCBBDDALE2=" Modelo de base de datos relacional";
			
		String pregBBDDALE3=" La sentencia SQL “SELECT NombreEmpleado, salario,comision FROM empleados WHERE comision IS NOT NULL”, ¿qué resultado tendría?";
			String opcABBDDALE3=" Visualiza todos los empleados que no tienen comisión";
			String opcBBBDDALE3=" Visualiza todos los empleados con sus respectivos salarios y comisiones";
			String opcCBBDDALE3=" Ninguna de las respuestas anteriores es correcta";
			
		String pregBBDDALE4=" La sentencia SQL “SELECT Nombreproducto,precio FROM productos WHERE nombreproducto NOT LIKE ‘A_%’ ”, ¿qué resultado tendría?";
			String opcABBDDALE4=" Visualiza todos los productos que empiecen con el carácter “A” después el carácter “_” y después el carácter %";
			String opcBBBDDALE4=" Visualiza todos los productos que no empiecen con el carácter “A” ni después tengan el carácter “_” ni después el carácter %";
			String opcCBBDDALE4=" Visualiza todos los productos que no empiezan con A y después no tienen otro carácter más como mínimo";
			
		String pregBBDDALE5="La sentencia SQL “SELECT NombreEmpleado, COUNT(Id_pedido) FROM Pedidos p,empleados e WHERE p.id_empleado=e.id_empleado group by id_pedido HAVING COUNT(Id_pedido)=10 ”, ¿qué resultado tendría?";
			String opcABBDDALE5=" Visualiza los empleados que han gestionado el pedido número 10";
			String opcBBBDDALE5=" Visualiza los empleados que han realizado un número de pedidos igual a 10";
			String opcCBBDDALE5=" Visualiza todos los empleados y el número de pedidos que han gestionado, incluyendo el pedido igual a 10";
			
			
		
			
			
			
			
			
			
		//PREGUNTAS DE HTML	
			
			String pregHTMLALE1=" ¿Cuál es la forma correcta de insertar un comentario? ";
			String opcAHTMLALE1=" <!--...--> ";
			String opcBHTMLALE1=" <¡--...--!>";
			String opcCHTMLALE1=" <comment>";
			
			
		String pregHTMLALE2="¿Qué entiende por HTML?";
			String opcAHTMLALE2=" Hyper Text Mask Language";
			String opcBHTMLALE2=" Hard Text Markup Language";
			String opcCHTMLALE2=" Hyper Text Markup Language";
		
		String pregHTMLALE3=" ¿Cómo definimos un color en sistema hexadecimal?";
			String opcAHTMLALE3=" <beige>";
			String opcBHTMLALE3=" <245,245,220>s";
			String opcCHTMLALE3=" <#F5F5DC> ";
		
		String pregHTMLALE4=" ¿Qué etiquetas pueden figurar en la sección <head>?";
			String opcAHTMLALE4="<style>, <meta>, <table>";
			String opcBHTMLALE4=" link>, <title>, <base>";
			String opcCHTMLALE4=" <link>, <meta>, <p>";
		
		String pregHTMLALE5=" ¿Cuál crees que es la mejor manera de aplicar estilos a una página web? ";
			String opcAHTMLALE5=" Incluir los estilos en las etiquetas HTML para que se carguen y ejecuten antes";
			String opcBHTMLALE5=" Incluirlos en un fichero externo vinculado a ese fichero HTML";
			String opcCHTMLALE5=" Incluirlos en la sección cabecera ('head') para agruparlos en unmismo sitio en la misma página";
			
			
			
			
			
			
			
			
			
			
			//PREGUNTAS DE SISTEMAS

			String pregSISALE1=" ¿El número 1010 en binario a qué número decimal corresponde?";
				String opcASISALE1=" 10";
				String opcBSISALE1=" 100";
				String opcCSISALE1=" 1000";
				
			String pregSISALE2="¿Podemos añadir un disco duro nuevo a una máquina virtual que está iniciada?";
				String opcASISALE2=" No podemos añadirlo hasta que la máquina no esté apagada ";
				String opcBSISALE2=" Sí podemos, pero es necesario reiniciar el sistema operativo iniciado para que éste reconozca el nuevo disco";
				String opcCSISALE2=" Sí podemos y el disco duro es reconocido directamente por el sistema operativo que está iniciado";
			
			String pregSISALE3=" ¿Qué es una partición?";
				String opcASISALE3=" Una división lógica de un disco";
				String opcBSISALE3=" Una división física de un disco";
				String opcCSISALE3=" Una división de un disco que puede ser física o lógica";
			
			String pregSISALE4=" ¿Qué tipos de particiones existen?";
				String opcASISALE4=" Primarias y lógicas";
				String opcBSISALE4=" Primarias, extendidas y lógicas";
				String opcCSISALE4=" Primarias y secundarias";
			
			String pregSISALE5=" ¿Qué significa sobrecargar (overload) un método?";
				String opcASISALE5=" Crear un método con el mismo nombre pero diferentes argumentos";
				String opcBSISALE5=" Cambiarle el nombre dejándolo con la misma funcionalidad";
				String opcCSISALE5=" Añadirle funcionalidades a un método";
			
			
				
				
				
				
				
				
			
			//PREGUNTAS SOBRE EL COLEGIO
			
			
			String pregCOLALE1=" ¿Dónde se lleva a cabo el 'buenos dias' de los jueves?";
				String opcACOLALE1=" Clase";
				String opcBCOLALE1=" Teatro";
				String opcCCOLALE1=" Iglesia";
				
			String pregCOLALE2=" ¿Que necesitamos antes de un exámen de base de datos?";
				String opcACOLALE2=" Vaselina";
				String opcBCOLALE2=" Una pata de conejo";
				String opcCCOLALE2=" Una caja de gambas y una paletilla";
				
			String pregCOLALE3=" ¿Quién fracasó en su intento de ser delegado de clase, cuya madre lo humilló aún mas esa misma tarde siendo elegida delegada de padres?";
				String opcACOLALE3=" Miguel Casado";
				String opcBCOLALE3=" Jaime Márquez ";
				String opcCCOLALE3=" Ninguna de las respuestas anteriores es correcta";
				
			String pregCOLALE4=" ¿?";
				String opcACOLALE4=" Visualiza todos los productos que empiecen con el carácter “A” después el carácter “_” y después el carácter %";
				String opcBCOLALE4=" Visualiza todos los productos que no empiecen con el carácter “A” ni después tengan el carácter “_” ni después el carácter %";
				String opcCCOLALE4=" Visualiza todos los productos que no empiezan con A y después no tienen otro carácter más como mínimo";
				
			String pregCOLALE5="La sentencia SQL “SELECT NombreEmpleado, COUNT(Id_pedido) FROM Pedidos p,empleados e WHERE p.id_empleado=e.id_empleado group by id_pedido HAVING COUNT(Id_pedido)=10 ”, ¿qué resultado tendría?";
				String opcACOLALE5=" Visualiza los empleados que han gestionado el pedido número 10";
				String opcBCOLALE5=" Visualiza los empleados que han realizado un número de pedidos igual a 10";
				String opcCCOLALE5=" Visualiza todos los empleados y el número de pedidos que han gestionado, incluyendo el pedido igual a 10";
				
			
	
	
	
	
	// CONSTRUCTORES

	
	
	// Mï¿½TODOS

		
		
	// GETTERS, SETTERS Y TOSTRINGS

}
