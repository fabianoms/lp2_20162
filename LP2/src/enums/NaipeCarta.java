package enums;

public enum NaipeCarta {
	OURO(0), ESPADAS(1), COPAS(2), PAUS(3);
	
	private int valor;
	
	NaipeCarta(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
}
