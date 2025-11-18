package com.hust.kstn.models;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered;

	public Cart() {
		qtyOrdered = 0;
	}
	
	public void clearCart() {
		qtyOrdered = 0;
		System.out.println("The cart has been cleaned successfully!");
	}
	
	public void addDVD(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsInCart[qtyOrdered++] = disc;
			System.out.println("The disc [" + disc.getTitle() + "] has been added successfully to the cart!");
		} else {
			System.out.println("The cart is full, cannot add disc [" + disc.getTitle() + "] to the cart!!!");
		}
	}
	
	public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		addDVD(disc1);
		addDVD(disc2);
	}
	
//	public void addDVD(DigitalVideoDisc[] discs) {
//		for (DigitalVideoDisc item: discs) {
//			addDVD(item);
//		}
//	}
	
	public void addDVD(DigitalVideoDisc ...discs) {
		for (DigitalVideoDisc item: discs) {
			addDVD(item);
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty, cannot remove the disc [" + disc.getTitle() + "]!!!");
			return;
		}
		int found = -1;
		for (int i = 0; i < qtyOrdered; i++) {
			if (disc.getId() == itemsInCart[i].getId()) {
				found = i;
			}
		}
		if (found == -1) {
			System.out.println("Can not find the disc [" + disc.getTitle() + "] in the cart, can not remove!!!");
			return;
		}
		for (int i = found + 1; i < qtyOrdered; i++)
			itemsInCart[i - 1] = itemsInCart[i];
		qtyOrdered--;
		System.out.println("The disc [" + disc.getTitle() + "] has been removed successfully from the cart!");
	}
	
	public float calculateTotalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsInCart[i].getCost() * itemsInCart[i].getQuantity();
		}
		return sum;
	}
	
	public void updateQuantity(DigitalVideoDisc disc, int qty) {
		// TODO
	}
	
	public void viewCart() {
		// TODO
	}
	
	public void receiveFreeItem() {
		// TODO
	}
	
	public DigitalVideoDisc[] filterById(String id) {
		// TODO
		return null;
	}
	
	public DigitalVideoDisc[] filterByTitle(String title) {
		// TODO
		return null;
	}
	
	public void sortByTitle() {
		// TODO
	}
	
	public void sortByCost() {
		// TODO
	}

	public void print() {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty!");
			return;
		}
		int totQty = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totQty += itemsInCart[i].getQuantity();
		}
		System.out.println("======================= THE CURRENT CART =======================");
		System.out.println("Total items: [" + totQty + "]");
		float subtotal = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc item = itemsInCart[i];
			System.out.println("- " + item.toString());
			subtotal += item.getCost() * item.getQuantity();
		}
		System.out.println("Subtotal: [" + subtotal + "]$");
		System.out.println("================================================================");
	}
}
