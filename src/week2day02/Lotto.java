package week2day02;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] ball = new int[45];

		// �� �迭�� ��Ҹ� 1 ~ 45�� �ʱ�ȭ ��
		for (int i = 0; i < 45; i++) {
			ball[i] = i + 1;
		}

		Random r = new Random();
		int tmp;
		for (int i = 0; i < 100; i++) {
			int changeIndex = r.nextInt(45); // nextInt(����) = 0 ~ ���� -1 ���� �������� ���� �߻�
			tmp = ball[0];
			ball[0] = ball[changeIndex];
			ball[changeIndex] = tmp;
		}

		System.out.print("�ζ� ��ȣ :  ");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + "    ");
		}
	}
}	
