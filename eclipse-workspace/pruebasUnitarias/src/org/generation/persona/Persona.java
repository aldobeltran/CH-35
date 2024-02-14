package org.generation.persona;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String gmail;
	private int edad;
	
	
	
	public Persona(String nombre, String apellido, String gmail, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.gmail = gmail;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}



	public boolean validarCorreo() {
		String gmailRegex = "@gmail\\.com$";
		
		Pattern pattern = Pattern.compile(gmailRegex);
		
		Matcher matcher = pattern.matcher(this.gmail);
		
		return matcher.find();
	}
	
}