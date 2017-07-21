package exceptions;

public class PessoaSemNomeException extends Exception {

	public PessoaSemNomeException()  {
		super("Essa pessoa não possui nome!");
	}
}
