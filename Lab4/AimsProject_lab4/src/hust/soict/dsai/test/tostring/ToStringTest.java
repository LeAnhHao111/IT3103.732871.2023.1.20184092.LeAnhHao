// Họ và tên: Lê Anh Hào
// MSSV: 20184092

package AimsProject_lab4.src.hust.soict.dsai.test.tostring;

import AimsProject_lab4.src.hust.soict.dsai.aims.media.Book;
import AimsProject_lab4.src.hust.soict.dsai.aims.media.CompactDisc;
import AimsProject_lab4.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject_lab4.src.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {
    public static void main(String[] args) {
        List<Media> ms = new ArrayList<>();
        ms.add(new CompactDisc(1, "Some CD", "Cartoon", 1f, 2, "Peter"));
        ms.add(new DigitalVideoDisc("Thomas", "Action film", "Some DVD", 9f));
        ms.add(new Book(0, "Some book", "Scientific book", 10f));
        for (Media m : ms) {
            System.out.println(m.toString());
        }
    }
}
