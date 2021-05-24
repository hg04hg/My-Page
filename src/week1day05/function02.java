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

		System.out.println("입력한 값 : " + a + "  " + b);
		System.out.println("----------------------------------------------");
		System.out.println("더하기 : " + result1);
		System.out.println("빼기 : " + result2);
		System.out.println("곱하기  : " + result3);
		System.out.println("나누기 (몫) : " + result4);
		System.out.println("나누기 (나머지) : " + result5);

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
