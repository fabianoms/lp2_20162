package heranca;

public class LivroLivraria extends Livro {

	private double preco;
	
	public LivroLivraria(double preco) {
		this.preco = preco;
	}
	
	public void setPreco(double novoPreco) {
		preco = novoPreco;
	}
	
	public double getPreco() {
		return preco;
	}
	
}
