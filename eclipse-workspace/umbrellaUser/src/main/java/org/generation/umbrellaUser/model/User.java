package org.generation.umbrellaUser.model;

/*
 * En la clase donde se establece la logica del modelo de negocio (model) voy a hacer que coincida con mi DB
 * Es decir la clase se convierte en una entidad con @Entity
 * Para establecer la tabal de DB a la que corresponde esta entidad utilizamos la anotacion @Table y el nombre de la entidad
 * Indicarle a la JPA mi punto de entrada (PK), usando la anotacion @Id
 * Como queremos que el id sea autoincrementable usamos la anotacion @GeneratedValue(strategy=GenereationType.IDENTITY
 * Y si queremos podemos establecer la columna a la que corresponde cada atributo con la anotacion @Column
 * (name="name"), pero si tenemos que definir el nombre d ela primera columna para que relacione las demas
 * 
 * */
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user") // nombre de la tabla de la base de datos
public class User {
	//id, nombre, apellido, correo, password
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_client")
	private Long id;
	@Column(name="first_name")
	private String nombre;
	@Column(name="last_name")
	private String apellido;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String password;
	
	//JPA necesita un metodo que permite construir cualquier objeto sin tomar en cuenta sus atributos.
	//Este metodo se conoce coomo constructor vacio
public User() {
	}

	//constructor
	public User(Long id, String nombre, String apellido, String email, String password) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}
	
	
	//getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	//to string
	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", password="
				+ password + "]";
	}
// Tenemos que generar dos metodos adicionales: hashcode y equals.
	//se genera igual con source generate...
	
	//hashcode y equals
	@Override
	public int hashCode() {
		return Objects.hash(apellido, email, id, nombre, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(password, other.password);
	}
	
	
	
	
	
	
}
