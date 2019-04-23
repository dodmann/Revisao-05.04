package exercicio3;

public class Retangulo extends Quadrilateros {
	
	private double b;
	private double h;

	public double getB() {
		return b;
	}

	Retangulo(double l1, double l2, double l3, double l4, double b, double h) {
		super(l1, l2, l3, l4);
		this.b = b;
		this.h = h;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double calcularArea() {
		return this.getB() * this.getH();
	}
	
	public double calcularPerimetro() {
		return (this.getB() + this.getH()) * 2 ;
	}
}
