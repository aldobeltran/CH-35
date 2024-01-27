package org.generation.employee.manager;

public class ManagerMain {
	public static void main(String [] args) {
		Manager Fernanda = new Manager ("Fernanda Ramos", 136, 45365.20, "Manager", 2);
		System.out.println(Fernanda);
		
		
		//Método calcular salario base heredado
		double salarioBaseFer = Fernanda.salarioBase;
		
		//Método calcular salario polimórfico
		Fernanda.calcularSalario();
		
		double salarioFer = Fernanda.getSalario();
		System.out.println("El salario base de " + Fernanda.getNombreCompleto() + " con posición de " + Fernanda.getPuesto() + " es de $" + salarioBaseFer + " pero posee una antigüedad de " + Fernanda.getAntiguedad() + " años, por lo tanto su salario incrementa a $" + salarioFer);
		
	}
}