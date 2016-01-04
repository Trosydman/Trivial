package alex;

import java.util.Random;

import carlos.Casilla;
import carlos.Equipo;
import leer_por_teclado.Leer;

public class ListadoPreguntas {

	// PREGUNTAS DE PROGAMACIÓN

	String pregProgALE1 = " ¿Qué es una cadena?";
	String opcAProgALE1 = " Secuencia de caracteres delimitada entre dobles comillas";
	String opcBProgALE1 = " Es una clase que no puede ser instanciada";
	String opcCProgALE1 = " Secuencia de caracteres delimitada entre comillas simples";

	String pregProgALE2 = " ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programaciónn orientada a objetos?";
	String opcAProgALE2 = " Es un modelo o plantilla a partir de la cual creamos objetos";
	String opcBProgALE2 = " Es un tipo particular de variable";
	String opcCProgALE2 = " Es una categoria de datos ordenada secuencialmente";

	String pregProgALE3 = " ¿Qué elementos crees que definen a un objeto?";
	String opcAProgALE3 = " Sus atributos y sus métodos";
	String opcBProgALE3 = " Sus cardinalidad y su tipo";
	String opcCProgALE3 = " La forma en que establece comunicación e intercambia mensajes ";

	String pregProgALE4 = " ¿Qué significa instanciar una clase?";
	String opcAProgALE4 = " Crear un objeto a partir de la clase";
	String opcBProgALE4 = " Conectar dos clases entre sí";
	String opcCProgALE4 = " Duplicar una clase";

	String pregProgALE5 = " ¿Qué significa sobrecargar (overload) un método?";
	String opcAProgALE5 = " Crear un método con el mismo nombre pero diferentes argumentos";
	String opcBProgALE5 = " Cambiarle el nombre dejándolo con la misma funcionalidad";
	String opcCProgALE5 = " Añadirle funcionalidades a un método";

	String pregProgCAR1 = " ¿A qué hace referencia el comando 'syso'?";
	String opcAProgCAR1 = " System.out.println();";
	String opcBProgCAR1 = " System.out.println('');";
	String opcCProgCAR1 = " System.out.println()";

	String pregProgCAR2 = " Hemos aprendido que existen arrays unidimensionales y bidimensionales, pero...¿se pueden hacer arrays con más dimensiones?";
	String opcAProgCAR2 = " Sí, se pueden hacer de infinitas dimensiones.";
	String opcBProgCAR2 = " No, sólo se pueden hacer de las 2 formas mencionadas.";
	String opcCProgCAR2 = " No, el límite está en 6 dimensiones.";

	String pregProgCAR3 = " if(!isMenorDeEdad && calcetines.getColor().equals(Color.WHITE) && ropa.isFea?true:false)";
	String opcAProgCAR3 = " cliente.darFajoBilletes()?System.out.println('No lo había reconocido Cristiano, pase y disfrute.');:System.out.println('NO ENTRAS');";
	String opcBProgCAR3 = " System.out.println('NO ENTRAS');";
	String opcCProgCAR3 = " System.out.println('Puedes entrar.');";

	String pregProgCAR4 = " ¿Qué es un String?";
	String opcAProgCAR4 = " Un objeto, aunque le puedas pasar directamente una cadena";
	String opcBProgCAR4 = " Un tipo de variable, ya que se le puede pasar directamente una cadena";
	String opcCProgCAR4 = " Un atributo";

	String pregProgCAR5 = " El Javadoc se genera automáticamente al correr el programa en Eclipse.";
	String opcAProgCAR5 = " Falso, se crea de forma independiente.";
	String opcBProgCAR5 = " verdadero.";
	String opcCProgCAR5 = " Si se instala la extensión previamente sí, ya que no viene por defecto.";

	String pregProgFEL1 = " Las instancias de una clase son:";
	String opcAProgFEL1 = " Los objetos creados.";
	String opcBProgFEL1 = " Darle valores a todos los atributos.";
	String opcCProgFEL1 = " Establecer los constructores de la clase.";

	String pregProgFEL2 = " Generar un to String en una clase consigue:";
	String opcAProgFEL2 = " Imprimir los valores que esten guardados en los atributos.";
	String opcBProgFEL2 = " Comprobar los valores que esten guardados sean correctos.";
	String opcCProgFEL2 = " Reestablecer valores en los atributos.";

	String pregProgFEL3 = " Un método es:";
	String opcAProgFEL3 = " Una operacion que se realiza solo cuando es llamado";
	String opcBProgFEL3 = " Una operacion que se realiza automaticamente al ejecutar el programa.";
	String opcCProgFEL3 = " Una operacion que solo se dedica a imprimir resultados.";

	String pregProgFEL4 = " La regla general de JAVA a la hora de dar nombres a metodos y atributos. Si tiene varias palabras...";
	String opcAProgFEL4 = " La primera letra de cada palabra debe ser mayuscula y sin espacios entre palabras.";
	String opcBProgFEL4 = " Deben ir todas las letras en mayusculas y entre palabras con barra baja.";
	String opcCProgFEL4 = " Deben ir las letras en minusculas y puedes poner espacios entre palabras.";

	String pregProgFEL5 = " En un arrays se puede guardar cualquier dato/objeto.";
	String opcAProgFEL5 = " Sí, siempre y cuando sean del mismo tipo que se ha establecido.";
	String opcBProgFEL5 = " Sí, pero solo cuando tiene la misma longitud de caracteres.";
	String opcCProgFEL5 = " No, porque en un arrays no se puede guardar nada.";

	String pregProgNOL1 = " ¿Cuantas opciones tenemos para generar números aleatorios...?";
	String opcAProgNOL1 = " Dos";
	String opcBProgNOL1 = " Cinco";
	String opcCProgNOL1 = " Tres";

	String pregProgNOL2 = " ¿Qué es mas importante para un programador las clases o los objetos";
	String opcAProgNOL2 = " Ambos son importantes";
	String opcBProgNOL2 = " Los objetos";
	String opcCProgNOL2 = " Las clases";

	String pregProgNOL3 = " ¿Cuando  una clase no es publica de que tipo es su nivel de acceso?";
	String opcAProgNOL3 = " Private";
	String opcBProgNOL3 = " Default";
	String opcCProgNOL3 = " Abstract";

	String pregProgNOL4 = " ¿Qué sucede cuando un objeto modifica una variable de clase?";
	String opcAProgNOL4 = " Al modificarla se hace  visible a todos los objetos";
	String opcBProgNOL4 = " Se hace visible solo parta el objeto que  la modifica";
	String opcCProgNOL4 = " Ninguna de las anteriores";

	String pregProgNOL5 = " ¿En que momento se invoca el método constructor?";
	String opcAProgNOL5 = "Después de crear un objeto";
	String opcBProgNOL5 = "Cuando se crea el main";
	String opcCProgNOL5 = "Cuando es llamado por un objeto";

	String pregProgGER1 = " Los datos elementales están compuestos por...";
	String opcAProgGER1 = " Numéricos, Alfanuméricos y Lógicos/Booleanos.";
	String opcBProgGER1 = " Numéricos, Alfanuméricos y Cardinales.";
	String opcCProgGER1 = " Numéricos, Hexadecimales y Lógicos/Booleanos.";

	String pregProgGER2 = "En la tabla de Tokens podemos encontrar palabras como...";
	String opcAProgGER2 = "break, new, true, return, final.";
	String opcBProgGER2 = "break, old, true, return, final.";
	String opcCProgGER2 = "break, old, true, retorno, final.";

	String pregProgGER3 = "En llas estructuras de repetición podemos encontrarnos con ...";
	String opcAProgGER3 = "while, do...while y for.";
	String opcBProgGER3 = "while, dont't...while y forgiven.";
	String opcCProgGER3 = "while, do...while y forgiven.";

	String pregProgGER4 = "En las estructuras de selección podemos encontrar...";
	String opcAProgGER4 = "if, if-else y switch.";
	String opcBProgGER4 = "if, if-else y switcher.";
	String opcCProgGER4 = "if, if-also y switch.";

	String pregProgGER5 = "Un valor de un boolean por defecto es...";
	String opcAProgGER5 = "false.";
	String opcBProgGER5 = "true.";
	String opcCProgGER5 = "ninguna, o se define o no compila.";

	// PREGUNTAS DE BASE DE DATOS

	String pregBBDDALE1 = " ï¿½Quï¿½ es el grado de una relaciï¿½n?";
	String opcABBDDALE1 = "  Es el nï¿½mero de atributos que contiene la relaciï¿½n";
	String opcBBBDDALE1 = " Es el nï¿½mero de tuplas que contiene la relaciï¿½n";
	String opcCBBDDALE1 = " Ninguna de las respuestas anteriores es correcta";

	String pregBBDDALE2 = " Oracle es un SGBD que cumple el modelo:";
	String opcABBDDALE2 = " Modelo de base de datos en red";
	String opcBBBDDALE2 = " Modelo de base de datos jerï¿½rquico";
	String opcCBBDDALE2 = " Modelo de base de datos relacional";

	String pregBBDDALE3 = " La sentencia SQL ï¿½SELECT NombreEmpleado, salario,comision FROM empleados WHERE comision IS NOT NULLï¿½, ï¿½quï¿½ resultado tendrï¿½a?";
	String opcABBDDALE3 = " Visualiza todos los empleados que no tienen comisiï¿½n";
	String opcBBBDDALE3 = " Visualiza todos los empleados con sus respectivos salarios y comisiones";
	String opcCBBDDALE3 = " Ninguna de las respuestas anteriores es correcta";

	String pregBBDDALE4 = " La sentencia SQL ï¿½SELECT Nombreproducto,precio FROM productos WHERE nombreproducto NOT LIKE ï¿½A_%ï¿½ ï¿½, ï¿½quï¿½ resultado tendrï¿½a?";
	String opcABBDDALE4 = " Visualiza todos los productos que empiecen con el carï¿½cter ï¿½Aï¿½ despuï¿½s el carï¿½cter ï¿½_ï¿½ y despuï¿½s el carï¿½cter %";
	String opcBBBDDALE4 = " Visualiza todos los productos que no empiecen con el carï¿½cter ï¿½Aï¿½ ni despuï¿½s tengan el carï¿½cter ï¿½_ï¿½ ni despuï¿½s el carï¿½cter %";
	String opcCBBDDALE4 = " Visualiza todos los productos que no empiezan con A y despuï¿½s no tienen otro carï¿½cter mï¿½s como mï¿½nimo";

	String pregBBDDALE5 = "La sentencia SQL ï¿½SELECT NombreEmpleado, COUNT(Id_pedido) FROM Pedidos p,empleados e WHERE p.id_empleado=e.id_empleado group by id_pedido HAVING COUNT(Id_pedido)=10 ï¿½, ï¿½quï¿½ resultado tendrï¿½a?";
	String opcABBDDALE5 = " Visualiza los empleados que han gestionado el pedido nï¿½mero 10";
	String opcBBBDDALE5 = " Visualiza los empleados que han realizado un nï¿½mero de pedidos igual a 10";
	String opcCBBDDALE5 = " Visualiza todos los empleados y el nï¿½mero de pedidos que han gestionado, incluyendo el pedido igual a 10";

	String pregBBDDCAR1 = "ï¿½Quï¿½ trimestre de BBDD viene con curvas?";
	String opcABBDDCAR1 = "Todos vienen con curvas y vaselina gratis.";
	String opcBBBDDCAR1 = "El 2ï¿½";
	String opcCBBDDCAR1 = "El 1ï¿½";

	String pregBBDDCAR2 = "ï¿½Para que sirve la funciï¿½n SOUNDEX?";
	String opcABBDDCAR2 = "Devuelve el valor fonï¿½tico del texto.";
	String opcBBBDDCAR2 = "Devuelve la posiciï¿½n del texto.";
	String opcCBBDDCAR2 = "Devuelve el ex-valor del texto";

	String pregBBDDCAR3 = "ï¿½Cï¿½mo se consigue el produccto cartesiano de 2 tablas?";
	String opcABBDDCAR3 = "FROM TABLA1, TABLA2";
	String opcBBBDDCAR3 = "FROM TABLA1 JOIN TABLA2 USING(ID)";
	String opcCBBDDCAR3 = "FROM TABLA1 RIGHT JOIN TABLA2";

	String pregBBDDCAR4 = "ï¿½Quï¿½ base de datos es una de las mï¿½s liosas y con mï¿½s tablas con que hemos trabajado?";
	String opcABBDDCAR4 = "NORTHWIND";
	String opcBBBDDCAR4 = "BUSES";
	String opcCBBDDCAR4 = "SYSTEM";

	String pregBBDDCAR5 = "ï¿½Se puede escribir en minï¿½scula las consultas de BBDD?";
	String opcABBDDCAR5 = "Sï¿½";
	String opcBBBDDCAR5 = "No";
	String opcCBBDDCAR5 = "Ninguna de las anteriores";

	String pregBBDDFEL1 = "Indica la condicion que debe cumplir una tupla.";
	String opcABBDDFEL1 = "Cada tupla se debe corresponder con un elemento del mundo real.";
	String opcBBBDDFEL1 = "Todas las tuplas deben estar llenas de datos.";
	String opcCBBDDFEL1 = "Puede haber dos tuplas iguales(con todos los valores iguales).";

	String pregBBDDFEL2 = "El grado...";
	String opcABBDDFEL2 = "Cuanto mayor es el grado de una relacion, mayor es su complejidad.";
	String opcBBBDDFEL2 = "Cuanto menor es el grado de una relacion, mayor es su complejidad.";
	String opcCBBDDFEL2 = "Cuanto mayor es el grado de una relacion, menor es su complejidad.";

	String pregBBDDFEL3 = "Un sinï¿½nimo de atributo es...";
	String opcABBDDFEL3 = "Campo.";
	String opcBBBDDFEL3 = "Registro.";
	String opcCBBDDFEL3 = "Fichero.";

	String pregBBDDFEL4 = "Usando la aritmï¿½tica clï¿½sica en valores lï¿½gicos. Si 0.5 es nulo, 1 y 0, respectivamente, son...";
	String opcABBDDFEL4 = "Verdadero y falso.";
	String opcBBBDDFEL4 = "Falso y Verdadero.";
	String opcCBBDDFEL4 = "Ninguna de las otras dos respuestas.";

	String pregBBDDFEL5 = "Cï¿½mo se denomina la tabla que proporciona Oracle para realizar consultas a modo de prueba.";
	String opcABBDDFEL5 = "DUAL.";
	String opcBBBDDFEL5 = "EMPLOYEES.";
	String opcCBBDDFEL5 = "PROOF.";

	String pregBBDDNOL1 = "En que aÃ±o se publica el documento que definio el modelo relacional";
	String opcABBDDNOL1 = "1970";
	String opcBBBDDNOL1 = "1972";
	String opcCBBDDNOL1 = "1968";

	String pregBBDDNOL2 = "Cuantas formas normales existen en el modelo relacional";
	String opcABBDDNOL2 = "Seis";
	String opcBBBDDNOL2 = "Ocho";
	String opcCBBDDNOL2 = "Diez";

	String pregBBDDNOL3 = "En que momento utiliza la plicaciÃ³n del lÃ¡tigo luismi";
	String opcABBDDNOL3 = "En los examenes";
	String opcBBBDDNOL3 = "AL corregir los ejercicios";
	String opcCBBDDNOL3 = "En los ejercicios de evaluacion";

	String pregBBDDNOL4 = "Para que sirve la palabra DISTINCT en una base de datos";
	String opcABBDDNOL4 = "Para no mostrar los valores duplicados";
	String opcBBBDDNOL4 = "Para diferenciar una tabla de otra";
	String opcCBBDDNOL4 = "Para mostrar varias tuplas";

	String pregBBDDNOL5 = "QuÃ© es SQL";
	String opcABBDDNOL5 = "una interfas de usuario";
	String opcBBBDDNOL5 = "Un programa de oracle";
	String opcCBBDDNOL5 = "Un lenguaje de programacion";

	String pregBBDDGER1 = "En los ficheros indexados una de las características es...";
	String opcABBDDGER1 = "El lento acceso.";
	String opcBBBDDGER1 = "El acceso rápido o lento según la rapidez del procesador.";
	String opcCBBDDGER1 = "El rápido acceso.";

	String pregBBDDGER2 = "En los ficheros con resgistros de tamaño dinámico encontramos...";
	String opcABBDDGER2 = "Difícil acceso, lo cual es una desventaja.";
	String opcBBBDDGER2 = "Difícil acceso, lo cual es una ventaja.";
	String opcCBBDDGER2 = "Acceso remoto, lo cual es una desventaja.";

	String pregBBDDGER3 = "En los ficheros con registros de tamaño estatico...";
	String opcABBDDGER3 = "Hay difícil acceso y baja flexibilidad.";
	String opcBBBDDGER3 = "Hay fácil acceso y baja flexibilidad.";
	String opcCBBDDGER3 = "Hay fácil acceso y alta flexibilidad.";

	String pregBBDDGER4 = "Una propiedad de una tabla indica que...";
	String opcABBDDGER4 = "Cada atributo de la tabla toma un solo valor en cada tupla.";
	String opcBBBDDGER4 = "Cada atributo de la tabla toma varios valores en cada tupla.";
	String opcCBBDDGER4 = "Cada atributo de la tabla toma dos valores en cada tupla.";

	String pregBBDDGER5 = "En los valores lógicos de una consulta nos podemos encontrar como operador de valores lógicos...";
	String opcABBDDGER5 = "AND, OR, NOT.";
	String opcBBBDDGER5 = "AND, OR, YES.";
	String opcCBBDDGER5 = "AND, OF, YES.";

	// PREGUNTAS DE HTML

	String pregHTMLALE1 = " ï¿½Cuï¿½l es la forma correcta de insertar un comentario? ";
	String opcAHTMLALE1 = " <!--...--> ";
	String opcBHTMLALE1 = " <ï¿½--...--!>";
	String opcCHTMLALE1 = " <comment>";

	String pregHTMLALE2 = "ï¿½Quï¿½ entiende por HTML?";
	String opcAHTMLALE2 = " Hyper Text Mask Language";
	String opcBHTMLALE2 = " Hard Text Markup Language";
	String opcCHTMLALE2 = " Hyper Text Markup Language";

	String pregHTMLALE3 = " ï¿½Cï¿½mo definimos un color en sistema hexadecimal?";
	String opcAHTMLALE3 = " <beige>";
	String opcBHTMLALE3 = " <245,245,220>s";
	String opcCHTMLALE3 = " <#F5F5DC> ";

	String pregHTMLALE4 = " ï¿½Quï¿½ etiquetas pueden figurar en la secciï¿½n <head>?";
	String opcAHTMLALE4 = "<style>, <meta>, <table>";
	String opcBHTMLALE4 = " link>, <title>, <base>";
	String opcCHTMLALE4 = " <link>, <meta>, <p>";

	String pregHTMLALE5 = " ï¿½Cuï¿½l crees que es la mejor manera de aplicar estilos a una pï¿½gina web? ";
	String opcAHTMLALE5 = " Incluir los estilos en las etiquetas HTML para que se carguen y ejecuten antes";
	String opcBHTMLALE5 = " Incluirlos en un fichero externo vinculado a ese fichero HTML";
	String opcCHTMLALE5 = " Incluirlos en la secciï¿½n cabecera ('head') para agruparlos en unmismo sitio en la misma pï¿½gina";

	String pregHTMLCAR1 = "Sigue la frase: Header arriba, el contenido en medio y...";
	String opcAHTMLCAR1 = "... footer abajo.";
	String opcBHTMLCAR1 = "... no me maqueta la pï¿½gina.";
	String opcCHTMLCAR1 = "... Rafa me pierdo.";

	String pregHTMLCAR2 = "Comando para imprimir espacios en blanco en una pï¿½gina web.";
	String opcAHTMLCAR2 = "&nbsp;";
	String opcBHTMLCAR2 = "' '";
	String opcCHTMLCAR2 = "white-space";

	String pregHTMLCAR3 = "ï¿½Quï¿½ etiquetas(entre otras), utilizamos en el head para que nos permita introducir carï¿½cteres con tilde y especiales?";
	String opcAHTMLCAR3 = "<meta charset='UTF-8'>";
	String opcBHTMLCAR3 = "<meta charset='UTF'>";
	String opcCHTMLCAR3 = "<data charconfig='UTF8'>";

	String pregHTMLCAR4 = "ï¿½Quï¿½ comando de css sustituye a la etiqueta pre?";
	String opcAHTMLCAR4 = "white-space: pre;";
	String opcBHTMLCAR4 = "white-space: pro;";
	String opcCHTMLCAR4 = "white space: pre;";

	String pregHTMLCAR5 = "ï¿½Quï¿½ le ocurre a Rafa si hay lenguaje a ï¿½ltima hora?";
	String opcAHTMLCAR5 = "Le entra el sueï¿½o.";
	String opcBHTMLCAR5 = "Se enfada.";
	String opcCHTMLCAR5 = "Le entre risa tonta.";

	String pregHTMLNOL1 = "Para que sirve el lenguaje de programacion CSS";
	String opcAHTMLNOL1 = "Para dar estilo a una pagina web";
	String opcBHTMLNOL1 = "Para crear una pagina web";
	String opcCHTMLNOL1 = "Para que el navegador la sea mas rapido";

	String pregHTMLNOL2 = "QuÃ© es HTML5";
	String opcAHTMLNOL2 = "Un concepto nuevo para la creacion de paginas web";
	String opcBHTMLNOL2 = "Una mejora de esta ya antigua tecnologÃ­a";
	String opcCHTMLNOL2 = "Una vercion del antiguo lenguaje de etiquetas";

	String pregHTMLNOL3 = "Cuantas caracteristicas provee HTML5";
	String opcAHTMLNOL3 = "Tres";
	String opcBHTMLNOL3 = "Cien";
	String opcCHTMLNOL3 = "Treinta";

	String pregHTMLNOL4 = "En que momento vemos mas serio a rafa";
	String opcAHTMLNOL4 = "En los examnes y ejercicios de evaluacion";
	String opcBHTMLNOL4 = "En el recreo";
	String opcCHTMLNOL4 = "Explicando en clase";

	String pregHTMLNOL5 = "<header>, <nav>, <section>, <aside>, <footer>, <article>, <figure>... Que son? ";
	String opcAHTMLNOL5 = "Elementos";
	String opcBHTMLNOL5 = "Etiquetas";
	String opcCHTMLNOL5 = "Cajas o contenedores";

	String pregHTMLGER1 = "Una herramienta con la que podemos editar de manera eficiente HTML es... ";
	String opcAHTMLGER1 = "Sublime Text.";
	String opcBHTMLGER1 = "Sublime Texteo.";
	String opcCHTMLGER1 = "Texteo Sublime.";

	String pregHTMLGER2 = "Elija la etiqueta apropiada para un texto en negrita.";
	String opcAHTMLGER2 = "<b>";
	String opcBHTMLGER2 = "<bold>";
	String opcCHTMLGER2 = "<bb>";

	String pregHTMLGER3 = "Elija la etiqueta que nos dá el título más grande.";
	String opcAHTMLGER3 = "<h1>";
	String opcBHTMLGER3 = "<h6>";
	String opcCHTMLGER3 = "<head>";

	String pregHTMLGER4 = "¿Qué etiqueta define un salto de línea?";
	String opcAHTMLGER4 = "<br>";
	String opcBHTMLGER4 = "<break>";
	String opcCHTMLGER4 = "<linebreak>";

	String pregHTMLGER5 = "¿Qué etiqueta utilizamos para insertar una línea horizontal? ";
	String opcAHTMLGER5 = "<hr>";
	String opcBHTMLGER5 = "<br>";
	String opcCHTMLGER5 = "<line>";

	String pregHTMLFEL1 = "Indica el elemento para que un texto aparezca con sombras.";
	String opcAHTMLFEL1 = "text-shadows.";
	String opcBHTMLFEL1 = "text-align.";
	String opcCHTMLFEL1 = "text-indent.";

	String pregHTMLFEL2 = "La fuente 'arial black' a que tipo de fuente corresponde.";
	String opcAHTMLFEL2 = "sans-serif.";
	String opcBHTMLFEL2 = "serif.";
	String opcCHTMLFEL2 = "fantasy.";

	String pregHTMLFEL3 = "'em' es una...";
	String opcAHTMLFEL3 = "medida.";
	String opcBHTMLFEL3 = "etiqueta.";
	String opcCHTMLFEL3 = "condicion.";

	String pregHTMLFEL4 = "Las siglas 'CSS' corresponde a:";
	String opcAHTMLFEL4 = "Cascading Style Sheets.";
	String opcBHTMLFEL4 = "Center Style Sheets.";
	String opcCHTMLFEL4 = "Can She Shave";

	String pregHTMLFEL5 = "Las siglas 'HTML' corresponde a:";
	String opcAHTMLFEL5 = "Hyper Text Markup Language";
	String opcBHTMLFEL5 = "Hall To Main Language";
	String opcCHTMLFEL5 = "High Text Markup Language";

	// PREGUNTAS DE SISTEMAS

	String pregSISALE1 = " ï¿½El nï¿½mero 1010 en binario a quï¿½ nï¿½mero decimal corresponde?";
	String opcASISALE1 = " 10";
	String opcBSISALE1 = " 100";
	String opcCSISALE1 = " 1000";

	String pregSISALE2 = "ï¿½Podemos aï¿½adir un disco duro nuevo a una mï¿½quina virtual que estï¿½ iniciada?";
	String opcASISALE2 = " No podemos aï¿½adirlo hasta que la mï¿½quina no estï¿½ apagada ";
	String opcBSISALE2 = " Sï¿½ podemos, pero es necesario reiniciar el sistema operativo iniciado para que ï¿½ste reconozca el nuevo disco";
	String opcCSISALE2 = " Sï¿½ podemos y el disco duro es reconocido directamente por el sistema operativo que estï¿½ iniciado";

	String pregSISALE3 = " ï¿½Quï¿½ es una particiï¿½n?";
	String opcASISALE3 = " Una divisiï¿½n lï¿½gica de un disco";
	String opcBSISALE3 = " Una divisiï¿½n fï¿½sica de un disco";
	String opcCSISALE3 = " Una divisiï¿½n de un disco que puede ser fï¿½sica o lï¿½gica";

	String pregSISALE4 = " ï¿½Quï¿½ tipos de particiones existen?";
	String opcASISALE4 = " Primarias y lï¿½gicas";
	String opcBSISALE4 = " Primarias, extendidas y lï¿½gicas";
	String opcCSISALE4 = " Primarias y secundarias";

	String pregSISALE5 = " ï¿½Quï¿½ significa sobrecargar (overload) un mï¿½todo?";
	String opcASISALE5 = " Crear un mï¿½todo con el mismo nombre pero diferentes argumentos";
	String opcBSISALE5 = " Cambiarle el nombre dejï¿½ndolo con la misma funcionalidad";
	String opcCSISALE5 = " Aï¿½adirle funcionalidades a un mï¿½todo";

	String pregSISCAR1 = "Hemos trabajado con";
	String opcASISCAR1 = "Arduino UNO";
	String opcBSISCAR1 = "Arduino UNO!";
	String opcCSISCAR1 = "Arduino UNO1";

	String pregSISCAR2 = "Los RAIDs principales dados en clase son: RAID0, RAID1 y...";
	String opcASISCAR2 = "RAID5";
	String opcBSISCAR2 = "RAIDPRO";
	String opcCSISCAR2 = "RAID2";

	String pregSISCAR3 = "ï¿½A quï¿½ 'muerte' se asemeja la muerte de Alan Turing?";
	String opcASISCAR3 = "A la de Blancanieves.";
	String opcBSISCAR3 = "A la de Bambi.";
	String opcCSISCAR3 = "Ninguna de las otras.";

	String pregSISCAR4 = "ï¿½De quï¿½ aï¿½o es el Windows Server que utilizamos en sistemas?";
	String opcASISCAR4 = "2003";
	String opcBSISCAR4 = "2000";
	String opcCSISCAR4 = "2001";

	String pregSISCAR5 = "Led IR es lo mismo que decir...";
	String opcASISCAR5 = "Led de infra rojos";
	String opcBSISCAR5 = "Led transparente";
	String opcCSISCAR5 = "Led irrespetuoso";

	String pregSISNOL1 = "Que es el microprocesador";
	String opcASISNOL1 = "El circuito integrado mas complejo de un sistema informatico";
	String opcBSISNOL1 = "La memoria del ordenador";
	String opcCSISNOL1 = "Un circuito de coneccion de la placa base";

	String pregSISNOL2 = "Segun la ley de Moore, la capacidad de computacion de un ordenador se duplica cada...";
	String opcASISNOL2 = "18 meses";
	String opcBSISNOL2 = "20 meses";
	String opcCSISNOL2 = "36 meses";

	String pregSISNOL3 = "El termino RAM se utiliza como sinonimo de...";
	String opcASISNOL3 = "Memoria principal";
	String opcBSISNOL3 = "Memoria mayor";
	String opcCSISNOL3 = "Memoria rapida";

	String pregSISNOL4 = "Que es subneting";
	String opcASISNOL4 = "Es dividir una red IP fisica en subredes logicas";
	String opcBSISNOL4 = "Es un conjunto de redes";
	String opcCSISNOL4 = "Es una subred que roba bits destinados a host";

	String pregSISNOL5 = "Cuantas clases de direcciones IP hay clasificadas";
	String opcASISNOL5 = "Cuatro";
	String opcBSISNOL5 = "Dos";
	String opcCSISNOL5 = "Nueve";

	String pregSISGER1 = "¿Qué es Byte?";
	String opcASISGER1 = "Es la unidad fundamental de datos en los ordenadores personales, un byte son 8 bits contiguos.";
	String opcBSISGER1 = "Es la unidad fundamental de datos en los ordenadores personales, un byte son 16 bits contiguos.";
	String opcCSISGER1 = "Es la unidad fundamental de datos en los ordenadores personales, un byte son 32 bits contiguos.";

	String pregSISGER2 = "¿Qué es ubunto?";
	String opcASISGER2 = "Es una distribución Linux.";
	String opcBSISGER2 = "Es una distribución Mac OS.";
	String opcCSISGER2 = "Es una distribución de Windows,";

	String pregSISGER3 = "¿Qué es el bus?";

	String opcASISGER3 = "Es un conjunto de conexiones física (cable, placas de circuito impreso, etc.) ";
	String opcBSISGER3 = "Es una red de ordenadores conectada a la red Skynet. ";
	String opcCSISGER3 = "Es un conjunto de conexiones entre microchips de avanzada tecnilogía de silicio-cadmio. ";

	String pregSISGER4 = "¿Que es FAT?";
	String opcASISGER4 = "Un sistema de archivos desarrollado para MS-DOS.";
	String opcBSISGER4 = "Se le llama vulgarmente así a discos duros que pesan mucho.";
	String opcCSISGER4 = "Es un tipo de Tarjetas gráficas con las que actualmente se juega al Fallout 4 a 120fps a 4K. ";

	String pregSISGER5 = "¿Cuál no es un dispositivo de salida?";
	String opcASISGER5 = "Teclado.";
	String opcBSISGER5 = "Impresora.";
	String opcCSISGER5 = "Monitor.";

	String pregSISFEL1 = "Un diso duro dinamico se denomina:";
	String opcASISFEL1 = "SDD";
	String opcBSISFEL1 = "USB";
	String opcCSISFEL1 = "HDD";

	String pregSISFEL2 = "El conectorIEEE1394 conecta a...";
	String opcASISFEL2 = "Camara de video.";
	String opcBSISFEL2 = "Proyector.";
	String opcCSISFEL2 = "Impresora láser.";

	String pregSISFEL3 = "Cuantas clavijas tiene el conector en el PC de la corriente.";
	String opcASISFEL3 = "3";
	String opcBSISFEL3 = "1";
	String opcCSISFEL3 = "2";

	String pregSISFEL4 = "De que color es el conector de audio(entrante):";
	String opcASISFEL4 = "Azul";
	String opcBSISFEL4 = "Rosa.";
	String opcCSISFEL4 = "Verde.";

	String pregSISFEL5 = "¿Cómo se denomina la ley para calcular el valor de las resistencias?";
	String opcASISFEL5 = "Ley de ohm.";
	String opcBSISFEL5 = "Ley de kirchhoff.";
	String opcCSISFEL5 = "Ley de de watt.";

	// PREGUNTAS SOBRE EL COLEGIO

	String pregCOLALE1 = " ¿Dónde se lleva a cabo el 'buenos dias' de los jueves?";
	String opcACOLALE1 = " Clase";
	String opcBCOLALE1 = " Teatro";
	String opcCCOLALE1 = " Iglesia";

	String pregCOLALE2 = " ¿Qué necesitamos antes de un exámen de base de datos?";
	String opcACOLALE2 = " Vaselina";
	String opcBCOLALE2 = " Una pata de conejo";
	String opcCCOLALE2 = " Una caja de gambas y una paletilla";

	String pregCOLALE3 = " ¿Quién fracasó en su intento de ser delegado de clase, cuya madre lo humilló aún más esa misma tarde siendo elegida delegada de padres?";
	String opcACOLALE3 = " Miguel Casado";
	String opcBCOLALE3 = " Jaime Márquez ";
	String opcCCOLALE3 = " Ninguna de las respuestas anteriores es correcta";

	String pregCOLALE4 = " ";
	String opcACOLALE4 = " Visualiza todos los productos que empiecen con el carï¿½cter ï¿½Aï¿½ despuï¿½s el carï¿½cter ï¿½_ï¿½ y despuï¿½s el carï¿½cter %";
	String opcBCOLALE4 = " Visualiza todos los productos que no empiecen con el carï¿½cter ï¿½Aï¿½ ni despuï¿½s tengan el carï¿½cter ï¿½_ï¿½ ni despuï¿½s el carï¿½cter %";
	String opcCCOLALE4 = " Visualiza todos los productos que no empiezan con A y despuï¿½s no tienen otro carï¿½cter mï¿½s como mï¿½nimo";

	String pregCOLALE5 = "La sentencia SQL ï¿½SELECT NombreEmpleado, COUNT(Id_pedido) FROM Pedidos p,empleados e WHERE p.id_empleado=e.id_empleado group by id_pedido HAVING COUNT(Id_pedido)=10 ï¿½, ï¿½quï¿½ resultado tendrï¿½a?";
	String opcACOLALE5 = " Visualiza los empleados que han gestionado el pedido nï¿½mero 10";
	String opcBCOLALE5 = " Visualiza los empleados que han realizado un nï¿½mero de pedidos igual a 10";
	String opcCCOLALE5 = " Visualiza todos los empleados y el nï¿½mero de pedidos que han gestionado, incluyendo el pedido igual a 10";

	String pregCOLCAR1 = "ï¿½Quï¿½ cantidad media de mensajes de WhatsApp entran el dï¿½a anterior de entregar un boletï¿½n de BBDD?";
	String opcACOLCAR1 = "100-200";
	String opcBCOLCAR1 = "0, nadie sabe hacerlo.";
	String opcCCOLCAR1 = "5-10";

	String pregCOLCAR2 = "ï¿½Cuï¿½l fue la primera dinï¿½mica de grupo quï¿½ hicimos con Miguel?";
	String opcACOLCAR2 = "Ambas cosas";
	String opcBCOLCAR2 = "Comida de convivencia";
	String opcCCOLCAR2 = "Preguntas personales a los compaï¿½eros y aviones de papel";

	String pregCOLCAR3 = "ï¿½Quienes reventaron un led RGB en sistemas?";
	String opcACOLCAR3 = "Felipe y Rafa";
	String opcBCOLCAR3 = "Fernando Carmona y Galiani";
	String opcCCOLCAR3 = "Miguel Campos";

	String pregCOLCAR4 = "ï¿½Cï¿½mo se llama el portero?";
	String opcACOLCAR4 = "Manolo";
	String opcBCOLCAR4 = "Rafa";
	String opcCCOLCAR4 = "Pedro";

	String pregCOLCAR5 = "ï¿½Quï¿½ foto se puso inicialmente en el grupo de WhatsApp de clase?";
	String opcACOLCAR5 = "Alan Turing";
	String opcBCOLCAR5 = "Don Bosco a lo Kanye West";
	String opcCCOLCAR5 = "'Todos' en el Dominos";

	String pregCOLNOL1 = "Como se llama el jefe de estudios de FP";
	String opcACOLNOL1 = "Ã�ngel";
	String opcBCOLNOL1 = "Luismi";
	String opcCCOLNOL1 = "Rafa";

	String pregCOLNOL2 = "A que hora se entra del recreo";
	String opcACOLNOL2 = "11:30";
	String opcBCOLNOL2 = "11:40";
	String opcCCOLNOL2 = "11:25";

	String pregCOLNOL3 = "Nombre del actual director del colegio Salesianos de triana";
	String opcACOLNOL3 = "Fernando BaÃ±ez Martin";
	String opcBCOLNOL3 = "Francisco VÃ¡zquez Adorna";
	String opcCCOLNOL3 = "Enrique Vargas Marquez";

	String pregCOLNOL4 = "En que aÃ±o fue inagurado solemnemente el colegio";
	String opcACOLNOL4 = "1935";
	String opcBCOLNOL4 = "1930";
	String opcCCOLNOL4 = "1926";

	String pregCOLNOL5 = "Con cuantas aulas comenzo a funcionar el colegio";
	String opcACOLNOL5 = "Tres";
	String opcBCOLNOL5 = "Nueve";
	String opcCCOLNOL5 = "Quince";

	String pregCOLGER1 = "Juan Melchor Bosco Occhiena nació en...";
	String opcACOLGER1 = "Italia.";
	String opcBCOLGER1 = "Rumania.";
	String opcCCOLGER1 = "España.";

	String pregCOLGER2 = "La Congregación Salesiana nace el...";
	String opcACOLGER2 = "18 de diciembre de 1859 en Valdocco (Turín).";
	String opcBCOLGER2 = "8 de enero de 1960 en Valparaiso (Chile).";
	String opcCCOLGER2 = "28 de febrero de 1902 en Madrid(España).";

	String pregCOLGER3 = "El nombre secular del PAPA es...";
	String opcACOLGER3 = "Jorge Mario Bergoglio.";
	String opcBCOLGER3 = "Ben Stiller.";
	String opcCCOLGER3 = "Humberto Janeiro López.";

	String pregCOLGER4 = "¿Deben practicar los católicos la abstinencia alguna vez al año?";
	String opcACOLGER4 = "Sí.";
	String opcBCOLGER4 = "No.";
	String opcCCOLGER4 = "Solo el día de reyes.";

	String pregCOLGER5 = "¿Qué significa la palabra biblia?";
	String opcACOLGER5 = "Los libros.";
	String opcBCOLGER5 = "Libro sagrado.";
	String opcCCOLGER5 = "La ley.";

	String pregCOLFEL1 = "¿Cual es el año de escritura de los terrenos donde esta hubicado el colegio Salesianos San Pedro?";
	String opcACOLFEL1 = "1925";
	String opcBCOLFEL1 = "1935";
	String opcCCOLFEL1 = "1955";

	String pregCOLFEL2 = "¿Qué Cardenal bendeció las instalaciones del Colegio Salesianos de Triana?";
	String opcACOLFEL2 = "Cardenal Ilundain";
	String opcBCOLFEL2 = "Cardenal Amigo Vallejo";
	String opcCCOLFEL2 = "Cardenal Bueno Monreal";

	String pregCOLFEL3 = "¿Qué año fue inaugurada la Capilla de Maria Auxiliadora(actual Capilla San Juan Bosco)?";
	String opcACOLFEL3 = "1944";
	String opcBCOLFEL3 = "1934";
	String opcCCOLFEL3 = "1962";

	String pregCOLFEL4 = "¿Qué director celebró el 75 aniversario de la Casa Salesiana en Triana?";
	String opcACOLFEL4 = "José Carmelo Pulido Morales";
	String opcBCOLFEL4 = "Francisco Vázquez Adorna";
	String opcCCOLFEL4 = "Fernando Báñez Martín";

	String pregCOLFEL5 = "A base de alumnos del Colegio de los Salesianos de Triana ¿qué equipo en los años 70 se forjó en este colegio?";
	String opcACOLFEL5 = "COLSPE.";
	String opcBCOLFEL5 = "Triana F.C.";
	String opcCCOLFEL5 = "Balompédica Trianera.";

	// CONSTRUCTORES

	// MÉTODOS

	public void imprimirPregPROG() {
		String[][] listadoProgramacion = {

				{ pregProgALE1, opcAProgALE1, opcBProgALE1, opcCProgALE1 },
				{ pregProgALE2, opcAProgALE2, opcBProgALE2, opcCProgALE2 },
				{ pregProgALE3, opcAProgALE3, opcBProgALE3, opcCProgALE3 },
				{ pregProgALE4, opcAProgALE4, opcBProgALE4, opcCProgALE4 },
				{ pregProgALE5, opcAProgALE5, opcBProgALE5, opcCProgALE5 },
				{ pregProgCAR1, opcAProgCAR1, opcBProgCAR1, opcCProgCAR1 },
				{ pregProgCAR2, opcAProgCAR2, opcBProgCAR2, opcCProgCAR2 },
				{ pregProgCAR3, opcAProgCAR3, opcBProgCAR3, opcCProgCAR3 },
				{ pregProgCAR4, opcAProgCAR4, opcBProgCAR4, opcCProgCAR4 },
				{ pregProgCAR5, opcAProgCAR5, opcBProgCAR5, opcCProgCAR5 },
				{ pregProgFEL1, opcAProgFEL1, opcBProgFEL1, opcCProgFEL1 },
				{ pregProgFEL2, opcAProgFEL2, opcBProgFEL2, opcCProgFEL2 },
				{ pregProgFEL3, opcAProgFEL3, opcBProgFEL3, opcCProgFEL3 },
				{ pregProgFEL4, opcAProgFEL4, opcBProgFEL4, opcCProgFEL4 },
				{ pregProgFEL5, opcAProgFEL5, opcBProgFEL5, opcCProgFEL5 },
				{ pregProgGER1, opcAProgGER1, opcBProgGER1, opcCProgGER1 },
				{ pregProgGER2, opcAProgGER2, opcBProgGER2, opcCProgGER2 },
				{ pregProgGER3, opcAProgGER3, opcBProgGER3, opcCProgGER2 },
				{ pregProgGER4, opcAProgGER4, opcBProgGER4, opcCProgGER4 },
				{ pregProgGER5, opcAProgGER5, opcBProgGER5, opcCProgGER5 },
				{ pregProgNOL1, opcAProgNOL1, opcBProgNOL1, opcCProgNOL1 },
				{ pregProgNOL2, opcAProgNOL2, opcBProgNOL2, opcCProgNOL2 },
				{ pregProgNOL3, opcAProgNOL3, opcBProgNOL3, opcCProgNOL3 },
				{ pregProgNOL4, opcAProgNOL4, opcBProgNOL4, opcCProgNOL4 },
				{ pregProgNOL5, opcAProgNOL5, opcBProgNOL5, opcCProgNOL5 },

		};

		Random num = new Random(System.nanoTime());
		int numRespuesta1 = num.nextInt(3 - 1 + 1) + 1;
		int numRespuesta2;
		int numRespuesta3;

		int numPregunta = num.nextInt((listadoProgramacion.length - 1) - 0 + 1) + 0;

		System.out.println(listadoProgramacion[numPregunta][0]);
		System.out.println("\t" + "a) " + listadoProgramacion[numPregunta][numRespuesta1]);

		do {
			numRespuesta2 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta2);

		System.out.println("\t" + "b) " + listadoProgramacion[numPregunta][numRespuesta2]);

		do {
			numRespuesta3 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta3 || numRespuesta2 == numRespuesta3);

		System.out.println("\t" + "c) " + listadoProgramacion[numPregunta][numRespuesta3]);
		System.out.println("Introduzca la respuesta(1,2,3)");

		comprobarRespuesta(listadoProgramacion, numPregunta, numRespuesta1, numRespuesta2, numRespuesta3);

	}

	public void imprimirPregBBDD() {
		String[][] listadoBBDD = {

				{ pregBBDDALE1, opcABBDDALE1, opcBBBDDALE1, opcCBBDDALE1 },
				{ pregBBDDALE2, opcABBDDALE2, opcBBBDDALE2, opcCBBDDALE2 },
				{ pregBBDDALE3, opcABBDDALE3, opcBBBDDALE3, opcCBBDDALE3 },
				{ pregBBDDALE4, opcABBDDALE4, opcBBBDDALE4, opcCBBDDALE4 },
				{ pregBBDDALE5, opcABBDDALE5, opcBBBDDALE5, opcCBBDDALE5 },
				{ pregBBDDCAR1, opcABBDDCAR1, opcBBBDDCAR1, opcCBBDDCAR1 },
				{ pregBBDDCAR2, opcABBDDCAR2, opcBBBDDCAR2, opcCBBDDCAR2 },
				{ pregBBDDCAR3, opcABBDDCAR3, opcBBBDDCAR3, opcCBBDDCAR3 },
				{ pregBBDDCAR4, opcABBDDCAR4, opcBBBDDCAR4, opcCBBDDCAR4 },
				{ pregBBDDCAR5, opcABBDDCAR5, opcBBBDDCAR5, opcCBBDDCAR5 },
				{ pregBBDDNOL1, opcABBDDNOL1, opcBBBDDNOL1, opcCBBDDNOL1 },
				{ pregBBDDNOL2, opcABBDDNOL2, opcBBBDDNOL2, opcCBBDDNOL2 },
				{ pregBBDDNOL3, opcABBDDNOL3, opcBBBDDNOL3, opcCBBDDNOL3 },
				{ pregBBDDNOL4, opcABBDDNOL4, opcBBBDDNOL4, opcCBBDDNOL4 },
				{ pregBBDDNOL5, opcABBDDNOL5, opcBBBDDNOL5, opcCBBDDNOL5 },
				{ pregBBDDFEL1, opcABBDDFEL1, opcBBBDDFEL1, opcCBBDDFEL1 },
				{ pregBBDDFEL2, opcABBDDFEL2, opcBBBDDFEL2, opcCBBDDFEL2 },
				{ pregBBDDFEL3, opcABBDDFEL3, opcBBBDDFEL3, opcCBBDDFEL3 },
				{ pregBBDDFEL4, opcABBDDFEL4, opcBBBDDFEL4, opcCBBDDFEL4 },
				{ pregBBDDFEL5, opcABBDDFEL5, opcBBBDDFEL5, opcCBBDDFEL5 },
				{ pregBBDDGER1, opcABBDDGER1, opcBBBDDGER1, opcCBBDDGER1 },
				{ pregBBDDGER2, opcABBDDGER2, opcBBBDDGER2, opcCBBDDGER2 },
				{ pregBBDDGER3, opcABBDDGER3, opcBBBDDGER3, opcCBBDDGER3 },
				{ pregBBDDGER4, opcABBDDGER4, opcBBBDDGER4, opcCBBDDGER4 },
				{ pregBBDDGER5, opcABBDDGER5, opcBBBDDGER5, opcCBBDDGER5 },

		};

		Random num = new Random(System.nanoTime());
		int numRespuesta1 = num.nextInt(3 - 1 + 1) + 1;
		int numRespuesta2;
		int numRespuesta3;

		int numPregunta = num.nextInt((listadoBBDD.length - 1) - 0 + 1) + 0;

		System.out.println(listadoBBDD[numPregunta][0]);
		System.out.println("\t" + "a) " + listadoBBDD[numPregunta][numRespuesta1]);

		do {
			numRespuesta2 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta2);

		System.out.println("\t" + "b) " + listadoBBDD[numPregunta][numRespuesta2]);

		do {
			numRespuesta3 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta3 || numRespuesta2 == numRespuesta3);

		System.out.println("\t" + "c) " + listadoBBDD[numPregunta][numRespuesta3]);
		System.out.println("Introduzca la respuesta(1,2,3)");

		comprobarRespuesta(listadoBBDD, numPregunta, numRespuesta1, numRespuesta2, numRespuesta3);

	}

	public void imprimirPregHTML() {
		String[][] listadoHTML = { { pregHTMLALE1, opcAHTMLALE1, opcBHTMLALE1, opcCHTMLALE1 },
				{ pregHTMLALE2, opcAHTMLALE2, opcBHTMLALE2, opcCHTMLALE2 },
				{ pregHTMLALE3, opcAHTMLALE3, opcBHTMLALE3, opcCHTMLALE3 },
				{ pregHTMLALE4, opcAHTMLALE4, opcBHTMLALE4, opcCHTMLALE4 },
				{ pregHTMLALE5, opcAHTMLALE5, opcBHTMLALE5, opcCHTMLALE5 },
				{ pregHTMLCAR1, opcAHTMLCAR1, opcBHTMLCAR1, opcCHTMLCAR1 },
				{ pregHTMLCAR2, opcAHTMLCAR2, opcBHTMLCAR2, opcCHTMLCAR2 },
				{ pregHTMLCAR3, opcAHTMLCAR3, opcBHTMLCAR3, opcCHTMLCAR3 },
				{ pregHTMLCAR4, opcAHTMLCAR4, opcBHTMLCAR4, opcCHTMLCAR4 },
				{ pregHTMLCAR5, opcAHTMLCAR5, opcBHTMLCAR5, opcCHTMLCAR5 },
				{ pregHTMLFEL1, opcAHTMLFEL1, opcBHTMLFEL1, opcCHTMLFEL1 },
				{ pregHTMLFEL2, opcAHTMLFEL2, opcBHTMLFEL2, opcCHTMLFEL2 },
				{ pregHTMLFEL3, opcAHTMLFEL3, opcBHTMLFEL3, opcCHTMLFEL3 },
				{ pregHTMLFEL4, opcAHTMLFEL4, opcBHTMLFEL4, opcCHTMLFEL4 },
				{ pregHTMLFEL5, opcAHTMLFEL5, opcBHTMLFEL5, opcCHTMLFEL5 },
				{ pregHTMLNOL1, opcAHTMLNOL1, opcBHTMLNOL1, opcCHTMLNOL1 },
				{ pregHTMLNOL2, opcAHTMLNOL2, opcBHTMLNOL2, opcCHTMLNOL2 },
				{ pregHTMLNOL3, opcAHTMLNOL3, opcBHTMLNOL3, opcCHTMLNOL3 },
				{ pregHTMLNOL4, opcAHTMLNOL4, opcBHTMLNOL4, opcCHTMLNOL4 },
				{ pregHTMLNOL5, opcAHTMLNOL5, opcBHTMLNOL5, opcCHTMLNOL5 },
				{ pregHTMLGER1, opcAHTMLGER1, opcBHTMLGER1, opcCHTMLGER1 },
				{ pregHTMLGER2, opcAHTMLGER2, opcBHTMLGER2, opcCHTMLGER2 },
				{ pregHTMLGER3, opcAHTMLGER3, opcBHTMLGER3, opcCHTMLGER3 },
				{ pregHTMLGER4, opcAHTMLGER4, opcBHTMLGER4, opcCHTMLGER4 },
				{ pregHTMLGER5, opcAHTMLGER5, opcBHTMLGER5, opcCHTMLGER5 }, };
		Random num = new Random(System.nanoTime());
		int numRespuesta1 = num.nextInt(3 - 1 + 1) + 1;
		int numRespuesta2;
		int numRespuesta3;

		int numPregunta = num.nextInt((listadoHTML.length - 1) - 0 + 1) + 0;

		System.out.println(listadoHTML[numPregunta][0]);
		System.out.println("\t" + "a) " + listadoHTML[numPregunta][numRespuesta1]);

		do {
			numRespuesta2 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta2);

		System.out.println("\t" + "b) " + listadoHTML[numPregunta][numRespuesta2]);

		do {
			numRespuesta3 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta3 || numRespuesta2 == numRespuesta3);

		System.out.println("\t" + "c) " + listadoHTML[numPregunta][numRespuesta3]);
		System.out.println("Introduzca la respuesta(1,2,3)");

		comprobarRespuesta(listadoHTML, numPregunta, numRespuesta1, numRespuesta2, numRespuesta3);

	}

	public void imprimirPregSIS() {
		String[][] listadoSIS = { { pregSISALE1, opcASISALE1, opcBSISALE1, opcCSISALE1 },
				{ pregSISALE2, opcASISALE2, opcBSISALE2, opcCSISALE2 },
				{ pregSISALE3, opcASISALE3, opcBSISALE3, opcCSISALE3 },
				{ pregSISALE4, opcASISALE4, opcBSISALE4, opcCSISALE4 },
				{ pregSISALE5, opcASISALE5, opcBSISALE5, opcCSISALE5 },
				{ pregSISCAR1, opcASISCAR1, opcBSISCAR1, opcCSISCAR1 },
				{ pregSISCAR2, opcASISCAR2, opcBSISCAR2, opcCSISCAR2 },
				{ pregSISCAR3, opcASISCAR3, opcBSISCAR3, opcCSISCAR3 },
				{ pregSISCAR4, opcASISCAR4, opcBSISCAR4, opcCSISCAR4 },
				{ pregSISCAR5, opcASISCAR5, opcBSISCAR5, opcCSISCAR5 },
				{ pregSISNOL1, opcASISNOL1, opcBSISNOL1, opcCSISNOL1 },
				{ pregSISNOL2, opcASISNOL2, opcBSISNOL2, opcCSISNOL2 },
				{ pregSISNOL3, opcASISNOL3, opcBSISNOL3, opcCSISNOL3 },
				{ pregSISNOL4, opcASISNOL4, opcBSISNOL4, opcCSISNOL4 },
				{ pregSISNOL5, opcASISNOL5, opcBSISNOL5, opcCSISNOL5 },
				{ pregSISGER1, opcASISGER1, opcBSISGER1, opcCSISGER1 },
				{ pregSISGER2, opcASISGER2, opcBSISGER2, opcCSISGER2 },
				{ pregSISGER3, opcASISGER3, opcBSISGER3, opcCSISGER3 },
				{ pregSISGER4, opcASISGER4, opcBSISGER4, opcCSISGER4 },
				{ pregSISGER5, opcASISGER5, opcBSISGER5, opcCSISGER5 },
				{ pregSISFEL1, opcASISFEL1, opcBSISFEL1, opcCSISFEL1 },
				{ pregSISFEL2, opcASISFEL2, opcBSISFEL2, opcCSISFEL2 },
				{ pregSISFEL3, opcASISFEL3, opcBSISFEL3, opcCSISFEL3 },
				{ pregSISFEL4, opcASISFEL4, opcBSISFEL4, opcCSISFEL4 },
				{ pregSISFEL5, opcASISFEL5, opcBSISFEL5, opcCSISFEL5 },

		};
		Random num = new Random(System.nanoTime());
		int numRespuesta1 = num.nextInt(3 - 1 + 1) + 1;
		int numRespuesta2;
		int numRespuesta3;

		int numPregunta = num.nextInt((listadoSIS.length - 1) - 0 + 1) + 0;

		System.out.println(listadoSIS[numPregunta][0]);
		System.out.println("\t" + "a) " + listadoSIS[numPregunta][numRespuesta1]);

		do {
			numRespuesta2 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta2);

		System.out.println("\t" + "b) " + listadoSIS[numPregunta][numRespuesta2]);

		do {
			numRespuesta3 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta3 || numRespuesta2 == numRespuesta3);

		System.out.println("\t" + "c) " + listadoSIS[numPregunta][numRespuesta3]);
		System.out.println("Introduzca la respuesta(1,2,3)");

		comprobarRespuesta(listadoSIS, numPregunta, numRespuesta1, numRespuesta2, numRespuesta3);

	}

	public void imprimirPregCOL() {
		String[][] listadoCOL = { { pregCOLALE1, opcACOLALE1, opcBCOLALE1, opcCCOLALE1 },
				{ pregCOLALE2, opcACOLALE2, opcBCOLALE2, opcCCOLALE2 },
				{ pregCOLALE3, opcACOLALE3, opcBCOLALE3, opcCCOLALE3 },
				{ pregCOLALE4, opcACOLALE4, opcBCOLALE4, opcCCOLALE4 },
				{ pregCOLALE5, opcACOLALE5, opcBCOLALE5, opcCCOLALE5 },
				{ pregCOLCAR1, opcACOLCAR1, opcBCOLCAR1, opcCCOLCAR1 },
				{ pregCOLCAR2, opcACOLCAR2, opcBCOLCAR2, opcCCOLCAR2 },
				{ pregCOLCAR3, opcACOLCAR3, opcBCOLCAR3, opcCCOLCAR3 },
				{ pregCOLCAR4, opcACOLCAR4, opcBCOLCAR4, opcCCOLCAR4 },
				{ pregCOLCAR5, opcACOLCAR5, opcBCOLCAR5, opcCCOLCAR5 },
				{ pregCOLGER1, opcACOLGER1, opcBCOLGER1, opcCCOLGER1 },
				{ pregCOLGER2, opcACOLGER2, opcBCOLGER2, opcCCOLGER2 },
				{ pregCOLGER3, opcACOLGER3, opcBCOLGER3, opcCCOLGER3 },
				{ pregCOLGER4, opcACOLGER4, opcBCOLGER4, opcCCOLGER4 },
				{ pregCOLGER5, opcACOLGER5, opcBCOLGER5, opcCCOLGER5 },
				{ pregCOLNOL1, opcACOLNOL1, opcBCOLNOL1, opcCCOLNOL1 },
				{ pregCOLNOL2, opcACOLNOL2, opcBCOLNOL2, opcCCOLNOL2 },
				{ pregCOLNOL3, opcACOLNOL3, opcBCOLNOL3, opcCCOLNOL3 },
				{ pregCOLNOL4, opcACOLNOL4, opcBCOLNOL4, opcCCOLNOL4 },
				{ pregCOLNOL5, opcACOLNOL5, opcBCOLNOL5, opcCCOLNOL5 },
				{ pregCOLFEL1, opcACOLFEL1, opcBCOLFEL1, opcCCOLFEL1 },
				{ pregCOLFEL2, opcACOLFEL2, opcBCOLFEL2, opcCCOLFEL2 },
				{ pregCOLFEL3, opcACOLFEL3, opcBCOLFEL3, opcCCOLFEL3 },
				{ pregCOLFEL4, opcACOLFEL4, opcBCOLFEL4, opcCCOLFEL4 },
				{ pregCOLFEL5, opcACOLFEL5, opcBCOLFEL5, opcCCOLFEL5 },

		};
		Random num = new Random(System.nanoTime());
		int numRespuesta1 = num.nextInt(3 - 1 + 1) + 1;
		int numRespuesta2;
		int numRespuesta3;

		int numPregunta = num.nextInt((listadoCOL.length - 1) - 0 + 1) + 0;

		System.out.println(listadoCOL[numPregunta][0]);
		System.out.println("\t" + "a) " + listadoCOL[numPregunta][numRespuesta1]);

		do {
			numRespuesta2 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta2);

		System.out.println("\t" + "b) " + listadoCOL[numPregunta][numRespuesta2]);

		do {
			numRespuesta3 = num.nextInt(3 - 1 + 1) + 1;
		} while (numRespuesta1 == numRespuesta3 || numRespuesta2 == numRespuesta3);

		System.out.println("\t" + "c) " + listadoCOL[numPregunta][numRespuesta3]);
		System.out.println("Introduzca la respuesta(1,2,3)");

		comprobarRespuesta(listadoCOL, numPregunta, numRespuesta1, numRespuesta2, numRespuesta3);

	}

	public void comprobarRespuesta(String[][] list, int preg, int res1, int res2, int res3) {

		switch (Leer.datoInt()) {
		case 1:
			if (list[preg][res1].equals(list[preg][1]))
				System.out.println("Respuesta correcta");
			else
				System.out.println("Respuesta incorrecta");
			break;

		case 2:
			if (list[preg][res2].equals(list[preg][1]))
				System.out.println("Respuesta correcta");
			else
				System.out.println("Respuesta incorrecta");
			break;

		case 3:
			if (list[preg][res3].equals(list[preg][1]))
				System.out.println("Respuesta correcta");
			else
				System.out.println("Respuesta incorrecta");
			break;
		}

	}

	public void darQuesito(Casilla cas, Equipo eq) {
		boolean[] aux = eq.getQuesitos();
		aux[cas.getTipo()]= true;
			eq.setQuesitos(aux);
		}

	

	public void quitarQuesito(Casilla cas, Equipo eq) {
		boolean[] aux = eq.getQuesitos();
		aux[cas.getTipo()]= false;
			eq.setQuesitos(aux);

	}
}
