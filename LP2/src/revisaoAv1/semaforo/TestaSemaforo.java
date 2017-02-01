package revisaoAv1.semaforo;

public class TestaSemaforo {

	public static void main(String[] args) {
		Semaforo semaforoTeste = new Semaforo(100);
		System.out.println("Cor inicial (deve ser 1): " + semaforoTeste.getCorAtual());
		System.out.print("Cor modificada (2): ");
		System.out.println(semaforoTeste.mudarCor());
		semaforoTeste.mudarCor();
		System.out.print("Cor modificada (1): ");
		System.out.println(semaforoTeste.mudarCor());
	}

}
