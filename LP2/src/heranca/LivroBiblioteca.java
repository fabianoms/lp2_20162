package heranca;

public class LivroBiblioteca extends Livro {

	private boolean emprestado;
	
	public LivroBiblioteca() {
		emprestado = false;
	}
	
	public boolean estaEmprestado() {
		return emprestado;
	}
	
	public void emprestar() {
		emprestado = true;
	}
	
	public void devolver() {
		emprestado = false;
	}
}
