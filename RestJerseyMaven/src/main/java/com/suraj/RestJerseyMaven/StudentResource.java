package com.suraj.RestJerseyMaven;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStudent() {
		Student stud = new Student();
		System.out.println("hello there");
		stud.setName("Suraj");
		stud.setPoint(60);


		Student stud1 = new Student();
		System.out.println("hello there");
		stud1.setName("Suraj");
		stud1.setPoint(60);
		
		List<Student> students = Arrays.asList(stud, stud1);
		return students;
	}
}
