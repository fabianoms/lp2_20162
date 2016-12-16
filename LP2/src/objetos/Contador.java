package objetos;

public class Contador {

	private int valor = 0;
	
	public int incrementa() {
		valor = valor + 1;
		return valor;
	}
	
	public int decrementa() {
		valor = valor - 1;
		return valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int novoValor) {
		valor = novoValor;
	}
	
	
}
