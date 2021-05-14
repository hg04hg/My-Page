package week1day04;

import java.util.Scanner;

public class QQuiz1 {

	public static void main(String[] args) {
		//입력받은 수가 1 or 3 이면 남자, 2 or 4 면 여자로 출력
		Scanner sc = new Scanner(System.in);
		
		int gender;
		
		gender = sc.nextInt();
		
		switch(gender) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못된 입력");
	
		}
		sc.close();

		
		
		
	}
}
