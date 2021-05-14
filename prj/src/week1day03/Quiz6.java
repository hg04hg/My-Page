package week1day03;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	final int month;
	
	month = sc.nextInt();
	
	//if 문
	/*if (month >= 3 && month < 6) {
		System.out.println("봄");
	}else if (month >= 6 && month < 9) {
		System.out.println("여름");
	}else if (month >= 9 && month < 12) {
		System.out.println("가을");
	}else if (month <= 12 || month < 3) {
		System.out.println("겨울");
	}else {
		System.out.println("잘못된 입력");
	}*/
	
	// switch case 문
	switch(month) {

	case 3: case 4: case 5:
		System.out.println("봄");
		break;
		
	case 6: case 7: case 8:
		System.out.println("여름");
		break;
		
	case 9: case 10: case 11:
		System.out.println("가을");
		break;
		
	case 12: case 1: case 2:
		System.out.println("겨울");
		break;		
	
	default :
		System.out.println("잘못된 입력");
		break;
	}
	}
}
