package com.hust.kstn.test;

import java.util.ArrayList;
import java.util.List;

import com.hust.kstn.models.*;

public class BookTest {

	public static void main(String[] args) {
		List<BookAuthor> authors = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			BookAuthor author = new BookAuthor("NGUYEN", 36 * i, "ubl-bot-" + Integer.toString(i * 9));
			authors.add(author);
			System.out.println(author.toString());
		}
		// (String id, String title, float cost, String category)
		Book book1 = new Book(authors, "BOOK36", "Peace and war", 36.36f, "anti-war");
		System.out.println(book1.toString());
		
		BookAuthor hao = new BookAuthor("BUI CONG HAO", 20, "give me da money");
		authors.set(2, hao);
		Book book2 = new Book(authors, "BOOK18", "Dark nhan tam", 18.36f, "self help");
		System.out.println(book2.toString());
	}

}
