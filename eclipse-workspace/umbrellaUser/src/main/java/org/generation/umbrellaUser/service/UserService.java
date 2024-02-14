package org.generation.umbrellaUser.service;

import java.util.List;

import org.generation.umbrellaUser.exception.UserNotFoundException;
import org.generation.umbrellaUser.model.User;
import org.generation.umbrellaUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//Eliminamos todo o relacionado al arraylist que creamos para instanciar objetos.
	//Ahora vamos a traer a JPA para que me brinde los metodos para recuperar los datos
	private final UserRepository repository;
	
	//constructor
	@Autowired
	public UserService (UserRepository repository) {
		this.repository = repository;
	}
	//Crear metodo del tipo Get para traer a todos los usuarios
	public List<User> allUsers(){
		return repository.findAll();
		
	}

	//Crear método de tipo get para traer un usuario por id, si no encuentra al usuario arroja una exception (default o personalizada)
		public User getOne(Long id) {
			return repository.findById(id)
					.orElseThrow(() -> new UserNotFoundException(id)); //Estoy creando una exception personalizada que vivirá en otra clase con el mismo nombre de la exception
		}
	//Crear metodo para eliminar un usuario. Primero debemos comprobar que el usuario con el id realmente existe, en caso de existir se elimina, si no, se lanza una exception por default (IllegalStateException) o personalizada
		
	public void deleteUser(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		}else {
			//throw new IllegalStateException("El cliente cn ele id " + id "no existe");
			
			throw new UserNotFoundException(id);
		}
	}
	
	/* Post, crear un nuevo usuario. 
	 * Primero tengo que consultar la DB para saber si el usuario existe. Por ello, debo definir de qué manera buscaré a mi usuario. En este caso será mediante email.
	 * Si el usuario con un email asociado existe, no puede crear un nuevo usuario con el mismo email.
	 * Si no hay un usuario con el email asociado, se crea un nuevo usuario.
	 * Tenemos que definir la búsqueda específica por email (findByEmail) utilizando una consulta de tipo JPQL, la cual se realiza dentro la interface UserRepository ya que ahí se implementan todas los métodos de JPA
	 */
		
	public User addUser(User user) {
		//Crear una variable de tipo User para buscar el email del usuario, traemos el valor de la DB y despues realizo la sentencia (if-else) si es true se cumple ,en caso contrario arrojar excepcion
		User existingUser = repository.findByEmail(user.getEmail());
		if(existingUser != null) {
			throw new IllegalStateException("El usuario con el email ya esta registrado a una cuenta");
		}
		return repository.save(user);
	
	}
	/*
	 * Crear metodo put para actualizar la informacion de un usuario
	 * Debemos iterar cada key/value del objeto para observar las modificaciones y aplicarlas en el atributo especifico para ello valemos de un metodo .map
	 * */
	
	public User replaceUser(User user, Long id) {
		return repository.findById(id)
				.map(userMap -> { //Función lambda
					userMap.setNombre(user.getNombre());
					userMap.setApellido(user.getApellido());
					userMap.setEmail(user.getEmail());
					userMap.setPassword(user.getPassword());
					return repository.save(userMap);
				})
				.orElseGet(() -> {
					user.setId(id);
					return repository.save(user);
				});
	}
	
	/*
	 * podemos buscar un usuario por medio de su correo para recuperar infprmacion, para ello dependemos del  jPQL
	 * en el repository y responseEntity que se ejecutara en el controller
	 * Vamos a crear un metodo para buscar a un usuario por email getUserbyEmail
	 * 
	 * */
	
	public User getUserByEmail(String email) {
		return repository.findByEmail(email);
	}
	
}
