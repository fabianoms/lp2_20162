package exceptions;

import heranca.Livro;

public class Main {
	public static void main(String[] args) {
//		Livro l = new Livro();
//		String teste = "olá";
//		System.out.println(l.getTitulo().length());
		
		try {
			int[] numeros = {1, 2, 4};
			System.out.println(numeros[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Índice inválido!");
		} finally {
			System.out.println("Mensagem importante!!!");
		}
		System.out.println("Chegou no final");
		
	}
}
