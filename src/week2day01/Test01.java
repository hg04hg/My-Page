package week2day01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		int Testresult1 = onetenSumfor();
		int Testresult2 = onetenSumwhile();
		int Testresult3 = oneinputSumfor(20);
		int Testresult4 = arraySum();
		int Testresult5 = onetenEvenNum();
		int Testresult6 = inputTenEvenNum();

		System.out.println("------------------------------------------------------------------------");
		System.out.println("1 ~ 10까지의 합계 : " + Testresult1);
		System.out.println("1 ~ 10까지의 합계 (while 사용) : " + Testresult2);
		System.out.println("1 ~ 입력한 수 까지의 합계 : " + Testresult3);
		System.out.println("배열의 모든요소의 합계 : " + Testresult4);
		System.out.println("1 ~ 10까지 짝수의 합계 : " + Testresult5);
		System.out.println("임의의수 10개 입력될 때 짝수의 총개수 : " + Testresult6);

	}

	// 1 ~ 10까지의 합계 구하는 프로그램
	public static int onetenSumfor() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	// 1 ~ 10까지의 합계 구하는 프로그램(while 사용)
	public static int onetenSumwhile() {
		int sum = 0, i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		return sum;
	}

	// 1 ~ 입력한 수 까지의 합계 구하는 프로그램
	public static int oneinputSumfor(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}

	// 배열의 모든요소의 합과 모든 요소 출력하는 프로그램
	public static int arraySum() {
		int arr[] = new int[5];

		arr[0] = 100;
		arr[1] = 95;
		arr[2] = 90;
		arr[3] = 85;
		arr[4] = 80;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}

	// 1 ~ 10까지의 짝수의 합계를 구하시오
	public static int onetenEvenNum() {

		int evenNum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenNum += i;
			}
		}
		return evenNum;

	}

	// 임의의 수가 10개 입력될 때 짝수의 총개수를 구하시오
	public static int inputTenEvenNum() {
		int count = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			num = sc.nextInt();
			if (num % 2 == 0) {
				count++;
			}
		}
		sc.close();
		return count;
	}
}
