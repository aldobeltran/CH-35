package org.generation.employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee Rocio = new Employee("Rocio Hrdz", 42013, 12000d, "Desarrollador FrontEnd ");
		Employee Rene = new Employee("Rene Gomez", 97655, 15500d,"Desarrollador movil");
		Employee Diego = new Employee("Diego Gonzales", 0054, 25000d, "Desarrollador backend");
		
		Rocio.trabajar();
		Rene.capacitarse();
		Diego.calcularSalario();
		Rene.infoGeneral();
	}
}
