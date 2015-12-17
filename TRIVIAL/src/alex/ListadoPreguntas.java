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
			
		String pregProgCAR1="¿A qué hace referencia el comando 'syso'?";
			String opcAProgCAR1="System.out.println();";
			String opcBProgCAR1="System.out.println('');";
			String opcCProgCAR1="System.out.println()";

		String pregProgCAR2="Hemos aprendido que existen arrays unidimensionales y bidimensionales, pero...¿se pueden hacer arrays con más dimensiones?";
			String opcAProgCAR2="Sí, se pueden hacer de infinitas dimensiones.";
			String opcBProgCAR2="No, sólo se pueden hacer de las 2 formas mencionadas.";
			String opcCProgCAR2="No, el límite está en 6 dimensiones.";

		String pregProgCAR3="if(!isMenorDeEdad && calcetines.getColor().equals(Color.WHITE) && ropa.isFea?true:false)";
			String opcAProgCAR3="cliente.darFajoBilletes()?System.out.println('No lo había reconocido Cristiano, pase y disfrute.');:System.out.println('NO ENTRAS');";
			String opcBProgCAR3="System.out.println('NO ENTRAS');";
			String opcCProgCAR3="System.out.println('Puedes entrar.');";

		String pregProgCAR4="¿Qué es un String?";
			String opcAProgCAR4="Un objeto, aunque le puedas pasar directamente una cadena";
			String opcBProgCAR4="Un tipo de variable, ya que se le puede pasar directamente una cadena";
			String opcCProgCAR4="Un atributo";

		String pregProgCAR5="El Javadoc se genera automáticamente al correr el programa en Eclipse.";
			String opcAProgCAR5="Falso, se crea de forma independiente.";
			String opcBProgCAR5="verdadero.";
			String opcCProgCAR5="Si se instala la extensión previamente sí, ya que no viene por defecto.";
		
		
			
			
			
			
			
			
		
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
			
		String pregBBDDCAR1="¿Qué trimestre de BBDD viene con curvas?";
			String opcABBDDCAR1="Todos vienen con curvas y vaselina gratis.";
			String opcBBBDDCAR1="El 2º";
			String opcCBBDDCAR1="El 1º";

		String pregBBDDCAR2="¿Para que sirve la función SOUNDEX?";
			String opcABBDDCAR2="Devuelve el valor fonético del texto.";
			String opcBBBDDCAR2="Devuelve la posición del texto.";
			String opcCBBDDCAR2="Devuelve el ex-valor del texto";

		String pregBBDDCAR3="¿Cómo se consigue el produccto cartesiano de 2 tablas?";
			String opcABBDDCAR3="FROM TABLA1, TABLA2";
			String opcBBBDDCAR3="FROM TABLA1 JOIN TABLA2 USING(ID)";
			String opcCBBDDCAR3="FROM TABLA1 RIGHT JOIN TABLA2";

		String pregBBDDCAR4="¿Qué base de datos es una de las más liosas y con más tablas con que hemos trabajado?";
			String opcABBDDCAR4="NORTHWIND";
			String opcBBBDDCAR4="BUSES";
			String opcCBBDDCAR4="SYSTEM";

		String pregBBDDCAR5="¿Se puede escribir en minúscula las consultas de BBDD?";
			String opcABBDDCAR5="Sí";
			String opcBBBDDCAR5="No";
			String opcCBBDDCAR5="Ninguna de las anteriores";
		
			
			
			
			
			
			
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
			
		String pregHTMLCAR1="Sigue la frase: Header arriba, el contenido en medio y...";
			String opcAHTMLCAR1="... footer abajo.";
			String opcBHTMLCAR1="... no me maqueta la página.";
			String opcCHTMLCAR1="... Rafa me pierdo.";

		String pregHTMLCAR2="Comando para imprimir espacios en blanco en una página web.";
			String opcAHTMLCAR2="&nbsp;";
			String opcBHTMLCAR2="' '";
			String opcCHTMLCAR2="white-space";

		String pregHTMLCAR3="¿Qué etiquetas(entre otras), utilizamos en el head para que nos permita introducir carácteres con tilde y especiales?";
			String opcAHTMLCAR3="<meta charset='UTF-8'>";
			String opcBHTMLCAR3="<meta charset='UTF'>";
			String opcCHTMLCAR3="<data charconfig='UTF8'>";

		String pregHTMLCAR4="¿Qué comando de css sustituye a la etiqueta pre?";
			String opcAHTMLCAR4="white-space: pre;";
			String opcBHTMLCAR4="white-space: pro;";
			String opcCHTMLCAR4="white space: pre;";

		String pregHTMLCAR5="¿Qué le ocurre a Rafa si hay lenguaje a última hora?";
			String opcAHTMLCAR5="Le entra el sueño.";
			String opcBHTMLCAR5="Se enfada.";
			String opcCHTMLCAR5="Le entre risa tonta.";
			
			
			
			
			
			
			
			
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
			
			String pregSISCAR1="Hemos trabajado con";
				String opcASISCAR1="Arduino UNO";
				String opcBSISCAR1="Arduino UNO!";
				String opcCSISCAR1="Arduino UNO1";

			String pregSISCAR2="Los RAIDs principales dados en clase son: RAID0, RAID1 y...";
				String opcASISCAR2="RAID5";
				String opcBSISCAR2="RAIDPRO";
				String opcCSISCAR2="RAID2";

			String pregSISCAR3="¿A qué 'muerte' se asemeja la muerte de Alan Turing?";
				String opcASISCAR3="A la de Blancanieves.";
				String opcBSISCAR3="A la de Bambi.";
				String opcCSISCAR3="Ninguna de las otras.";

			String pregSISCAR4="¿De qué año es el Windows Server que utilizamos en sistemas?";
				String opcASISCAR4="2003";
				String opcBSISCAR4="2000";
				String opcCSISCAR4="2001";

			String pregSISCAR5="Led IR es lo mismo que decir...";
				String opcASISCAR5="Led de infra rojos";
				String opcBSISCAR5="Led transparente";
				String opcCSISCAR5="Led irrespetuoso";
				
				
				
				
				
				
			
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
				
			String pregCOLCAR1="¿Qué cantidad media de mensajes de WhatsApp entran el día anterior de entregar un boletín de BBDD?";
				String opcACOLCAR1="100-200";
				String opcBCOLCAR1="0, nadie sabe hacerlo.";
				String opcCCOLCAR1="5-10";

			String pregCOLCAR2="¿Cuál fue la primera dinámica de grupo qué hicimos con Miguel?";
				String opcACOLCAR2="Ambas cosas";
				String opcBCOLCAR2="Comida de convivencia";
				String opcCCOLCAR2="Preguntas personales a los compañeros y aviones de papel";

			String pregCOLCAR3="¿Quienes reventaron un led RGB en sistemas?";
				String opcACOLCAR3="Felipe y Rafa";
				String opcBCOLCAR3="Fernando Carmona y Galiani";
				String opcCCOLCAR3="Miguel Campos";

			String pregCOLCAR4="¿Cómo se llama el portero?";
				String opcACOLCAR4="Manolo";
				String opcBCOLCAR4="Rafa";
				String opcCCOLCAR4="Pedro";

			String pregCOLCAR5="¿Qué foto se puso inicialmente en el grupo de WhatsApp de clase?";
				String opcACOLCAR5="Alan Turing";
				String opcBCOLCAR5="Don Bosco a lo Kanye West";
				String opcCCOLCAR5="'Todos' en el Dominos";
	
	
				
				
				
				
				
				
				
				String [][] listado ={
						
						{pregProgALE1,opcAProgALE1,opcBProgALE1,opcCProgALE1},
						{pregProgALE2,opcAProgALE2,opcBProgALE2,opcCProgALE2},
						{pregProgALE3,opcAProgALE3,opcBProgALE3,opcCProgALE3},
						{pregProgALE4,opcAProgALE4,opcBProgALE4,opcCProgALE4},
						{pregProgALE5,opcAProgALE5,opcBProgALE5,opcCProgALE5},
						{pregProgCAR1,opcAProgCAR1,opcBProgCAR1,opcCProgCAR1},
				
				}	;









				
				
				
				
				
				
	
	
	// CONSTRUCTORES

	
	
	// MÉTODOS

	
				
				
				
				
				
				
				
				
		
		
	// GETTERS, SETTERS Y TOSTRINGS

				public String[][] getListado() {
					return listado;
				}
				public void setListado(String[][] listado) {
					this.listado = listado;
				}	
								
				
				
				
				
}
