package com.example.examdemo.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examdemo.beans.Artwork;
import com.example.examdemo.dao.ArtworkDao;

@Service
public class ArtworkService {
	
	@Autowired
	private ArtworkDao artworkdao;
	
	public List<Artwork> getAll(){
		return artworkdao.findAll();
	}
	
	
	public void deleteArtworkById(int id) {
		artworkdao.deleteById(id);
	}
	
	public void save(Artwork artwork) {
		artworkdao.save(artwork);
	}
	
	public void edit(Artwork artwork) {
		Artwork ar= (Artwork) artworkdao.findById(artwork.getId()).get();
		ar.setArtist(artwork.getArtist());
		ar.setPrice(artwork.getPrice());
		ar.setSize(artwork.getSize());
		ar.setType(artwork.getType());
		ar.setYear(artwork.getYear());
		ar.setName(artwork.getName());
		artworkdao.save(ar);
		
	}
	
	public Map<Artwork,Integer> sortByPrice(){
		Map<Artwork,Integer> map=new TreeMap();
		List<Artwork> ar=artworkdao.findBySold();
		for(int i=0;i<ar.size();i++) {
			map.put(ar.get(i), i);
		}
		return map;
	}
	
	
	
}
