package org.generation.collections;

import java.util.Arrays;
import java.util.ArrayList;

public class ArraylistCollections {

	public static void main(String[] args) {
		
		//**Arrays**//
		String[] names = {"Jon","Aldo","Fer","Gonzalo","Martin","Lucero","Eunice"};
		
		//Imprimiendo Arrays
		System.out.println(Arrays.toString(names));
		
		
		int[] edades = {12,27,12,28,40,50,60,70};
		System.out.println(Arrays.toString(edades));
		
		//Acceder a cada elemento del Array
		String name1 = names[0];
		System.out.println("El primer nombre es " +  name1);
		int edad1 = edades[2];
		System.out.println("La edad de " + name1 + " es " + edad1 + " años ");
		
		// Obtener la longitud del Array
		int longitudNames = names.length;
		System.out.println("El array names tiene " + longitudNames + " elementos.");
		
		//Obtener el ultimo elemento
		String ultimoElemento = names[longitudNames - 1];//La longitud ya vive dentro de LongitudNames
		System.out.println("El ultimo elemento del Array name es " + ultimoElemento);
		
		String ultimoElementosinvariable = names[names.length -1];
		System.out.println("El ultimo elemento del Array name es " + ultimoElementosinvariable);
		
		//Mostrar cada elemento utilizando forEach
		for(String nombre : names) {
			System.out.println(nombre);
		}
		
		//***ArrayList****//
		//Arraylist es un array que puede cambiar de tamaño, es la clase de java que representa la estructura de datos de Arrays
		//Permite elementos duplicados y recibe varios metodos para su manipulacion.
		
		ArrayList<String> films = new ArrayList<String>();
		ArrayList<Integer> matricula = new ArrayList<>();
		ArrayList<Character> characters = new ArrayList<>() ;
		
		
		//Agregar elementos
		films.add("Inception");
		films.add("Se7en");
		films.add("The shining");
		films.add("Pulp fiction");
		films.add("Mr Nobody");
		films.add("The shutter island");
		
		System.out.println(films);
		
		//Obtener un elemento: name.get(index);
		String film1 = films.get(0);
		System.out.println("La primer pelicula es " + film1);
		
		//Modificar un elemento: name.set(index, newValue)
		String film3 = films.set(3, "Memento");
		String film3Get = films.get(3);
		System.out.println(film3Get);
		System.out.println(films);
		
		//Conocer el tamaño del ArrayList: name.size();
		int sizeFilms = films.size();
		System.out.println("El tamaño del Arraylist films es de " + sizeFilms + "elementos");
		
		
		//Agregar un elemento y despues eliminarlo: name.remo(index);
		films.add("The fountain");
		System.out.println(films);
		
		films.remove(6);
		System.out.println(films);
		
		
		//Mostrando los elementos del ArrayList en lista
		System.out.println("** Films en lista **");
		for(String pelicula : films) {
			System.out.println(pelicula);
		}
		
		matricula.add(25253);
		
		System.out.println(matricula);
		
	}

}
