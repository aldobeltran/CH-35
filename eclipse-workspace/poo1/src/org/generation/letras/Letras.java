package org.generation.letras;
import java.util.Scanner;

/*
 * 
 * Crear un programa que le solicite un mensaje al usuario y cuente vocales, consonantes, numeros y caracteres posee dicho mensaje
 * Letras: metodos para interactuar con el usuario.
 * LetrasMain: vamos a instanciar los objetos
 * Contador: Metodos para contarvocales , consonantes, numeros y simbolos
 *
 */
public class Letras {
	//Para que nuestro usuario interactue definimos un scanner
	Scanner scanner = new Scanner(System.in);
	//Metemos el scanner ddntro de un metodo
	public String leerEntrada() {
		return scanner.nextLine();
	}
	//Metodo para proporcionar contexto al usuario
	public void mostrarMensaje(String mensaje) {
			System.out.println(mensaje);
		}
	}

