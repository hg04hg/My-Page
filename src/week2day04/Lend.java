package week2day04;

import java.util.ArrayList;
import java.util.List;

public class Lend {
	String lend_date;  // �뿩����
	String name; 			// �뿩�� ����
	List<Book> list = new ArrayList<>();  // 
	int cnt = 5;            // �뿩�Ǽ�
	
	public Lend() {
		
	}
	
	public Lend(String lend_date, String name) {
		this.lend_date = lend_date;
		this.name = name;
	}
	
	public void lendBook (Book book) {
		if (book.state == false && list.size() < cnt) {
			book.state = true;
			list.add(book);
			System.out.println("å ����: " + book.title + "  �뿩����: �뿩 �Ǿ����ϴ�.");
		} else {
			System.out.println("å ����: " + book.title + "  �뿩����: �뿩 �� �� �����ϴ�.");
			return;
		}
	}
	
	public void showLendBook() {
		System.out.println();
		System.out.println("=================================================");
		System.out.println("�뿩��: " + name + " �뿩����: " + lend_date);
		System.out.println("=================================================\n");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
