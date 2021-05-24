package week2day04;

public class Book {
	String title; 			// 책 제목
	String category;   // 장르
	boolean state;

	public Book( String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public String toString() {
		return title + "     " + category;
	}
	
}
