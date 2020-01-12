package com.spring.Spring_JPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.Spring_JPA.model.Student;

/*
 * public interface StudentRepo extends CrudRepository<Student, Integer>{
 * 
 * List<Student> findByTech(String tech);
 * 
 * // List<Student> findByIdGreaterThan(int sid);
 * 
 * @Query("from Student where tech=?1 order by name") List<Student>
 * findByTechSorted(String tech); }
 */

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}