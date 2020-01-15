package com.spring.Spring_Boot_Security_Demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByusername(String username);
}
