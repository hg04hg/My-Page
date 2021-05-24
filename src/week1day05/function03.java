package week1day05;

import java.util.Scanner;

public class function03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] scores = new int[5];

		for (int i = 0; i < scores.length; i++) {
			int value = sc.nextInt();
			scores[i] = value;
		}
		sc.close();

		int result = scoreSum(scores);
		double result2 = scoreAve(scores);
		dispArr(scores);

		System.out.println("-------------------------------------");
		System.out.println("�հ� : " + result);
		System.out.println("��� : " + result2);
	}

	// �迭�� ��
	public static int scoreSum(int[] scores) {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total;
	}

	// �迭�� ���
	public static double scoreAve(int[] scores) {
		double total = 0;
		for (int i = 0; i < scores.length; i++) {
			total =  total + scores[i];
		}
		return total / scores.length;
	}

	// ������� ���
	public static void dispArr(int[] scores) {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�迭�� " + count + "��°  �� : " + scores[i]);
			count++;
		}
	}
}