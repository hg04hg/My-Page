package week2day04;

public class Book {
	String title; 			// å ����
	String category;   // �帣
	boolean state;

	public Book( String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public String toString() {
		return title + "     " + category;
	}
	
}
