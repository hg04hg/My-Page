package week1day02;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int plus = 0, minus = 0, even = 0, odd = 0;
		int n;
		final int MAX=10; // 100으로 변환
		
		
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
		System.out.println("양수  =" + plus);
		System.out.println("음수  =" + minus);
		System.out.println("양수인 짝수  =" + even);
		System.out.println("양수 인 홀수 =" + odd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
