package week1day04;

import java.util.Scanner;

public class QQuiz7 {

	public static void main(String[] args) {
		// �迭�� 5���� �Է¹޴� ���� �ް� �������, �Ųٷ� ���
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			System.out.println("�Է¹��� ���� :" + arr[i]);
		}
		System.out.println("-----------------------------------------");
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(i+1  +  "��  : "  +  arr[i]);
		}
		System.out.println();
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(i+1  +  "��  : "  +  arr[i]);
		}
		
		sc.close();
	}
}
