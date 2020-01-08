package com.hcl.service;

import java.util.List;

import com.hcl.model.User;

public interface UserService {
	
	public List getCountryList();
	public List getCommunityList();
	public void addUser(User user);
	
	

}
