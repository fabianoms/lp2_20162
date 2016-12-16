package operacoes;

import java.util.Scanner;

import objetos.Contador;

public class Manipulador {
	public static void main(String[] args) {
		Contador meuContadorA = new Contador();
		Contador meuContadorB = new Contador();
		int v1 = -1;
		int v2 = -1;
		//incrementar 50 vezes
		for (int i = 0; i < 50; i++) {
			v1 = meuContadorA.incrementa();
		}		
		//decrementar 72 vezes
		for (int i = 0; i < 72; i++) {
			v2 = meuContadorB.decrementa();
		}
		
		
		System.out.println("V1: " + v1);
		System.out.println("V2: " + v2);
	
	
	
	
	
	
	}

	
	
	
	
	public static void chamadasOpMat() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe dois valores inteiros maiores ou iguais a zero:");
		int m = sc.nextInt();
		int n = sc.nextInt();

		long resultado = OpMat.somatorio(3, 5);
		System.out.println(resultado);
		resultado = OpMat.fatorial(5);
		System.out.println(resultado);
		System.out.println(OpMat.fatorialRecursivo(3));

	}
}
