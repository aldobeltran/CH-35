package org.generation.execrsices;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Programa que permite que un usuario agregue nombre y apellidos de estudiantes matriculados en un a universidad.
 * Posteriormente muestra la lista de los esstudiantes agregados.
 * 
 * -Requerimientos:
 * 		> Utilizar ArrayList para guardar a los estudiantes (Arraylist<string>)
 * 		> Utilizar Scanner para interactura con el usuario.
 * 		> Ciclo para permitar que se agreguenvarios estudiantes(Do while)
 * 		> Opcion para salir del ciclo con la palabra salir (if-else, try catch,!=, switch,etc)
 * 		> Mostrar lista de estudiantes (for-each)
 * 		
 * */

public class SistemaEscolar {

	public static void main(String[] args) {
		
		//Inicializar un ArrayList para guardar a los estudiantes
		
ArrayList<String> estudiantes = new ArrayList<String>();
		
		//Scanner para el usuario
		Scanner scanner = new Scanner(System.in);
		
		//loop para permitir agregar usuarios
		String nombreEstudiante; //Inicializado de manera global
		
		do {
			System.out.println("Ingresa el nombre del estudiante. \n Escribe 'Salir' para finalizar.");
			nombreEstudiante = scanner.nextLine(); //invocado de manera local
			estudiantes.add(nombreEstudiante);
		} while(!(nombreEstudiante.equals("Salir") || nombreEstudiante.equals("salir"))); //Siempre que NO se escriba Salir, la funcion seguira pidiendo nombre con escanner
		
		//mostrar lista de estudiantes (for-each)
		System.out.println("**Lista de estudiantes: ");
		for (String estudiante : estudiantes) {
			if(!(estudiante.equals("Salir") || estudiante.equals("salir"))) {
				System.out.println(estudiante);
			}
		}
		
		scanner.close();
		
		
		/*
		 * Modificar nuestro programa para permitir salir con las palabras 'Salir' o 'salir'.
		 * Agregar la opción que permite que el usuario elimine un estudiante después de haberlo agregado y muestre la lista actualizada después de la eliminación (.remove);).
		 * 
		 */
	}

}
