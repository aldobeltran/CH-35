package org.generation.employee;

public class EmployeeMain {
	public static void main(String[]args) {
		//Instanciar los objetos
		Employee Daniel = new Employee("Daniel", "Maldonado", 7838, 8596.54, "Instructor");
		Employee Abigail = new Employee("Abigail", "Martinez", 5436, 30234.34, "Desarrollador Fullstack");
		Employee Arturo = new Employee("Arturo", "Avila", 4531, 15983.54, "FrontEnd");
		
		System.out.println(Daniel);
		System.out.println(Abigail);
		System.out.println(Arturo);
		
		//invocando metodos preestablecidos (trabajar, calcularsalario, infogeneral)
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		Abigail.capacitarse();
		
		//utilizar informacion especifica de cada objeto mediantes sus propiedades
		System.out.println(Daniel.getNombre() + " "+ Daniel.getApellido() + " ocupa el puesto de "+ Daniel.getPuesto());
		System.out.println(Abigail.puesto + " gana $" + Abigail.salario + " pesos");
		
		//Actualizacion informacion mediante setter
		Arturo.setSalario(23000.11);
		Arturo.calcularSalario();
	}
}
