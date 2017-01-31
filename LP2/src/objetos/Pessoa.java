package objetos;

public class Pessoa {

	private String nome;
	
	private String endereco;
	
	private int anoNasc;
	
	private String cpf;
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String novoEnd) {
		endereco = novoEnd;
	}
	
	public int getAnoNasc() {
		return anoNasc;
	}
	
	public void setAnoNasc(int novoAno) {
		anoNasc = novoAno;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setCPF(String novoCPF) {
		cpf = novoCPF;
	}
	
	public int idade(int anoAtual) {
		return anoAtual - anoNasc;
	}
	
	
	
}
