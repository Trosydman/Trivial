package carlos;

public class Casilla {
	static final int PROG = 0;
	static final int BBDD = 1;
	static final int HTML = 2;
	static final int SIS = 3;
	static final int COL = 4;
	
	private int[] posEq1 = new int[2];
	private int[] posEq2 = new int[2];
	private int[] posEq3 = new int[2];
	private int[] posEq4 = new int[2];
	
	private int tipo;
	private boolean quesito;
	
	public Casilla(int posX, int posY, int tipo) {
		this.posEq1[1] = posX;
		this.posEq1[0] = posY;
		
		this.posEq2[1] = posX+4;
		this.posEq2[0] = posY;
		
		this.posEq3[1] = posX;
		this.posEq3[0] = posY+1;
		
		this.posEq4[1] = posX+4;
		this.posEq4[0] = posY+1;
		
		this.tipo = tipo;
	}

	public boolean isQuesito() {
		return quesito;
	}

	public void setQuesito(boolean quesito) {
		this.quesito = quesito;
	}

	@Override
	public String toString() {
		return "Casilla [\n\tposXEq1=" + posEq1[1] + ", posYEq1=" + posEq1[0] + "\n\tposXEq2=" + posEq2[1] + ", posYEq2=" + posEq2[0]
				+ "\n\tposXEq3=" + posEq3[1] + ", posYEq3=" + posEq3[0] + "\n\tposXEq4=" + posEq4[1] + ", posYEq4=" + posEq4[0]
				+ "\ntipo=" + tipo + ", quesito=" + quesito + "]\n";
	}

	
	
}
