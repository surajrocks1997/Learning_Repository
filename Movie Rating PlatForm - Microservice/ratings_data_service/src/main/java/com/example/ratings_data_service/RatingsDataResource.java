package com.example.ratings_data_service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratings_data_service.model.Rating;
import com.example.ratings_data_service.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

//	@RequestMapping("/movies/{movieId}")
//	public Rating getRating(@PathVariable String movieId) {
//		return new Rating(movieId, 4.5);
//	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable String userId) {
		UserRating userRating = new UserRating();
		userRating.initData(userId);
		return userRating;
	}
}