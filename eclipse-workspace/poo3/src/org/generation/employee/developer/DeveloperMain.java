package org.generation.employee.developer;

public class DeveloperMain {
	public static void main(String [] args) {
		Developer Baruch = new Developer("Baruch moreno", 418000, 18632, "programador", "Java");
		System.out.println(Baruch);
		
		Baruch.calcularSalario();//Metodo de superclase
		Baruch.codear();//Metodo de la subclase
	}
}
