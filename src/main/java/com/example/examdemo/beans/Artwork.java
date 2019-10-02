package com.example.examdemo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ARTWORK")
public class Artwork implements Comparable<Artwork>{
	@Id
	@SequenceGenerator(name="artwork_seq_gen", sequenceName="ARTWORK_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="artwork_seq_gen")
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String type;
	
	@Column
	private String artist;
	
	@Column
	private int year;
	
	@Column(name="MYSIZE")
	private String size;
	
	@Column
	private int price;
	
	@Column
	private String sold;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSold() {
		return sold;
	}

	public void setSold(String sold) {
		this.sold = sold;
	}
	

	@Override
	public String toString() {
		return "Artwork [id=" + id + ", name=" + name + ", type=" + type + ", artist=" + artist + ", year=" + year
				+ ", size=" + size + ", price=" + price + ", sold=" + sold + "]";
	}

	public Artwork(int id, String name, String type, String artist, int year, String size, int price, String sold) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.artist = artist;
		this.year = year;
		this.size = size;
		this.price = price;
		this.sold = sold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artwork() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Artwork o) {
		return this.price-o.price;
	}


	
	
	
}
