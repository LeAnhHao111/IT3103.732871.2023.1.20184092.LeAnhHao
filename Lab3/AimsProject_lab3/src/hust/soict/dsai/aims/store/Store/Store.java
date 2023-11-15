package AimsProject_lab3.src.hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;

import AimsProject_lab3.src.hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsinStore = new ArrayList<DigitalVideoDisc>();
	//Ham them Dvd
	public void addDvD(DigitalVideoDisc... dvdList) {
    	for(DigitalVideoDisc dvd : dvdList )
    		itemsinStore.add(dvd);
    }
	//Xoa DVD
	public void removeDVD(DigitalVideoDisc dvd) {
		itemsinStore.remove(dvd);
	}
	//Hien thi thogn tin DVD trong Store
	public void print() {
		for(DigitalVideoDisc dvd : itemsinStore )
			System.out.println(dvd);
	}
	
}
