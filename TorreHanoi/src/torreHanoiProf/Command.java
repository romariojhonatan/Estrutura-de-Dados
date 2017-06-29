package torreHanoiProf;

public class Command {

	private int n; // Numero de discos
	private int source = 1; // pino origem
	private int destination = 3; // pino destino
	private int aux = 2; // pino trabalho

	public Command(int n, int source, int destination, int aux) {
		super();
		this.n = n;
		this.source = source;
		this.destination = destination;
		this.aux = aux;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public int getAux() {
		return aux;
	}

	public void setAux(int aux) {
		this.aux = aux;
	}

}
