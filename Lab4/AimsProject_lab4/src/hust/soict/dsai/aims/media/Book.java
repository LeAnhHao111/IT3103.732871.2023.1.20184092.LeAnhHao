// Họ và tên: Lê Anh Hào
// MSSV: 20184092
package AimsProject_lab4.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();

    public Book() {}


    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        for (String author : authors) {
            this.authors.add(author);
        }
    }

    public Book(String title, float cost) {
        super(title, cost);
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already existed");
        } else {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Author does not exist");
        } else {
            authors.remove(authorName);
        }
    }

    @Override
    public String toString() {
        return String.format("Book - %s - %s: $%f", getTitle(), getCategory(), getCost());
    }
}