package org.generation.encapsulation;

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
		//Necesitamos traer la informacion mediante getters ya que los atributos se convirtieron en privados
		System.out.println(Abigail.getPuesto() + " gana $" + Abigail.getSalario() + " pesos");
		
		//Actualizacion informacion mediante setter
		Arturo.setSalario(23000.11);
		Arturo.calcularSalario();
	}
}
