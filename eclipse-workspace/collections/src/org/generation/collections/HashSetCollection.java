package org.generation.collections;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		//HahSet es una clase de collections donde cada elemento es unico, es decir no se repiten los elementos.
		
		/**
		 * La clase HashSet no va a garantizar que los elementos se muestren según el orden establecido ya que busca eficientar la búsqueda y recuperación de los elementos.
		 * Utiliza tablas hash para almacenar los elementos y mostrarlos al usuario
		 */
		HashSet<String> animals = new HashSet<String>();
		
		animals.add("Buho");
		animals.add("Caballo");
		animals.add("Perro");
		animals.add("Gato");
		animals.add("Ornitorrinco");
		animals.add("Cebra");
		animals.add("Ornitorrinco");
		animals.add("Mapache");
		animals.add("Capibara");
		animals.add("Capibara");
		animals.add("Capibara");
		
		//Imprimir el Hashset
		System.out.println(animals);
		
		//Conocer si un elemento se encuentra dentro del set: container();
		System.out.println(animals.contains("Capibara"));
		
		//Eliminar un elemento: remove();
		animals.remove("Cebra"); //elimino
		System.out.println(animals); //Imprimo el set sin el elemento eliminado
		
		//Agrega un elemento
		animals.add("Loro");
		System.out.println(animals);
		
		//Agrega un elemento en una sola linea
		animals.addAll(Arrays.asList("Perrito","Gato","Oso","Nahual","Tepezcuintle"));
		System.out.println(animals);
		
		//Limpia toda la lista
		animals.clear();
		System.out.println(animals);
		
		//Vuevlo a agregar elementos
		animals.addAll(Arrays.asList("Perrito","Gato","Oso","Nahual","Tepezcuintle"));
		System.out.println(animals);
	}

}
