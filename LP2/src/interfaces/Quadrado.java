package interfaces;

public class Quadrado implements Figura2D {

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	
	@Override
	public double perimetro() {
		return 4 * lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}

}
