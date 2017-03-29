package pkgfinal;

public class Email extends Mensagem {

	private final static int MAX_CARACTERES = 500;

	public Email() {
		super(MAX_CARACTERES);
	}

	@Override
	public boolean setCorpo(String corpo) {
		if (corpo.length() <= MAX_CARACTERES) {
			this.corpo = corpo + "--\nEmail";
			return true;
		}
		return false;
	}

}
