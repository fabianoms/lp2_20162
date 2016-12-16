package objetos;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Manoel");
		pessoa.setCPF("123.456.789.11");
		pessoa.setEndereco("Rua ...");
		pessoa.setAnoNasc(1995);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Manoela");
		pessoa2.setCPF("321.456.789.11");
		pessoa2.setEndereco("Rua 2...");
		pessoa2.setAnoNasc(1998);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getCPF());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getAnoNasc());
		System.out.println(pessoa.idade(2016));
		System.out.println();
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getCPF());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getAnoNasc());
		System.out.println(pessoa2.idade(2016));
	}
	
	
}
