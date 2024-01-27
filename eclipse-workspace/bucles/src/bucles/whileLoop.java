package bucles;
import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		/*
		 * While ejecuta un bloque de codigo hasta que se cumpla una condicion
		 * 
		 * while (expresion){
		 * bloque de codigo a ejecutar
		 * (contador-iterador)
		 * }
		 * 
		 * */
		
		int cuenta = 0;
		while ( cuenta < 15 ) {
			cuenta ++;
			System.out.println("La cuenta es de " + cuenta);
		}
		
		/*Crear un programa que solicite al usuario un número. Dicho número será tomado como el número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		1. Importar un scanner e implementarlo
		2. Un mensaje para darle contexto al usuario
		3. Almacenar el número del usuario en una variable.
		4. Guardar en variable el número que iniciar la cuenta (1)
		5. Implementar un ciclo While
		6. Mostrar por consola el resultado.		
		*/
		
		//1 scanner (recuerda hacer la importacion)
		Scanner sc = new Scanner(System.in);
		
		//2 mostrar en consola
		System.out.println("Escribe un numero que servira como numero final");
		
		//3 Invocar escaner con parametro final
		int nFinal = sc.nextInt();
		
		//4 Invocar escaner con parametro inicial
		int nInicial = 1;
		
		//5 While que evalua numero final e inical
		while (nInicial <= nFinal) {
			System.out.println("La cuenta va en" + nInicial);
			nInicial++;
			
		}
		sc.close();
		
	}

}
