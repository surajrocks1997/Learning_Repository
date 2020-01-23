package com.example.movie_catalog_service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.movie_catalog_service.model.CatalogItem;
import com.example.movie_catalog_service.model.Movie;
import com.example.movie_catalog_service.model.Rating;
import com.example.movie_catalog_service.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		
		UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId, UserRating.class);
		
		return ratings.getUserRating().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
			
//			Movie movie = webClientBuilder.build()
//				.get()
//				.uri("http://localhost:8082/movies/" + rating.getMovieId())
//				.retrieve()
//				.bodyToMono(Movie.class)
//				.block();
			
			return new CatalogItem( movie.getName(), "just for testing", rating.getRating());
		})
		.collect(Collectors.toList());
 			
	}
}


