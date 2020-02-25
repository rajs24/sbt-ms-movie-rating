package com.sbt.ms.movie.rating.controller;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbt.ms.movie.rating.models.Rating;
import com.sbt.ms.movie.rating.models.UserRating;
import com.sbt.ms.movie.rating.service.MovieRatingRepository;
import com.sbt.ms.movie.rating.service.MovieRatingService;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {

	@Autowired
	private MovieRatingService movieRatingService;

	@Resource
	private MovieRatingRepository movieRepository;

	/**
	 * Get all movie ratings from db
	 * 
	 * @return list of moview ratings
	 */
	@RequestMapping("/all")
	public UserRating getAllMovieRatings() {
		UserRating userRating = new UserRating();
		userRating.setUserRating(movieRatingService.getAllMovieRatings());
		return userRating;
	}

	/**
	 * Get movie rating by movie id
	 * 
	 * @param movieId
	 * @return movie
	 */
	@RequestMapping("/{movieId}")
	public Optional<Rating> getMovieRatingByMovieId(@PathVariable("movieId") int movieId) {

		return movieRatingService.getMovieRatingsByMovieId(movieId);
	}

	/**
	 * Get movie rating by user id
	 * 
	 * @param userId
	 * @return movie
	 */
	@RequestMapping("users/{userId}")
	public UserRating getMovieRatingByUserId(@PathVariable("userId") int userId) {

		UserRating userRating = new UserRating();
		userRating.setUserRating(movieRepository.findByUserId(userId));
		return userRating;
	}
}
