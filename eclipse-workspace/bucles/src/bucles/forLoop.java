package bucles;

public class forLoop {

	public static void main(String[] args) {
		/*
		 * El ciclo for, nos proporciona una forma compacta de iterar sobre valores.
		 * for (inicializacion; condicion; contador 
		 * (incremento/ decremanto)){
		 * bloque de codigo
		 * }
		 * */
		
		//////For con variable local
		
		for (int numero = 1; numero <= 5; numero++) {
			System.out.println("Numero " + numero);
		}
		
		//////for con variables globales
		
		int contador;
		for (contador = 1;contador <=5; contador ++) {
			System.out.println("Numero" + contador);
		}
		
		//Bucleas anidados= bucle dentro de otro bucle
		//imprimir un triangulo con astericos
		
		int filas = 5;
		for (int i = 0; i < filas; i++) {
			//bloque de codigo que va a iterar con el bucle
			for (int j = 0; j <= i; j++) {
				System.out.print(":)");
			}
			System.out.println();
		}
		
	}//metodo

}//clase
