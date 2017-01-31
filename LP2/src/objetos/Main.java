package objetos;

public class Main {
	public static void main(String[] args) {
	
		Contador c1 = new Contador();
		Contador c2 = new Contador(100);

		c1.incrementa();
		c2.incrementa();
		System.out.println(c1.getContagem());
		System.out.println(c2.getContagem());
		
	
	}
	
	
	
	
	
	public static void testePessoa() {
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
