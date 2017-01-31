package objetos;

public class Contador {

	private int contagem;

	public Contador(int valorInicial) {
		setContagem(valorInicial);
	}

	public Contador() {
		this(0);
	}

	public int incrementa() {
		contagem = contagem + 1;
		return contagem;
	}

	public int decrementa() {
		contagem = contagem - 1;
		return contagem;
	}

	public int getContagem() {
		return contagem;
	}

	public void setContagem(int novoValor) {
		if (novoValor >= 0) {
			contagem = novoValor;
		}
	}
}


