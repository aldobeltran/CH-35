package org.generation.employee.manager;

import org.generation.employee.Employee;

/*
 * La clase Manager sirve como subclase (clase hija), por lo tanto, debe extender (heredar) desde la superclase (clase Employee) para poder acceder a los atributos y métodos de la superclase 
 */

public class Manager extends Employee {
	//1. Atributos
	private int antiguedad;
	private double incremento;
	
	//2. Constructor. NOTA: No podemos definir el incremento, porque no conocemos cuál es el incremento de cada objeto, es decir, cada objeto tendrá su incremento con base en un método llamado calcularIncremento();
	public Manager(String nombreCompleto, int id, double salario, String puesto, int antiguedad) {
		super(nombreCompleto, id, salario, puesto);
		this.antiguedad = antiguedad;
	}
	
	//3. Getters y setters
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getIncremento() {
		return incremento;
	}

	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	//4. Método del usuario
	public void organizarReunion() {
		System.out.println("El manager " + this.getNombreCompleto() + " convoca a una reunión");
	}
	
	//Invocar el método de la superclase que guarda el salario base de cualquier Employee
	double salarioBase = super.getSalario();
	
	/* 
	 * En la empresa los Managers reciben un incremento salarial de $1000 al cumplir su primer año de antigüedad.
	 * Después de recibir su primer incremento, cada año reciben un incremento de $500
	 * 	Requerimientos:
	 * 		- Verificar la antiguedad. Si es mayor o igual a 1 es true, si no, es false
	 * 		- Crear método para verificar la antigüedad y calcular el incremento salarial 
	 */
	
	public void calcularIncremento() {
		if (this.antiguedad >= 1) {
			//Operación matemática para determinar el incremento con base en la antigüedad
			double incrementoTotal = 1000 + (this.antiguedad - 1) * 500;
			this.setIncremento(incrementoTotal);
		} else {
			this.setIncremento(0);
			System.out.println("No hay incremento");
		}
	}

    //Método para calcular el salario con incremento (siempre que se cumpla la condición)
	public void calcularSalario() {
		calcularIncremento();
		
		double salarioManager = salarioBase + this.getIncremento(); //this.incremento();
		this.setSalario(salarioManager);
		System.out.println("El salario del Manager " + this.getNombreCompleto() + " es de $" + salarioManager);
	}


	//5. toString. Para generar el toString y mandar a llamar los atributos de la superclase, debo seleccionar los getters de los atributos heredados. Después, puedo modificar el return según mi conveniencia
	@Override
	public String toString() {
		return "Manager [antiguedad=" + antiguedad + ", incremento=" + incremento + ", nombre="
				+ getNombreCompleto() + ", id=" + getId() + ", salario=" + getSalario() + ", puesto="
				+ getPuesto() + "]";
	}
}

