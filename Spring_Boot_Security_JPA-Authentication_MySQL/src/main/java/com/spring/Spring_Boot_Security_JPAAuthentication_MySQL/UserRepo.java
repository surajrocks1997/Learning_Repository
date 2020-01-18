package com.spring.Spring_Boot_Security_JPAAuthentication_MySQL;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);
}
