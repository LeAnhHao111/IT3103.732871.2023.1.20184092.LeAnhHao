package AimsProject_lab3.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
// Họ và tên: Lê Anh Hào
// MSSV: 20184092

public class DigitalVideoDisc {

	private String title;
	private String category;
	private String director;
	private int length;
	private int id;
	
	@Override
	public String toString() {
		return "DigitalVideoDisc [title=" + title + ", category=" + category + ", director=" + director + ", length="
				+ length + ", id=" + id + ", cost=" + cost + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}
	private float cost;
	
	private static int nbDigitalVideoDiscs = 0;
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, int id, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.id = id;
		this.cost = cost;
	}
	
}
