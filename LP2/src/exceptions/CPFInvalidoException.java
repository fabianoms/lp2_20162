package exceptions;

public class CPFInvalidoException extends Exception {

	public CPFInvalidoException(String cpf) {
		super(cpf);
	}
}
