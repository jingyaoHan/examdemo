package com.example.examdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.examdemo.beans.Artwork;


public interface ArtworkDao extends JpaRepository<Artwork, Integer> {
	Artwork findByName(String name);

	
	@Query("select a from Artwork a where a.sold = 'Y' ")
	List<Artwork> findBySold();
	
	
}
