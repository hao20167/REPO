package com.hust.kstn;

import com.hust.kstn.models.*;

public class Aims {

	public static void main(String[] args) {
//		System.out.println("THIS IS THE BEGINNING____________________________________");
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("001", "The Lion King", "Animation", "Roger Allers", 87, 19.95f, 1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("002", "Star Wars", "Science Fiction", "Roger Allers", 36, 14.36f, 3);
		
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
			DigitalVideoDisc dvd = new DigitalVideoDisc(ID, "SAMPLE " + Integer.toString(i), "Comedy", "BCH", i * 9, (float)(1f * (i * 17 % 14 * 15 + 19) / 10), i % 5 + 1);
			cart.addDVD(dvd);
		}
		
		cart.print();
		System.out.println("[Current Total Cost]: " + cart.calculateTotalCost());
		
		cart.clearCart();
		
		cart.removeDVD(dvd1);
	}
}
