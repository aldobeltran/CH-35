package org.generation.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class iterableMain {
	public static void main (String[] args) {
		//podemos iterar sobre una coleccion de 3 maneras:
		//1. Iteracion mediante ciclo for-each
		System.out.println("********For each********");
		List<String> nombres = new ArrayList<String>();
	
		nombres.addAll(Arrays.asList("Braulio", "Fernanda", "Rodrigo", "Ruben", "Marco", "Rey"));
		
		for (String nombre: nombres) {
			System.out.println(nombre);
		}
		
		//2. Iterar mediante Iterator.
		System.out.println("********Iterator********");
		List<String> apellidos = new ArrayList<String>();
		
		apellidos.addAll(Arrays.asList("Aleman", "Garcia", "Martinez", "Cardoso", "Razo", "Ceja"));
		
		//Utilizar un nuevo iterador y le vamos a pasar el metodo iterator() a nuestro ArrayList
		Iterator<String> iterador = apellidos.iterator();
		
		//Utilizando while, devuelve verdadero si la iteracion tiene mas elementos, si no, se termina el ciclo
		while (iterador.hasNext()) {
			String elemento = iterador.next();
			System.out.println(elemento);
		}
		
		//3. Mediante forEach ue toma una expresion java lambda como parametro.
		System.out.println("********Lambda********");
		List<String> animales = new ArrayList<String>();
		
		animales.addAll(Arrays.asList("Cuyo", "Nahual", "Tlacuache", "Ajolote", "Tepezcuitle", "Vaquita marina"));
		
		animales.forEach((animal) -> {
			System.out.println(animal);
		});
	}

}
