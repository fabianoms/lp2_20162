package exercicioBaralho;

import static org.junit.Assert.*;

import org.junit.Test;

import enums.Carta;

public class BaralhoTest {

	private Baralho baralho;
	
	@Test
	public void estaVazioTest() {
		baralho = new Baralho();
		assertFalse(baralho.estaVazio());
		baralho.removerCartas();
		assertTrue(baralho.estaVazio());
	}
	
	@Test
	public void preencherBaralhoTest() {
		int tamanhoDoBaralho = 52;
		baralho = new Baralho();
		assertEquals(tamanhoDoBaralho, baralho.numeroDeCartas());
		Baralho b2 = new Baralho();
		for (int i = 0; i < tamanhoDoBaralho; i++) {
			Carta carta1 = baralho.pegaCarta();
			Carta carta2 = b2.pegaCarta();
			boolean cartasIguais = carta1.equals(carta2);
			assertTrue(cartasIguais);
			if (!cartasIguais)
				break;
		}
	}
	
	@Test
	public void embaralharTest() {
		int tamanhoDoBaralho = 52;
		baralho = new Baralho();
		Baralho b2 = new Baralho();
		baralho.embaralhar();
		boolean algumParDiferente = false;
		for (int i = 0; i < tamanhoDoBaralho; i++) {
			Carta c1 = baralho.pegaCarta();
			Carta c2 = b2.pegaCarta();
			boolean cartasDiferentes = !(c1.equals(c2));
			if (cartasDiferentes) {
				algumParDiferente = true;
				break;
			}
		}
		assertTrue(algumParDiferente);
	}

}
