package heranca;

public class TestaLivros {

	public static void main(String[] args) {
		LivroBiblioteca lb = new LivroBiblioteca();
		lb.setTitulo("meu lb");
		//lb.setNumPaginas(150);
		lb.emprestar();
		
		LivroLivraria lv = new LivroLivraria(120.99);
		lv.setTitulo("meu lv");
		//lv.setNumPaginas(349);
		lv.getPreco();
		
		//exemplo de casting
		double media = 2.6;
		int mediaInteira = (int) media;
		System.out.println(mediaInteira);
		
		//upcasting é implícito em Java
		Livro livroQualquer = lv;
		
		//downcasting é um artifício não muito recomendado
		Livro meuLivro = new Livro();
		LivroLivraria conversaoPerigosa = (LivroLivraria)meuLivro;
		
		

	}

}
