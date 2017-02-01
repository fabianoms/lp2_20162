package revisaoAv1.semaforo;

public class Semaforo {

	private int corAtual;
	
	public Semaforo(int cor) {
		if (corValida(cor)) {
			corAtual = cor;
		} else {
			corAtual = 1;
		}
	}

	private boolean corValida(int cor) {
		return cor >= 1 && cor <= 3;
	}

	public int mudarCor() {
		if (corAtual == 3) {
			corAtual = 1;
		} else {
			corAtual++;
		}			
		return corAtual;
	}

	public int getCorAtual() {
		return corAtual;
	}

}
