package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.User;
import com.hcl.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@ModelAttribute("countryList")//return object of the service method
	public List populateCountryList(){
		return userService.getCountryList();
	}
	
	@ModelAttribute("communityList")
	public List populateCommunityList(){
		return userService.getCommunityList();
		
	}
	
	@RequestMapping(value="/show-user-form", method=RequestMethod.GET)
	public ModelAndView showUserForm(){
		
		User userObj = new User();
		return new ModelAndView("showUser","user",userObj);
			
	}
	
	//First @ModelAttribute will execute then User object will create
	@RequestMapping(value="/submitForm", method=RequestMethod.POST)
	public ModelAndView addUserDetails(@ModelAttribute User userObj){
		
		userService.addUser(userObj);
		
		return new ModelAndView("userResult","user",userObj);
								//view,model,bean
	}
	
	/*ModelAndView is an object that holds both the model and view. 
	The handler returns the ModelAndView object and DispatcherServlet resolves 
	the view using View Resolvers and View.

	The View is an object which contains view name in the form of the String 
	and model is a map to add multiple objects.*/
	

}
