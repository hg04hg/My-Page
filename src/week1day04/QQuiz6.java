package week1day04;

import java.util.Scanner;

public class QQuiz6 {

	public static void main(String[] args) {
		// 급여 계산 /지폐 매수 계산 알고리즘 문제

		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		int[] coins = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int money = sc.nextInt();
		System.out.println("이름 : " + name);
		System.out.println("출장금 : " + money);
		for (int i = 0; i < coins.length; i++) {
			System.out.println(coins[i] + "원 : " + money / coins[i] + " ");
			money %= coins[i];
		}

		sc.close();

	}
}
