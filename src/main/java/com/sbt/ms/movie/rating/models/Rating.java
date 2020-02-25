package com.sbt.ms.movie.rating.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_RATING")
public class Rating {

	@Id
	@Column(name = "rating_id")
	private int id;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "movie_id")
	private int movieId;

	@Column(name = "rating")
	private int rating;

	public Rating() {

	}

	public Rating(int userId, int movieId, int rating) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
