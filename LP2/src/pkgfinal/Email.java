package pkgfinal;

public class Email extends Mensagem {

	private String assinatura;
	
	@Override
	public void setCorpoMsg(String c) {
		corpoMsg = c + assinatura;
	}

}
