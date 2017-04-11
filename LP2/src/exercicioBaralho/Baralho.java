package exercicioBaralho;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import enums.Carta;
import enums.NaipeCarta;
import enums.ValorCarta;

public class Baralho {

	private Deque<Carta> cartas;
	
	public Baralho() {
		cartas = new LinkedList<Carta>();
		preencheBaralho();
	}
	
	private void preencheBaralho() {
		NaipeCarta[] naipes = NaipeCarta.values();
		ValorCarta[] valores = ValorCarta.values();
		for (int i = 0; i < naipes.length; i++) {
			for (int j = 0; j < valores.length; j++) {
				Carta carta = new Carta(valores[j], naipes[i]);
				cartas.push(carta);
			}
		}
	}

	public boolean estaVazio() {
		return cartas.isEmpty();
	}

	public void removerCartas() {
		cartas.clear();
	}

	public int numeroDeCartas() {
		return cartas.size();
	}

	public Carta pegaCarta() {
		return cartas.pop();
	}

	public void embaralhar() {
		Collections.shuffle((LinkedList)cartas);
	}

}
