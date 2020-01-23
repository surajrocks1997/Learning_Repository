package com.example.ratings_data_service;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratings_data_service.model.Rating;
import com.example.ratings_data_service.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4.5);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4.2),
				new Rating("1235", 3.9)
					);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}
}