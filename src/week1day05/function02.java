package week1day05;

import java.util.Scanner;

public class function02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		sc.close();

		int result1 = plus(a, b);
		int result2 = minus(a, b);
		int result3 = mul(a, b);
		int result4 = div(a, b);
		int result5 = rem(a, b);

		System.out.println("�Է��� �� : " + a + "  " + b);
		System.out.println("----------------------------------------------");
		System.out.println("���ϱ� : " + result1);
		System.out.println("���� : " + result2);
		System.out.println("���ϱ�  : " + result3);
		System.out.println("������ (��) : " + result4);
		System.out.println("������ (������) : " + result5);

	}

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	public static int rem(int num1, int num2) {
		return num1 % num2;
	}
}
