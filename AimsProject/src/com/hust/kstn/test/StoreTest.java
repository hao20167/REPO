package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc tgt = new DigitalVideoDisc("TOREM");
		store.removeDVD(tgt);
		store.print();
		for (int i = 1; i <= 105; i++) {
			DigitalVideoDisc ith = new DigitalVideoDisc("OHMAGAT222" + Integer.toString(i));
			store.addDVD(ith);
//			store.print();
			if (i == 36) {
				store.removeDVD(ith);
//				store.print();
			}
		}
		store.removeDVD(tgt);
		store.print();
		
		store.clearStore();
		DigitalVideoDisc disc1 = new DigitalVideoDisc("DELULU007");
		DigitalVideoDisc disc2 = new DigitalVideoDisc("TRULULU002");
		store.addDVD(disc1, disc2);
		store.print();
		
		DigitalVideoDisc []discs = new DigitalVideoDisc[20];
		for (int i = 0; i < 20; i++) {
			discs[i] = new DigitalVideoDisc("TEMPORA_" + Integer.toString(i + 1));
		}
		store.addDVD(discs);
		store.print();
	}

}
