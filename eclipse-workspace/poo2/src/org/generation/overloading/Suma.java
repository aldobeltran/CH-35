package org.generation.overloading;

import java.math.BigDecimal;

public class Suma {
		//Crear dos metodos llamados sumar, uno que reciba dos parametros de tipo int y el otro reciba dos parametros de tipo double
	static int sumar(int num1, int num2) {
		return num1 + num2;
	}
	static double sumar(double num1, double num2) {
		return num1 + num2;
	}
	
		//Crear un metodo para suma con Big Decimal
		static BigDecimal sumar(BigDecimal num1, BigDecimal num2) {
			return num1.add(num2); //Metodo para sumar dos numeros
		}
	}
