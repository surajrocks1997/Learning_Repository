package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.model.Community;
import com.hcl.model.Country;
import com.hcl.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List getCountryList() {
		
		Country country1 = new Country("India","India");
		Country country2 = new Country("USA", "USA");
		Country country3 = new Country("China", "China");
		Country country4= new Country("Germany", "Germany");
		
		List countryList = new ArrayList<>();
		countryList.add(country1);
		countryList.add(country2);
		countryList.add(country3);
		countryList.add(country4);
		
		return countryList;
		
	}

	@Override
	public List getCommunityList() {
	
		List communityList = new ArrayList<>();
		communityList.add(new Community("Hibernate", "Hibernate"));
		communityList.add(new Community("Spring", "Spring"));
		communityList.add(new Community("JSF", "JSF"));
		communityList.add(new Community("Struts", "Struts"));
		
		return communityList;
		
	}

	@Override
	public void addUser(User user) {
	System.out.println("User added successfully ");
	System.out.println("User Name "+user.getName());
		
	}

}
