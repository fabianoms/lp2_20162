package operacoes;

import java.util.Scanner;

import objetos.Contador;

public class Manipulador {
	public static void main(String[] args) {
		criandoContadores();
	}
	
	public static void criandoContadores() {
		Contador meuContadorA = new Contador();
		Contador meuContadorB = new Contador();
		
		//incrementar 50 vezes
		for (int i = 0; i < 50; i++) {
			meuContadorA.incrementa();
		}		
		//decrementar 72 vezes
		for (int i = 0; i < 72; i++) {
			meuContadorB.decrementa();
		}
	
		System.out.println(meuContadorA.getContagem());
		System.out.println(meuContadorB.getContagem());
	}

	
	public static void chamadasOpMat() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe dois valores inteiros maiores ou iguais a zero:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		long resultado = OpMat.somatorio(3, 5);
		System.out.println(resultado);
		resultado = OpMat.fatorial(5);
		System.out.println(resultado);
		System.out.println(OpMat.fatorialRecursivo(3));

	}
}
