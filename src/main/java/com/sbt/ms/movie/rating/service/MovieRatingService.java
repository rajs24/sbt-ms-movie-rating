package com.sbt.ms.movie.rating.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbt.ms.movie.rating.models.Rating;

@Service
public class MovieRatingService {

	@Autowired
	private MovieRatingRepository repository;

	/**
	 * Get all movie ratings from db
	 * 
	 * @return list of moview ratings
	 */
	public List<Rating> getAllMovieRatings() {

		List<Rating> movieRatingList = new ArrayList<Rating>();
		repository.findAll().forEach(movieRatingList::add);
		return movieRatingList;
	}

	/**
	 * Get movie rating by movie id
	 * 
	 * @param movieId
	 * @return movie
	 */
	public Optional<Rating> getMovieRatingsByMovieId(int movieId) {

		return repository.findById(movieId);
	}

	/**
	 * Get movie rating by user id
	 * 
	 * @param userId
	 * @return movie
	 */
	public List<Rating> getMovieRatingsByUserId(List<Integer> userId) {

		List<Rating> movieRatingList = new ArrayList<Rating>();
		repository.findAllById(userId).forEach(movieRatingList::add);
		return movieRatingList;
	}

}
