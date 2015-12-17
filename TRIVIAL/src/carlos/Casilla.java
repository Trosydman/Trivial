package carlos;

public class Casilla {
	int posXEq1;
	int posYEq1;
	int posXEq2;
	int posYEq2;
	int posXEq3;
	int posYEq3;
	int posXEq4;
	int posYEq4;
	
	int tipo;
	boolean quesito;
	
	public Casilla(int posX, int posY, int tipo) {
		this.posYEq1 = posX;
		this.posXEq1 = posY;
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
		return "Casilla [posX=" + posXEq1 + ", posY=" + posYEq1 + ", tipo=" + tipo + ", quesito=" + quesito + "]";
	}
	
}
