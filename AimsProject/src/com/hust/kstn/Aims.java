package com.hust.kstn;

import com.hust.kstn.models.*;

public class Aims {

	public static void main(String[] args) {
//		System.out.println("THIS IS THE BEGINNING____________________________________");
		Cart cart = new Cart();
		// DigitalVideoDisc(String id, String title, float cost, String category, String director, int length, int quantity)
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("001", "The Lion King", 19.95f, "Animation", "Roger Allers", 87, 1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("002", "Star Wars", 14.36f, "Science Fiction", "Roger Allers", 36, 3);
		
		cart.addDVD(dvd1);
		cart.addDVD(dvd2);
		cart.print();
		System.out.println("[Current Total Cost]: " + cart.calculateTotalCost());
		
		cart.removeDVD(dvd2);
		cart.print();
		System.out.println("[Current Total Cost]: " + cart.calculateTotalCost());
		
		cart.removeDVD(dvd2);

		for (int i = 0; i < 25; i++) {
			String ID = "SAM" + Integer.toString(i);
			DigitalVideoDisc dvd = new DigitalVideoDisc(ID, "SAMPLE " + Integer.toString(i), (float)(1f * (i * 17 % 14 * 15 + 19) / 10), "Comedy", "BCH", i * 9, i % 5 + 1);
			cart.addDVD(dvd);
		}
		
		cart.print();
//		System.out.println("[Current Total Cost]: " + cart.calculateTotalCost());
		
		cart.clearCart();
		cart.print();
		
		cart.removeDVD(dvd1);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("KING KONG", 67f, "Animation", "BUI");
		cart.addDVD(dvd3);
		
		cart.print();
//		System.out.println("[Current Total Cost]: " + cart.calculateTotalCost());
	}
}
