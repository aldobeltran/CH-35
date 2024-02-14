package org.generation.umbrellaUser.exception;

//Hereda de RuntimeException
public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException(Long id) {
		super("No podemos encontrar al usuario con id " + id);
	}
}