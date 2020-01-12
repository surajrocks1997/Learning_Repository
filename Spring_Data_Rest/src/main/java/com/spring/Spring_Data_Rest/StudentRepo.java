package com.spring.Spring_Data_Rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.Spring_Data_Rest.model.Student;

@RepositoryRestResource(collectionResourceRel = "students", path="students")
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
