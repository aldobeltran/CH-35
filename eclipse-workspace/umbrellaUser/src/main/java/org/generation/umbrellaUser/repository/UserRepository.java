package org.generation.umbrellaUser.repository;

import org.generation.umbrellaUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository <User, Long>{
	//JPQL... Java Persistence Query Languaje
	@Query("SELECT u FROM User u WHERE u.email=?1")//consultas integradas de JPA
	User findByEmail (String email);
}
