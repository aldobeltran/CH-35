

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.generation.persona.Persona;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	/*
	 * Requerimientos
	 * 1. Instanciar objetos con los parametros establecidos en el constructor
	 * 2. Crear metodos(4) para probar cada objeto instanciado con los valores de los atributos(getters)
	 * 3. Crear un metodo de validacion de email, donde email debe cumplir con la condicion de dominio @gmail.com
	 * Si cumple con la condicion, el test se evalua correcto, si no, se evalua como falla
	 * usando test boolean , regex
	 * */

	private Persona personaTest = new Persona("Pepe","Lopez","lopez@gmail.com",28);
	

	@Test
	public void validarCorreoTest(){
		assertEquals(true, personaTest.validarCorreo());
	}}
	
