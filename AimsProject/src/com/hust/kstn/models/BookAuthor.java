package com.hust.kstn.models;

public class BookAuthor {
	private String fullName;
	private int yearOfBirth;
	private String shortBiography;
	
	public BookAuthor(String fullName) {
		this.fullName = fullName;
	}
	
	public BookAuthor(String fullName, int yearOfBirth) {
		this(fullName);
		this.yearOfBirth = yearOfBirth;
	}
	
	public BookAuthor(String fullName, int yearOfBirth, String shortBiography) {
		this(fullName, yearOfBirth);
		this.shortBiography = shortBiography;
	}
	
	@Override
	public String toString() {
		return this.fullName + " (" + this.yearOfBirth + ", " + this.shortBiography + ")\n";
	}
}
