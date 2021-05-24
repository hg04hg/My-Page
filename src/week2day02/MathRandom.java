package week2day02;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		// 난수 만들기 (자바에서 제공하는 math, random

		// Math
		// 클래스의 메서드 사용하는 방법, static붙은 메서드 사용법
		// 클래스명.메서드이름 사용
		double mathresult = Math.random();
		System.out.println(mathresult);

		// Random
		// static 아닌 메서드 사용법은 객체를 먼저 생성해서 사용해야 합니다.
		Random r = new Random(); // 객체생성코드 new Random();
		int randomresult = r.nextInt();
		System.out.println(randomresult);
		System.out.println("-----------------------------------------------");

		// 1. 각각 5번씩 난수를 발생해서 출력해보기
		System.out.println("Math 난수 발생");
		for (int i = 1; i <= 5; i++) {
			double mathresult1 = (Math.random() * 10 + 1);
			System.out.println(mathresult1);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Random 난수 발생");
		for (int i = 1; i <= 5; i++) {
			int randomresult1 = r.nextInt();
			System.out.println(randomresult1);
		}
		System.out.println("-----------------------------------------------");

		// 2. 각 각을 배열에 담아놓고 출력을 따로 해보기
		double[] matharr = new double[5];
		System.out.println("Math 난수 배열");
		for (int i = 0; i < matharr.length; i++) {
			double mathresult2 = (Math.random() * 10 + 1);
			matharr[i] = mathresult2;
		}
		for (int i = 0; i < matharr.length; i++) {
			System.out.println(i + "번째 배열 값: " + matharr[i]);
		}
		System.out.println("-----------------------------------------------");
		int[] ranarr = new int[5];
		System.out.println("Random 난수 배열");
		for (int i = 0; i < ranarr.length; i++) {
			int randomresult2 = r.nextInt();
			ranarr[i] = randomresult2;
		}
		for (int i = 0; i < ranarr.length; i++) {
			System.out.println(i + "번째 배열 값: " + ranarr[i]);
		}

	}

}
