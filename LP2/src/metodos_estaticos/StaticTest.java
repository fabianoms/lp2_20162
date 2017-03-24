package metodos_estaticos;

public class StaticTest {

	public static void main(String[] args) {
		imprimeMsg("Olá");
		imprimeMsg("teste2");

	}

	private static void imprimeMsg(String msg) {
		System.out.println(msg);
	}
}
