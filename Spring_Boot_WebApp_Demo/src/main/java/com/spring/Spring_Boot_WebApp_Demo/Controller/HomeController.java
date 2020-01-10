package com.spring.Spring_Boot_WebApp_Demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.Spring_Boot_WebApp_Demo.Student;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(Student stud) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", stud);
		mv.setViewName("Home");
		return mv;
	}
}
