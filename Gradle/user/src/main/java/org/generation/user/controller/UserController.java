package org.generation.user.controller;

import java.util.List;

import org.generation.user.model.User;
import org.generation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
	 * Controla las peticiones de tipo HTTP (Get, Post, Put, Delete, Patch)
	 * Para definir una clase como Controller, se utiliza la anotacion @RestController
	 * Aqui definimos el endpoint d enuestra URI, asi como los endpoints de cada peticion.
	 * 	-Para definir la ruta (endpoinnt) de nestra API, utilizamos la anotacion @RequestMapping
	 * 	-Para definir la ruta (endpoinnt) de cada peticion, utilizamos ath o parentesis
	 * Aqui se lleva a cabo la inyeccion de dependencias en el constructor, utilizando anotacion @AutoWired
	 * Definimos el metodo correspondiente a la peticion HTTP con la anotacion @GetMaping @PostMapping 
	 * @PutMapping @DeleteMapping
	 * */
@RestController //Indica que esta clase es una API de tipo REST (trabaja con metodos HTTP)
@RequestMapping ("admin/users")//Construimos la ruta de nuestra API, definimos endpoints (localhost:8080/admin/users)

public class UserController	{
	//Instanciar desde UserService mediante un nuevo objeto de tipo UseService userService
	private UserService userService;
	
	//Generar el constructor y asignar anotacion @Autowird que indica que aqui se lleva a cabo la inyeccion de dependencias
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
		
	}
	//Necesitamos decirle a controller que tiene que traer la informacion de UserService usando el metodo definido
	//Para traer la informacion (READ) necesitamos indicar el tipo de peticion (GET) mediante la anotacion @Getmapping
	@GetMapping
	public List<User> getUsers(){
		return userService.allUsers();
	}
	
	
}
