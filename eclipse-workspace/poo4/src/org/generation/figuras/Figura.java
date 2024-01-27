package org.generation.figuras;

/*
 * Figura será una superclase abstracta que contiene un método abstracto, el cual será implementado por sus subclases
 * Rectangulo y circulo son subclases que reciben el método de Figura
 * */

//Con abstract le digo a Java que mi clase es abstracta
abstract class Figura {
	//Método abstracto para calcular el área
	public abstract double calcularArea();
	
	//Método "concreto" para imprimir información sobre la figura
	public void infoFigura() {
		System.out.println("Esta es una figura");
	}
}