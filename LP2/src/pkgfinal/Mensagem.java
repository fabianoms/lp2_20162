package pkgfinal;

public final class Mensagem {

	protected final int MAX_CARACTERES;
	private final static int MAX_CARACTERES_PADRAO = 100;
	
	protected String corpo;
	
	public Mensagem(int maxCaracteres) {
		MAX_CARACTERES = maxCaracteres;
	}
	
	public Mensagem() {
		this(MAX_CARACTERES_PADRAO);
	}
	
	public String getCorpo() {
		return corpo;
	}
	
	public final boolean setCorpo(String corpo) { 
		if (corpo.length() <= MAX_CARACTERES) {
			this.corpo = corpo;
			return true;
		} else { 
			return false;
		}
	}
}
