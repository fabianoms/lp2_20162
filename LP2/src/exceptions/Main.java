package exceptions;

import heranca.Livro;

public class Main {
	public static void main(String[] args) {
//		Livro l = new Livro();
//		String teste = "ol�";
//		System.out.println(l.getTitulo().length());
		
		try {
			int[] numeros = {1, 2, 4};
			System.out.println(numeros[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ndice inv�lido!");
		} finally {
			System.out.println("Mensagem importante!!!");
		}
		System.out.println("Chegou no final");
		
	}
}
