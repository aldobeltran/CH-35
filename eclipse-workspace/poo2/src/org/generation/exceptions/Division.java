package org.generation.exceptions;

public class Division {
	
	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		/*
		 * La calase Exception nos permite manejar cualquier caso excepcional con nuestro codigo.
		 * Es equivalente a los errores.
		 * Utiliza una estructura de control try-catch que permite manejar las escepciones.
		 * - try. envuelve el codigo que puede generar una excepcion y lo evalua
		 * - catch. contiene el codigo que se ejecuta cuando se lanza la excepcion
		 * 		Sintaxis
		 * 			try{
		 * 				//Codigo protegido
		 * 		} catch (ExceptionName e ) {
		 * 				//Bloque de excepcion
		 * 		}
		 * 		finally: siempre se ejecuta y se utiliza para mostra un mensaje en caso de ser invocado.
		 * 		Podemos prescindir de finally ya que se ejecuta de manera automatica..
		 * */
		try {
			int resultado = dividir(10, 0);
			System.out.println("El resultado de la division es " + resultado);
		} catch(ArithmeticException e) {
			System.out.println("\u001B[31mError: no puedes dividir  entre cero");
		} finally {
			System.out.println("\u001B[32mPrograma finalizado");
		}
	}
}
