// Họ và tên: Lê Anh Hào
// MSSV: 20184092

// Dinh Viet Ha - 20215042

package AimsProject_lab4.src.hust.soict.dsai.aims.media;

import java.util.Comparator;

import AimsProject_lab4.src.hust.soict.dsai.aims.media.comparator.MediaComparatorByCostTitle;
import AimsProject_lab4.src.hust.soict.dsai.aims.media.comparator.MediaComparatorByTitleCost;

public abstract class Media {
    public static final Comparator<Media> COMPARE_BY_TITLE_COST =  new MediaComparatorByTitleCost();;
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    private int id;
    private String title;
    private String category;
    private float cost;

    public Media() {}

    public Media(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(int id, String title, String category, float cost) {
        this(title, category, cost);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Media)) return false;
        return ((Media) o).getTitle().equals(this.title);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
