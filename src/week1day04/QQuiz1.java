package week1day04;

import java.util.Scanner;

public class QQuiz1 {

	public static void main(String[] args) {
		//�Է¹��� ���� 1 or 3 �̸� ����, 2 or 4 �� ���ڷ� ���
		Scanner sc = new Scanner(System.in);
		
		int gender;
		
		gender = sc.nextInt();
		
		switch(gender) {
		case 1:
		case 3:
			System.out.println("����");
			break;
		case 2:
		case 4:
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��� �Է�");
	
		}
		sc.close();

		
		
		
	}
}
