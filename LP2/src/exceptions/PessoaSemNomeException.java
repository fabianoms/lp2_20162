package exceptions;

public class PessoaSemNomeException extends Exception {

	public PessoaSemNomeException()  {
		super("Essa pessoa n�o possui nome!");
	}
}
