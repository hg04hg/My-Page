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
		System.out.println("합계 : " + result);
		System.out.println("평균 : " + result2);
	}

	// 배열의 합
	public static int scoreSum(int[] scores) {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total;
	}

	// 배열의 평균
	public static double scoreAve(int[] scores) {
		double total = 0;
		for (int i = 0; i < scores.length; i++) {
			total =  total + scores[i];
		}
		return total / scores.length;
	}

	// 순서대로 출력
	public static void dispArr(int[] scores) {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("배열의 " + count + "번째  값 : " + scores[i]);
			count++;
		}
	}
}