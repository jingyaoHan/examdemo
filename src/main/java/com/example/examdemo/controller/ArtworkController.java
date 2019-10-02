package com.example.examdemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examdemo.beans.Artwork;
import com.example.examdemo.service.ArtworkService;

@RestController
@RequestMapping("/artworks")
public class ArtworkController {
	@Autowired
	private ArtworkService artworkService;
	
//  @GetMapping
//  public List<Artwork> getAll(){
//	  return artworkService.getAll();
//  }
	
  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable int id) {
	  artworkService.deleteArtworkById(id);
  }
	
  @PostMapping
  public void save(@RequestBody Artwork artwork) {
	  artworkService.save(artwork);
  }
  
  @PutMapping
  public void update(@RequestBody Artwork artwork) {
	  artworkService.edit(artwork);
  }
  
  @GetMapping 
  public Map<Artwork,Integer> sortByPrice(){
	  return artworkService.sortByPrice();
  }
	
}
