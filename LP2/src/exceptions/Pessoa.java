package exceptions;

public class Pessoa {

	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCPF(String cpf) throws CPFInvalidoException {
		if (cpfValido(cpf)) {
			this.cpf = cpf;
		} else {
			throw new CPFInvalidoException(cpf);
		}
	}
	
	private boolean cpfValido(String cpf) {
		return cpf.length() == 11;
	}
	
	public int tamanhoDoNome() throws PessoaSemNomeException {
		if (nome == null)
			throw new PessoaSemNomeException();
		return nome.length();
	}
}
