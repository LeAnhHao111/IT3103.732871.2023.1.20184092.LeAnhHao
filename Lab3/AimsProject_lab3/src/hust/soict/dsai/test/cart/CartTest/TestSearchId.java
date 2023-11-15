package AimsProject_lab3.src.hust.soict.dsai.test.cart.CartTest;

import AimsProject_lab3.src.hust.soict.dsai.aims.cart.Cart.Cart;
import AimsProject_lab3.src.hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class TestSearchId {
	public static void  main(String[] args){
		//Create a new cart
		    	Cart anOrder = new Cart();
		    	// Create new dvd object and add them to the cart
		        DigitalVideoDisc dvd1 = new DigitalVideoDisc
		        		("The Lion King","Animation","Roger Allers",87,01, 19.95f);
		        anOrder.addDigitalVideoDisc(dvd1);

		        DigitalVideoDisc dvd2 = new DigitalVideoDisc
		        		("Star Wars","Science Fiction","George Lucas",87,02,24.95f);
		        anOrder.addDigitalVideoDisc(dvd2);

		        DigitalVideoDisc dvd3 = new DigitalVideoDisc
		        		("Aladin","Animation","George Lucas",87,03,18.99f);
		        
		        anOrder.addDigitalVideoDisc(dvd3);
		        anOrder.SearchId(1);
		        anOrder.SearchId(3);
	}
}