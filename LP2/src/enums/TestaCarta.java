package enums;

public class TestaCarta {

	public static void main(String[] args) {
		Carta carta = new Carta(ValorCarta.DEZ, NaipeCarta.COPAS);
		Carta carta2 = new Carta(ValorCarta.AS, NaipeCarta.ESPADAS);
		System.out.println(carta);
		
		ValorCarta[] valores = ValorCarta.values();
		for (int i = 0; i < valores.length; ++i) {
			System.out.println(valores[i] + " " + valores[i].getValor());
		}
		
		if (carta.getValor().getValor() < carta2.getValor().getValor())
			System.out.println("carta < carta2");
		else
			System.out.println("carta2 < carta");
		
	}
}
