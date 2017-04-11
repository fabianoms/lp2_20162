package enums;

public class Carta {
	
	private ValorCarta valor;
	private NaipeCarta naipe;
	
	public Carta(ValorCarta valor, NaipeCarta naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public ValorCarta getValor() {
		return valor;
	}
	
	public NaipeCarta getNaipe() {
		return naipe;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Carta) {
			Carta c = (Carta)o;
			if (c.getNaipe() == getNaipe()
				&& c.getValor() == getValor()) {
				return true;
			}
		} 
		return false;
	}

}
