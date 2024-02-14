package org.generation.calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {
		//Instanciar
		Calculadora calculadora = new Calculadora();
		
		//Metodo sumar
		System.out.println("El resultado de sumar " + calculadora.sumar(5,10));
	
		//Metodo restar
				System.out.println("El resultado de restar " + calculadora.restar(5,10));
		
		//Metodo multiplicar
		System.out.println("El resultado de multiplicar " + calculadora.multiplicar(5,10));
	
		//Metodo dividir
				System.out.println("El resultado de dividir " + calculadora.dividir(5,10));
			
	}

}
