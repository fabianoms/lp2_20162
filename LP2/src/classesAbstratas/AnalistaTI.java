package classesAbstratas;

public class AnalistaTI extends Funcionario {

	@Override
	public double calculaRemuneracao() {
		return super.salarioBase * 1.1;
	}

}
