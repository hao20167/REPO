package com.hust.kstn.models;

public class Media {
	private static int nbMedias = 0;
	private String id, title, category;
	private float cost;
	
	public Media(String title) {
		this.title = title;
		id = Integer.toString(++nbMedias);
	}
	
	public Media(String title, float cost, String category) {
		this(title);
		this.category = category;
		this.cost = cost;
	}
	
	public Media(String id, String title, float cost) {
		this(title);
		this.id = id;
		this.cost = cost;
	}
	
	public Media(String id, String title, float cost, String category) {
		this(title, cost, category);
		this.id = id;
	}
	
	protected String getId() {
		return id;
	}
	
	protected String getTitle() {
		return title;
	}
	
	protected String getCategory() {
		return category;
	}
	
	protected float getCost() {
		return cost;
	}
	
	protected void setId(String id) {
		this.id = id;
	}
	
	protected void setCategory(String category) {
		this.category = category;
	}
	
	@Override 
	public String toString() { 
		return "Media" + "[" + id + "]" + "[" + title + "]" + "[" + cost + "]" + "[" + category + "]";
	}
}
