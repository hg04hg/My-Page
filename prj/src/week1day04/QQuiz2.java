package week1day04;

import java.util.Scanner;

public class QQuiz2 {

	public static void main(String[] args) {
		/*������  90�̻��̸�  A, 80�̻��̸�  B, 70�̻��̸�  C, 60�̻��̸�  D, 
		�� �ܴ� F ���*/
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("���� : A");
		}else if (score >= 80) {
			System.out.println("���� : B");
		}else if (score >= 70) {
			System.out.println("���� : C");
		}else if (score >= 60) {
			System.out.println("���� : D");
		}else {
			System.out.println("���� : F");
		}
		sc.close();
		
		
		
		
		
		
	}
}
