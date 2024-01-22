package bucles;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		/*
		 * Cixlo Do while, evalua la expresion en la parte inferior del ciclo.
		 * Las declaraciones dentro del blo "do" siempre se ejecutan al menos una vez.
		 * */
		
		//cuenta del 1 al 20
		int cuenta = 5;
		do {
			System.out.println(cuenta);
			cuenta++;
		}while(cuenta < 0); //Output 1 ya se ejecuto al menos una vez
		
	
		/*
		 * Crear un programa para un cajero bancario
		 * - El programa me mostrará 4 opciones:
		 * 1. Consultar saldo
		 * 2. Ingresar dineros
		 * 3. Retirar dineros
		 * 4. Salir
		 * - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opción (número)
		 * - Mostrar al usuario la opción que eligió y permitir que elija otra opción
		 * - El usuario puede salir del programa escribiendo 4 (salir)
		 */
		
		System.out.println("Bienvenido al cajero Generatio Bank, elija una opción: ");
		
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dineros");
		System.out.println("3. Retirar dineros");
		System.out.println("4. Salir");
		
		Scanner cajero = new Scanner(System.in);
		
		int opcion;
		
		do {
			opcion = cajero.nextInt();
			switch (opcion) {
			case 1: System.out.println("Consultar saldo ");
				break;
			case 2: System.out.println("Ingresar dineros ");
				break;
			case 3: System.out.println("Retirar dineros");
				break;
			case 4: System.out.println("Salir");
				break;
			default : System.out.println("error, elija una opcion valida ");
			}
		} while(opcion != 4);
		
		cajero.close();
		
		
		}
	}


