package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private List<BookAuthor> authors = new ArrayList<>();
	private String id, title, category;
	private float cost;
	private int numOfTokens;
	
	public Book(List<BookAuthor> authors, String id, String title, float cost) {
		this.authors = authors;
		this.id = id;
		this.title = title;
		this.cost = cost;
	}
	
	public Book(List<BookAuthor> authors, String id, String title, String category, float cost) {
		this(authors, id, title, cost);
		this.category = category;
	}
	
	public Book(List<BookAuthor> authors, String id, String title, String category, float cost, int numOfTokens) {
		this(authors, id, title, cost);
		this.category = category;
		this.numOfTokens = numOfTokens;
	}
	
	@Override
	public String toString() {
		return "Book[" + id + "][" + title + "][" + cost + "][" + category + "][" + numOfTokens + "]" + "\nAuthors: " + authors;
	}
}
