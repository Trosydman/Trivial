package carlos;

/**
 * Ayuda a gestionar las casillas del Tablero
 * 
 * @author Carlos Mesquita Mansilla
 *
 */
public class Casilla {
	
	/**
	 * Constante que se refiere a programación.
	 */
	public static final int PROG = 0;
	/**
	 * Constante que se refiere a bases de datos.
	 */
	public static final int BBDD = 1;
	/**
	 * Constante que se refiere a HTML
	 */
	public static final int HTML = 2;
	/**
	 * Constante que se refiere a sistemas
	 */
	public static final int SIS = 3;
	/**
	 * Constante que se refiere al colegio
	 */
	public static final int COL = 4;
	

	/**
	 * Posición del equipo 1 en la casilla 
	 */
	private int[] posEq1 = new int[2];
	/**
	 * Posición del equipo 1 en la casilla
	 */
	private int[] posEq2 = new int[2];
	/**
	 * Posición del equipo 1 en la casilla
	 */
	private int[] posEq3 = new int[2];
	/**
	 * Posición del equipo 1 en la casilla
	 */
	private int[] posEq4 = new int[2];
	

	/**
	 * Tipo de dicha casilla que se denota con las constantes anteriormenete mencionadas
	 */
	private int tipo;


	/**
	 * Indica si es una intersección o no
	 */
	private boolean interseccion;

	/**
	 * Indica si es una casilla para conseguir quesitos o no
	 */
	private boolean quesito;
	
	

	/**
	 * Constructor principal de {@link Casilla}, dónde se establecen las posiciones
	 * de los 4 equipos.
	 * 
	 * @param posFIL posición de la fila de esa casilla
	 * @param posCOL posición de la columna de esa casilla
	 * @param tipo se refiere a si es de programación, bbdd...
	 */
	public Casilla(int posFIL, int posCOL, int tipo) {
		this.posEq1[0] = posFIL;
		this.posEq1[1] = posCOL;
		
		this.posEq2[0] = posFIL;
		this.posEq2[1] = posCOL+4;
		
		this.posEq3[0] = posFIL+1;
		this.posEq3[1] = posCOL;
		
		this.posEq4[0] = posFIL+1;
		this.posEq4[1] = posCOL+4;
		
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public int[] getPosEq1() {
		return posEq1;
	}

	public void setPosEq1(int[] posEq1) {
		this.posEq1 = posEq1;
	}

	public int[] getPosEq2() {
		return posEq2;
	}

	public void setPosEq2(int[] posEq2) {
		this.posEq2 = posEq2;
	}

	public int[] getPosEq3() {
		return posEq3;
	}

	public void setPosEq3(int[] posEq3) {
		this.posEq3 = posEq3;
	}

	public int[] getPosEq4() {
		return posEq4;
	}

	public void setPosEq4(int[] posEq4) {
		this.posEq4 = posEq4;
	}

	public boolean isQuesito() {
		return quesito;
	}

	public void setQuesito(boolean quesito) {
		this.quesito = quesito;
	}
	
	public boolean isInterseccion() {
		return interseccion;
	}

	public void setInterseccion(boolean interseccion) {
		this.interseccion = interseccion;
	}

	@Override
	public String toString() {
		return "Casilla [\n\tposXEq1=" + posEq1[1] + ", posYEq1=" + posEq1[0] + "\n\tposXEq2=" + posEq2[1] + ", posYEq2=" + posEq2[0]
				+ "\n\tposXEq3=" + posEq3[1] + ", posYEq3=" + posEq3[0] + "\n\tposXEq4=" + posEq4[1] + ", posYEq4=" + posEq4[0]
				+ "\ntipo=" + tipo + ", quesito=" + quesito + ", intersección=" + interseccion + "]\n";
	}

	
	
}
