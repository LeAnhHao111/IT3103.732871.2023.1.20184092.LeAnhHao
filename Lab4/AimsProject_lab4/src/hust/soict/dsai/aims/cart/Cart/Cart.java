// Họ và tên: Lê Anh Hào
// MSSV: 20184092

package AimsProject_lab4.src.hust.soict.dsai.aims.cart.Cart;

import AimsProject_lab4.src.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {   // Check gio day
            System.out.println("The cart is already full");
        } else {
            itemsOrdered.add(media);
            System.out.println("Item added");
        }
    }

    public void removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) {    // Check ton tai
            System.out.println("No such item found");
        } else {
            itemsOrdered.remove(media);
            System.out.println("Item removed");
        }
    }

    public float totalCost() {
        float sum = 0f;
        // tinh tong
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }
    // tim kiem theo id
    public Media search(int id) {
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {   
                System.out.println("Item found");    
                return item;
            }
        }
        System.out.println("No item found");
        return null;    
    }
    // tim kiem theo ten
    public Media search(String title) {
        for (Media item : itemsOrdered) {   
            if (item.getTitle().equals(title)) {
                System.out.println("Item found");
                return item;    
            }
        }
        System.out.println("No item found");
        return null;   
    }

    public void print() {
        System.out.println("*********************** CART ***********************");
        for (Media item : itemsOrdered) {
            System.out.println(item.toString());
        }
        System.out.println("Total cost: $" + totalCost());   // Show the total cost
        System.out.println("****************************************************");
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}