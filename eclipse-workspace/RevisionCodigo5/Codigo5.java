package com.generation;

import java.util.Scanner;//se importa el scanner

public class Codigo5 {
	public static void main(String[] args) {//se declara la clase main
	
	System.out.println("Introduzca un número: "); //se acomda el syso
	
	Scanner scanner = new Scanner(System.in);//inicializar con system.in
    
    String ni = scanner.nextLine();
    
    int c = ni;
    
    int afortunado = 0;
    int noAfortunado = 0;
    
    while (ni > 0) {
	  int digito = /*(int)*/(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afortunado++;
      } else {
		noAfortunado++;
	  
	  ni /= 10;
    }
    if (afortunado > noAfortunado) {
      System.out.println("El " + ni + " es un número afortunado."); //faltaba una l
    } else {
      System.out.println("El " + ni + " no es un número afortunado.");
    }
    scanner.close();//Se cerro el scanner
  }
  
}
