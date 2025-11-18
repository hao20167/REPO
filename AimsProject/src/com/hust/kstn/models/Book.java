package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<BookAuthor> authors = new ArrayList<>();
	private int numOfTokens;
	
	public Book(List<BookAuthor> authors, String id, String title, float cost) {
		super(id, title, cost);
		this.authors = authors;
		this.authors = authors;
	}
	
	public Book(List<BookAuthor> authors, String id, String title, float cost, String category) {
		this(authors, id, title, cost);
		super.setCategory(category);
	}
	
	public Book(List<BookAuthor> authors, String id, String title, float cost, String category, int numOfTokens) {
		this(authors, id, title, cost, category);
		this.numOfTokens = numOfTokens;
	}
	
	@Override
	public String toString() {
		return "Book-" + super.toString() +  "[" + numOfTokens + "]" + "\nAuthors: " + authors;
	}
}
