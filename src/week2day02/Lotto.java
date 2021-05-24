package week2day02;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] ball = new int[45];

		// 각 배열의 요소를 1 ~ 45로 초기화 함
		for (int i = 0; i < 45; i++) {
			ball[i] = i + 1;
		}

		Random r = new Random();
		int tmp;
		for (int i = 0; i < 100; i++) {
			int changeIndex = r.nextInt(45); // nextInt(숫자) = 0 ~ 숫자 -1 까지 랜덤으로 난수 발생
			tmp = ball[0];
			ball[0] = ball[changeIndex];
			ball[changeIndex] = tmp;
		}

		System.out.print("로또 번호 :  ");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + "    ");
		}
	}
}	
