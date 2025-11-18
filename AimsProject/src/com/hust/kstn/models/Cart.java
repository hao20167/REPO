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
			System.out.println("The disc [" + disc.getTitle() + "] has been added successfully!");
		} else {
			System.out.println("The cart is almost full, cannot add disc [" + disc.getTitle() + "]!!!");
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
			System.out.println("The disc [" + disc.getTitle() + "] does not exist!!!");
			return;
		}
		for (int i = found + 1; i < qtyOrdered; i++)
			itemsInCart[i - 1] = itemsInCart[i];
		qtyOrdered--;
		System.out.println("The disc [" + disc.getTitle() + "] has been removed successfuly");
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
		int totQty = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totQty += itemsInCart[i].getQuantity();
		}
		System.out.println("=== Total items in cart: " + totQty + " ===");
		System.out.println("== All items in cart ===");
		for (int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc item = itemsInCart[i];
			int qty = item.getQuantity();
			float cost = item.getCost();
			float total = cost * qty;
			System.out.println("[Title]: " + item.getTitle() + ", [Quantity]: " + qty + ", [Cost]: " + cost + "/DVD, [Total]: " + total);
		}
		System.out.println("==============================");
	}
}
