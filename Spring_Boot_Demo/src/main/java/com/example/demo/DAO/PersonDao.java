package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.Model.Person;

public interface PersonDao {
	
	/*
	 * here we have created two methods to create a new person
	 * one with given ID and another with no given ID (here id is 
	 * randomly generated)
	 */
	int insertPerson(UUID id, Person person);
	
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
	
	List<Person> selectAllPeople();
	
	Optional<Person> selectPersonById(UUID id);
	
	int deletePersonById(UUID id);
	
	int updatePersonById(UUID id, Person person);
}
