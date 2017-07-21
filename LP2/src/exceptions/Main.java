package exceptions;

public class Main {
	public static void main(String[] args) {
		Pessoa a = new Pessoa();
		a.setNome("Josenildo");
		Pessoa b = new Pessoa();
		Pessoa c = new Pessoa();
		try {
			System.out.println(a.tamanhoDoNome());
			a.setCPF("12345678912");
		} catch (PessoaSemNomeException e) {
			System.out.println(e.getMessage());
		} catch (CPFInvalidoException e) {
			System.out.println("CPF inválido informado: " + e.getMessage());
		}
		finally {
			System.out.println("Fechar arquivo...");
		}
		System.out.println("Chegou no final");
		
	}
}
