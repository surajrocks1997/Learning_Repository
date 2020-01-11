package com.rest.RestAPI_SpringDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	@Autowired
	StudentRepository repo;

	@RequestMapping("students")
	public List<Student> getStudents(){
		List<Student> stud = (List<Student>) repo.findAll();
		
		return stud;
	}
}
