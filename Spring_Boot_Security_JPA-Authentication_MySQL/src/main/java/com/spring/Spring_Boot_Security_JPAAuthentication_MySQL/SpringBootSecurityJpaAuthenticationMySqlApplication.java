package com.spring.Spring_Boot_Security_JPAAuthentication_MySQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepo.class)
public class SpringBootSecurityJpaAuthenticationMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJpaAuthenticationMySqlApplication.class, args);
	}

}
