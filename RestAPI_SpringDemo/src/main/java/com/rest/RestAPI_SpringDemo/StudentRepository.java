package com.rest.RestAPI_SpringDemo;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
