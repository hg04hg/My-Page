package week1day03;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n;
		int sum = 0;
	
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1���� �Էµ� �� ������ �� : "  + sum);
		
		/*1����  10������ ��
		int sum = 0;
		final int MAX = 10; 
		
		for (int i = 1; i <= MAX; i++) {
			sum += i;
		}
		System.out.println("1 ����  10������ �� : " + sum);
		*/
	}
}

