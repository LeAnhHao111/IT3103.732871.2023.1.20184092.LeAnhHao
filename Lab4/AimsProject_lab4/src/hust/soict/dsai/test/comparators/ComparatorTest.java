// Họ và tên: Lê Anh Hào
// MSSV: 20184092
package AimsProject_lab4.src.hust.soict.dsai.test.comparators;

import AimsProject_lab4.src.hust.soict.dsai.aims.media.Book;
import AimsProject_lab4.src.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Media> m = new ArrayList<>();
        m.add(new Book(0, "B-Book", "Scientific book", 10f));
        m.add(new Book(1, "C-Book", "Nonsense book", 18f));
        m.add(new Book(1, "C-Book", "Nonsense book", 20f));
        m.add(new Book(2, "A-Book", "Comic", 3f));

        System.out.println("Sort by cost then title:");
        Collections.sort(m, Media.COMPARE_BY_COST_TITLE);
        m.forEach(System.out::println);

        System.out.println("\nSort by title then cost:");
        Collections.sort(m, Media.COMPARE_BY_TITLE_COST);
        m.forEach(System.out::println);
    }
}
