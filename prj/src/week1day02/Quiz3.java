package week1day02;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int plus = 0, minus = 0, even = 0, odd = 0;
		int n;
		final int MAX=10; // 100���� ��ȯ
		
		
		for (int i = 0; i < MAX; i++) {
			n = sc.nextInt();
			if (n > 0) {
				++plus;
				if (n % 2 == 0) {
					++even;
				} else {
					++odd;
				}
			} else {
				++minus;
			}
		}
		sc.close();
		System.out.println("-------------------------------------");
		System.out.println("���  =" + plus);
		System.out.println("����  =" + minus);
		System.out.println("����� ¦��  =" + even);
		System.out.println("��� �� Ȧ�� =" + odd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
