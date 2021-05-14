package week1day04;

import java.util.Scanner;

public class QQuiz2 {

	public static void main(String[] args) {
		/*점수가  90이상이면  A, 80이상이면  B, 70이상이면  C, 60이상이면  D, 
		그 외는 F 출력*/
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("점수 : A");
		}else if (score >= 80) {
			System.out.println("점수 : B");
		}else if (score >= 70) {
			System.out.println("점수 : C");
		}else if (score >= 60) {
			System.out.println("점수 : D");
		}else {
			System.out.println("점수 : F");
		}
		sc.close();
		
		
		
		
		
		
	}
}
