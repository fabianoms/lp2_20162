package metodos_estaticos;

public class StaticTest {
	private int atributoA;
	private static int atributoEstatico;
	
	public static void main(String[] args) {
		atributoEstatico = 2;
		StaticClass.imprime("Olá");
	}
}
