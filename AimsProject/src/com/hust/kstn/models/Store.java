package com.hust.kstn.models;

public class Store {
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
	private int qty;
	public Store() { 
		qty = 0; 
	}
	
	public void clearStore() {
		qty = 0;
		System.out.println("The store has been cleaned successfully!");
	}
	
	void addDVD(DigitalVideoDisc disc) {
		if (qty == 100) {
			System.out.println("Number of discs in store is now 100/100, cannot add disc [" + disc.getTitle() + "] (temporarily set the maximum number of DVDs in the store to 100)");
			return;
		}
		itemsInStore[qty++] = disc;
		System.out.println("The disc [" + disc.getTitle() + "] has been added successfully to store!");
	}
	
	public void addDVD(DigitalVideoDisc ...discs) {
		for (DigitalVideoDisc item: discs) {
			addDVD(item);
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (qty == 0) {
			System.out.println("Store is empty, cannot remove the disc [" + disc.getTitle() + "] from store!!!");
			return;
		}
		int found = -1;
		for (int i = 0; i < qty; i++) {
			if (disc.getId() == itemsInStore[i].getId()) {
				found = i;
			}
		}
		if (found == -1) {
			System.out.println("Can not find the disc [" + disc.getTitle() + "] in store, can not remove!!!");
			return;
		}
		for (int i = found + 1; i < qty; i++)
			itemsInStore[i - 1] = itemsInStore[i];
		qty--;
		System.out.println("The disc [" + disc.getTitle() + "] has been removed successfully from store!");
	}
	
	public void print() {
		if (qty == 0) {
			System.out.println("The cart is empty!");
			return;
		}
		System.out.println("======================= THE CURRENT STORE =======================");
		System.out.println("Total items: [" + qty + "]");
		float subtotal = 0;
		for (int i = 0; i < qty; i++) {
			DigitalVideoDisc item = itemsInStore[i];
			System.out.println("- " + item.toString());
			subtotal += item.getCost() * item.getQuantity();
		}
		System.out.println("Subtotal: [" + subtotal + "]$");
		System.out.println("================================================================");
	}
}
