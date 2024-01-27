package org.generation.encapsulation;

/*
 * La estructura basica para crear obejetos es la siguiente:
 * 1.Atributos o propiedades
 * 2.Metodo constructor(1 -  n metodos)
 * 3.Metodos del onjeto (comportamientos)
 * 4.Metodo Getters y Setters
 * 5.Metodo toString
 * */

public class Employee {

	//1- Encapsular atributos o propiedades utilizando un modificador private
	protected String nombre;
	protected String apellido;
	private int id;
	private double salario;
	private String puesto;
	
	//2- Encapsular el metodo constructor, tiene el mismo nombre que la clase, no retorna nada, recibe parametros(atributos) y los asigna a variables del constructor (this)
	
	public Employee(String nombre, String apellido, int id, double salario, String puesto){
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	//3 Encapsular metodos de comportamiento de tipo public
	public void trabajar() {
		System.out.println("Estoy trabajando");
	}
	
	public void calcularSalario() {
		System.out.println("El salario del empleado es de " + this.salario + " pesos");
	}
	public void capacitarse() {
		System.out.println("El trabajador del puesto" + this.puesto + " se capacita");
	}
	
	public void infoGeneral() {
		System.out.println("Id: " + this.id + " Nombre:" + this.nombre + " Apellido: " + this.apellido);
	}
	
	//4. Getters y Setters. Son metodos que nos permiten obtener o enviar informacion que esta protegidapor modificadores de acceso y de esta manera interactuar con nuestros objetos. Los getter nos permiten obtener la info y los Setters nos permiten enviar la info.
	/*
	 * Estructura de Getter:
	 * 		public tipoDato getNombreVariable () {
	 * 			return nombreVariable;
	 * 		}
	 * 		p.e.
	 * 			public String getNombre () {
	 * 				return nombre;	
	 * 			}
	 * Estructura de Setter:
	 * 		public void setNombreVariable (variable) {
	 * 			this.variable = variable;
	 * 		}
	 * 		p.e.
	 * 			public void setNombre (String nombre) {
	 * 				this.nombre = nombre;	
	 * 			}
	 * Podemos inicializar Getter y Setter dando click derecho > Source > Generate Getters y Setters > Select All > Genereate
	 */
	
	
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto){
		this.puesto = puesto;
	}

	
	
	//5. Metodo to String. Es un "Override" que se refiere a la capacidad de proporcionar informacion especifica en una clase en forma de cadena de caracateres. Nod¿s permite imprimir nuestros objetos en formato String.
	// Podemos inicializar Getter y Setter dando click derecho > Source > Generate toString> Fields > Genereate

	@Override
	public String toString() {
		return "Employee [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", salario=" + salario
				+ ", puesto=" + puesto + "]";
	}
	
}
