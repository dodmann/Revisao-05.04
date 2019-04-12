package exercicio3;

public class Quadrado extends Quadrilateros {
	private double l;

	Quadrado(double l1, double l2, double l3, double l4, double l) {
		super(l1, l2, l3, l4);
		this.l = l;
	}
	
	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double calcularPerimetro(double l) {
		return l * 4;
	}
	
	public double calcularArea(double l1, double l2) {
		return l1 * l2;
	}	
}
