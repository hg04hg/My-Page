package week2day02;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		// ���� ����� (�ڹٿ��� �����ϴ� math, random

		// Math
		// Ŭ������ �޼��� ����ϴ� ���, static���� �޼��� ����
		// Ŭ������.�޼����̸� ���
		double mathresult = Math.random();
		System.out.println(mathresult);

		// Random
		// static �ƴ� �޼��� ������ ��ü�� ���� �����ؼ� ����ؾ� �մϴ�.
		Random r = new Random(); // ��ü�����ڵ� new Random();
		int randomresult = r.nextInt();
		System.out.println(randomresult);
		System.out.println("-----------------------------------------------");

		// 1. ���� 5���� ������ �߻��ؼ� ����غ���
		System.out.println("Math ���� �߻�");
		for (int i = 1; i <= 5; i++) {
			double mathresult1 = (Math.random() * 10 + 1);
			System.out.println(mathresult1);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Random ���� �߻�");
		for (int i = 1; i <= 5; i++) {
			int randomresult1 = r.nextInt();
			System.out.println(randomresult1);
		}
		System.out.println("-----------------------------------------------");

		// 2. �� ���� �迭�� ��Ƴ��� ����� ���� �غ���
		double[] matharr = new double[5];
		System.out.println("Math ���� �迭");
		for (int i = 0; i < matharr.length; i++) {
			double mathresult2 = (Math.random() * 10 + 1);
			matharr[i] = mathresult2;
		}
		for (int i = 0; i < matharr.length; i++) {
			System.out.println(i + "��° �迭 ��: " + matharr[i]);
		}
		System.out.println("-----------------------------------------------");
		int[] ranarr = new int[5];
		System.out.println("Random ���� �迭");
		for (int i = 0; i < ranarr.length; i++) {
			int randomresult2 = r.nextInt();
			ranarr[i] = randomresult2;
		}
		for (int i = 0; i < ranarr.length; i++) {
			System.out.println(i + "��° �迭 ��: " + ranarr[i]);
		}

	}

}
