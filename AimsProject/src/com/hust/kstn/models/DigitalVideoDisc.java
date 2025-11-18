package com.hust.kstn.models;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	private int quantity;
	
	// Media(String id, String title, float cost, String category)
	public DigitalVideoDisc(String title) {
		super(title);
		this.quantity = 1;
	}
	
	public DigitalVideoDisc(String title, float cost, String category) {
		super(title, cost, category);
	}
	
	public DigitalVideoDisc(String title, float cost, String category, String director) {
		this(title, cost, category);
		this.director = director;
	}
	
	public DigitalVideoDisc(String id, String title, float cost, String category, String director, int length, int quantity) {
		this(title, cost, category, director);
		super.setId(id);
		this.length = length;
		this.quantity = quantity;
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public int getQuantity() {
		return quantity;
	}
	public void play() {
		// TODO
	}
	public void playDemo() {
		// TODO
	}
	
	@Override
	public String toString() {
		return "DVD-" + super.toString() + "[Director: " + director + "] - [Length: " + length + "] - [Quantity: " + quantity + "]"; 
	}
}
