package com.spring.Spring_Boot_Security_JWT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Spring_Boot_Security_JWT.jwtUtil;
import com.spring.Spring_Boot_Security_JWT.Model.AuthenticationRequest;
import com.spring.Spring_Boot_Security_JWT.Model.AuthenticationResponse;
import com.spring.Spring_Boot_Security_JWT.Service.MyUserDetailsService;

@RestController
public class HomeController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@Autowired
	private jwtUtil jwtTokenUtil;
	
	@RequestMapping("/home")
	public String home() {
		return ("Hello world");
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> CreatAuthenticationToken(@RequestBody AuthenticationRequest 
			authenticationRequest) throws Exception{ 
		try{
			authenticationManager.authenticate
			(new UsernamePasswordAuthenticationToken(authenticationRequest, 
					authenticationRequest.getPassword()));
		}
		catch(BadCredentialsException e){
			throw new Exception("Incorrect Username and Password", e);
		}
		
		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());
		
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
	
}
