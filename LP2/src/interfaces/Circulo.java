package interfaces;

public class Circulo implements Figura2D {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	
}
