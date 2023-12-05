// Họ và tên: Lê Anh Hào
// MSSV: 20184092
package AimsProject_lab4.src.hust.soict.dsai.aims.media.comparator;

import java.util.Comparator;

import AimsProject_lab4.src.hust.soict.dsai.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media a, Media b) {
        return Comparator.comparing(Media::getTitle)
                .thenComparingDouble((o) -> - o.getCost())
                .compare(a, b);
    }
}