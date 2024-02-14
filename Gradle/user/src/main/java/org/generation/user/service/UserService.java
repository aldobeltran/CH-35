package org.generation.user.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.user.model.User;
import org.springframework.stereotype.Service;

/*
 * En Service definimos los servicios de la bse de datos, emulamos una base de datos utilizando una ArrayList
 * para realizar operaciones del CRUD aunque solo vamos a realizar Read mediante un protocolo HTTP GET
 * Para definir nuestra clase de Java como un service, utilizamos la anotacion @Service
 * 
 * */
@Service
public class UserService {

	//Crear el Arraylist donde van a vivir todos los usuarios qu queriamos agregar
	
	public final List<User> usuario = new ArrayList<User>();

	//instanciar los objetos User en un metodo llamado usuarios
	public UserService () {
		usuario.add(new User (1L,"Aldo","Beltran","aldo@gmail.com","patito123"));
		usuario.add(new User (2L,"Daniel","Maldonado","Dani@gmail.com","patito123"));
		usuario.add(new User (3L,"Rey","David","elrey@gmail.com","patito123"));
		usuario.add(new User (4L,"Eveida","Palos","eve@gmail.com","patito123"));
		usuario.add(new User (5L,"Rodrigo","Macedo","rodo@gmail.com","patito123"));
		usuario.add(new User (6L,"Lizbeth","Ceron","liz@gmail.com","patito123"));
		usuario.add(new User (7L,"Fernanda","Carmona","fer.car@gmail.com","patito123"));
		usuario.add(new User (1L,"Ruben","Aleman","aleman@gmail.com","patito123"));
		usuario.add(new User (8L,"Gonzalo","Piña","gonzalo@gmail.com","patito123"));
		usuario.add(new User (9L,"Eunice","Ceja","eun.ceja@gmail.com","patito123"));
	}
	//Crear metodo del tipo Get para traer a todos los usuarios
	public List<User> allUsers(){
		return usuario;
		
	}
	
}
