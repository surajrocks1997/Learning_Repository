package com.example.movie_catalog_service.model;

public class Rating {

	private String movieId;
	private double rating;
	
	public Rating() {
		super();
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Rating(String movieId, double rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	
}
