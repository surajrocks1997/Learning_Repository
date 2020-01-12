package com.spring.Spring_JPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.Spring_JPA.dao.StudentRepo;
import com.spring.Spring_JPA.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
//	@RequestMapping("/addStudent")
//	public String addStudent(Student stud) {
//		repo.save(stud);
//		return "home.jsp";
//	}
	
	@DeleteMapping("student/{sid}")
	public String deleteStudent(@PathVariable int sid) {
		Student stud = repo.getOne(sid);
		repo.delete(stud);
		return "deleted";
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student stud) {
		repo.save(stud);
		return stud;
	}
	
	@PutMapping("/student")
	public Student saveOrUpdateStudent(@RequestBody Student stud) {
		repo.save(stud);
		return stud;
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int sid) {
		ModelAndView mv = new ModelAndView("showStudent.jsp");
		Student stud = repo.findById(sid).orElse(new Student());
		mv.addObject(stud);
		return mv;
	}
	
	@GetMapping("students")
//	@ResponseBody
	public List<Student> RESTgetStudents() {		
		return repo.findAll();
	}
	
	@RequestMapping("student/{sid}")
//	@ResponseBody
	public Optional<Student> RESTgetStudent(@PathVariable int sid) {		
		return repo.findById(sid);
	}
	
}
