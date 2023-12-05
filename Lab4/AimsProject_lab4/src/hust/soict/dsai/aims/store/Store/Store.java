// Họ và tên: Lê Anh Hào
// MSSV: 20184092

package AimsProject_lab4.src.hust.soict.dsai.aims.store.Store;

import AimsProject_lab4.src.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static final int MAX_ITEMS = 100;
    private List<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsInStore.size() == MAX_ITEMS) {
            System.out.println("Full");      
        } else {
            itemsInStore.add(media);
            System.out.println("Added successfully");
        }
    }

    public void removeMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            System.out.println("Not found");
        } else {
            itemsInStore.remove(media);
            System.out.println("Removed successfully");
        }
    }

    public void removeMedia(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                itemsInStore.remove(item);
                System.out.println("Removed");
             }
        }
        System.out.println("Not found");
    }

    public void show() {
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }

    public Media search(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                System.out.println("Item found:");
                System.out.println(item.toString());
                return item;
            }
        }
        System.out.println("No such item");
        return null;
    }
}