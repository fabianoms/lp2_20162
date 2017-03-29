package metodos_estaticos;

public class Semaforo {

	private static int cor;
	
	public Semaforo() {
		cor = 0;
	}
	
	public void mudarCor() {
		if (cor == 2) 
			cor = 0;
		else
			cor++;
	}
	
	public int getCor() {
		return cor;
	}
	
	public static void main(String[] args) {
		Semaforo s1 = new Semaforo();
		Semaforo s2 = new Semaforo();
		s1.mudarCor();
		s1.mudarCor();
		System.out.println(s1.getCor());
		System.out.println(s2.getCor());
		
		
		
		
	}
	
}
