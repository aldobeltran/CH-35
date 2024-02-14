package org.generation.persona;

public class PersonaMain {

	public static void main(String[] args) {
//instanciar los objetos
		Persona Aldo = new Persona ("Aldo","Beltran","aldo@gmail.com", 25);
		Persona Cesar = new Persona ("Cesar","Zaldivar","cesar@gmail.com", 25);
		Persona Abigail = new Persona ("Abigail","Martinez","abi@gmail.com", 25);
		Persona Dante = new Persona ("Dante","Ibarra","dante@gmail.com", 25);
		
		Aldo.getNombre();
		Cesar.getApellido();
		Abigail.getGmail();
		Dante.getEdad();
		
	}}
