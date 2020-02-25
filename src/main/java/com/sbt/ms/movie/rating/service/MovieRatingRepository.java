package com.sbt.ms.movie.rating.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sbt.ms.movie.rating.models.Rating;

public interface MovieRatingRepository extends JpaRepository<Rating, Integer> {

	@Query("SELECT mr FROM Rating mr WHERE mr.userId = :userId")
	public List<Rating> findByUserId(int userId);
}
