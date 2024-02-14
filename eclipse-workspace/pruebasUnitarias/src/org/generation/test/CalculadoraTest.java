package org.generation.test;

import static org.junit.Assert.assertEquals;

import org.generation.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	//1. Mandar a llamar un objeto de tipo Calculadora como variable
	private Calculadora calculadoraTest;
	
	//1.1. Crear un método llamado setUp para instanciar mi calculadoraTest como nuevo objeto de tipo Calculadora y le debo indicar que se ejecute antes de todos los test con la anotación @BeforeEach
		@BeforeEach
		public void setUp() {
			calculadoraTest = new Calculadora();
		}
	
	//2. Comenzar a crear métodos de prueba (test) que no retornan (void) e importar @Test
	@Test
	public void sumarTest() {
		//assertEquals(resultado esperado, variable+método(parámetros a evaluar));
		assertEquals(15, calculadoraTest.sumar(7, 8));
	}
	//3. Revisar el archivo `module-info.java` y eliminar los módulos que se importaron
	//4. Importar `Assert.assertEquals`
	
	//estas son las pruebas con assertEquals vemos el resultado esperado
	@Test
	public void restarTest() {
		assertEquals(-1, calculadoraTest.restar(17, 18));
	}
	
	@Test
	public void multiplicarTest() {
		assertEquals(18, calculadoraTest.multiplicar(6, 3));
	}
	
	@Test
	public void dividirTest() {
		assertEquals(12, calculadoraTest.dividir(96, 8));
	}
}
