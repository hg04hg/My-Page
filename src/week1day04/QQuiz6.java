package week1day04;

import java.util.Scanner;

public class QQuiz6 {

	public static void main(String[] args) {
		// �޿� ��� /���� �ż� ��� �˰��� ����

		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		int[] coins = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int money = sc.nextInt();
		System.out.println("�̸� : " + name);
		System.out.println("����� : " + money);
		for (int i = 0; i < coins.length; i++) {
			System.out.println(coins[i] + "�� : " + money / coins[i] + " ");
			money %= coins[i];
		}

		sc.close();

	}
}
