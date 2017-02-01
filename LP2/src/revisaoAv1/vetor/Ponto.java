package revisaoAv1.vetor;

public class Ponto {

	private double x;
	
	private double y;
	
	public Ponto(double parX, double y) {
		x = parX;
		this.y = y;
	}
	
	public Ponto() {
		this(0, 0);
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double novoX) {
		x = novoX;
	}
	
	public void setY(double novoY) {
		y = novoY;
	}
	
	public double getY() {
		return y;
	}
	
	
}

