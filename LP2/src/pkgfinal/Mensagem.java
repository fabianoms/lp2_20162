package pkgfinal;

public final class Mensagem {

	private final int MAX_CARACTERES;
	
	protected String corpoMsg;
	
	public Mensagem(int maxCaracteres) {
		MAX_CARACTERES = maxCaracteres;
	}
	
	public Mensagem() {
		this(500);
	}
	
	public final void setCorpoMsg(String c) {
		corpoMsg = c;
	}
	
	
	
	
}
