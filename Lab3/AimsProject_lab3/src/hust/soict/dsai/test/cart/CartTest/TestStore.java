
//LeAnhHao-20184092
//LeAnhHao-20184092
//LeAnhHao-20184092

package AimsProject_lab3.src.hust.soict.dsai.test.cart.CartTest;

import AimsProject_lab3.src.hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import AimsProject_lab3.src.hust.soict.dsai.aims.store.Store.Store;

public class TestStore {
	 public static void  main(String[] args){
			//Create a new cart
			    	Store store = new Store();
			    	// Create new dvd object and add them to the cart
			        DigitalVideoDisc dvd1 = new DigitalVideoDisc
			        		("The Lion King","Animation","Roger Allers",87,01, 19.95f);			    
			        DigitalVideoDisc dvd2 = new DigitalVideoDisc
			        		("Star Wars","Science Fiction","George Lucas",87,02,24.95f);			        
			        DigitalVideoDisc dvd3 = new DigitalVideoDisc
			        		("Aladin","Animation","George Lucas",87,03,18.99f);
			        			 
			        store.addDvD(dvd1, dvd2, dvd3);
			        System.out.println("ADD DVD");
			        store.print();
			        
			        store.removeDVD(dvd1);
			        System.out.println("Delete DVD");
			        store.print();
	 }
}