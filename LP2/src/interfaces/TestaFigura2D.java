package interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaFigura2D {

	@Test
	public void testaQuadrado() {
		Figura2D quadrado = new Quadrado(1);
		assertEquals(1, quadrado.area(), 0.0001);
		assertEquals(4, quadrado.perimetro(), 0.0001);
		quadrado = new Quadrado(12);
		assertEquals(12*12, quadrado.area(), 0.0001);
		assertEquals(48, quadrado.perimetro(), 0.0001);
	}

}
