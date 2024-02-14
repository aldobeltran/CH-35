package org.generation.umbrellaUser.controller;

import java.util.List;

import org.generation.umbrellaUser.model.User;
import org.generation.umbrellaUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController //Indica que esta clase es una API de tipo REST (trabaja con metodos HTTP)
@RequestMapping ("admin")//Construimos la ruta de nuestra API, definimos endpoints (localhost:8080/admin/users)
@CrossOrigin(origins="*", methods={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})//asi se define que culauier host o url jale el asterisco significa todos

public class UserController	{
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
		
	}
	
	@GetMapping ("users")
	public List<User> getUsers(){
		return userService.allUsers();
	}
	//path variabale ya que buscamos por id y los id son diferentes, entonces necesito definir el endpoint entre llaves y dentro del metodod debo crear una anotacion @Pathvariable
	@GetMapping("users/{id}")
	public User getOne(@PathVariable(name = "id") Long id) {
		return userService.getOne(id);
	}
	
	//Delete de tipo void y define un path variable
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable(name = "id") Long id) {
		userService.deleteUser(id);
	}
	//post, crear un nuevo usuario
	/*
	 * ¿como agrego usuarios desde postman? Tenemos que establecer el cuerpo de la instancia en formato JSON (Key/value) y mandar el metodo POST
	 * */
	@PostMapping("users")
	public User newUser(@RequestBody User newUser) {
		return userService.addUser(newUser);
	}
	//Put modificar/actualizar a un usuario existente
	@PutMapping("users/{id}")
	public User replaceUser(@RequestBody User user,@PathVariable(name="id")long id) {
		return userService.replaceUser(user, id);
	}
	/*
	 * --ResponseEntity <> clase de springframework que representa una repuesta HTTP personalizable
	 * Permite controlar el body de la respuesta posee dos parametros:
	 * 1.-Especifica el tipo de datos
	 * 2.-Especifica el codif¿go de estado HTTP `httpstaus.method`
	 * --@RequestParam anotacion de springFramework que se utiliza para vincular parametros de solicitud HTTP que se enviará a la respuesta. Es decir, permite controlar las llaves-valores dentro del parámetro  
	 * 
	 * */
	//Metodo para traer un usuario por email
	@GetMapping("/users/byEmail")
	public ResponseEntity<User> getUserByEmail(@RequestParam(name="email")String email){
		User user = userService.getUserByEmail(email);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
