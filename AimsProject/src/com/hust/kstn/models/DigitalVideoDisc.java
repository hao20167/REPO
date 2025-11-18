package com.hust.kstn.models;

public class DigitalVideoDisc {
	private String id, title, category, director;
	private int length;
	private float cost;
	private int quantity;
	
	public DigitalVideoDisc() {}
	public DigitalVideoDisc(String title) {
		this.title = title;
		this.quantity = 1;
	}
	public DigitalVideoDisc(String category, String title, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
		this.quantity = 1;
	}
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		this.quantity = 1;
	}
	public DigitalVideoDisc(String id, String title, String category, String director, int length, float cost, int quantity) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
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
}
