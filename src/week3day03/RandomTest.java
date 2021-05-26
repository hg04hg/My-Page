package week3day03;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i <= 20; i++) {
			System.out.println(r.nextDouble());
		}

		System.out.println("---------------------------------------------");
		for (int i = 0; i <= 20; i++) {
			System.out.println(Math.random());
		}

	}

}
