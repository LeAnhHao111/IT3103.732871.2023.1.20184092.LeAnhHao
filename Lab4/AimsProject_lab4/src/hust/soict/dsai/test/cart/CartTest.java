// Họ và tên: Lê Anh Hào
// MSSV: 20184092
package AimsProject_lab4.src.hust.soict.dsai.test.cart;

import AimsProject_lab4.src.hust.soict.dsai.aims.cart.Cart.Cart;
import AimsProject_lab4.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject_lab4.src.hust.soict.dsai.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Media dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);

        // Test the search methods
        System.out.println(cart.search(1).toString());
        System.out.println(cart.search("Star wars").toString());
    }
}
