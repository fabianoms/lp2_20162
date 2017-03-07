package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import interfaces.*;

public class Main {

	public static void main(String[] args) {
		List<Figura2D> minhasFiguras;
		minhasFiguras = new ArrayList<Figura2D>();
		int numElementos = 3;
		minhasFiguras.add(new Circulo(4));
		minhasFiguras.add(new Quadrado(5));
		minhasFiguras.add(new Circulo(10));
		
		
		for (Figura2D figura : minhasFiguras) {
			System.out.println(figura.area());
		}
	}
}
