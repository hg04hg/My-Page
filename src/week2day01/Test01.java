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
		System.out.println("1 ~ 10������ �հ� : " + Testresult1);
		System.out.println("1 ~ 10������ �հ� (while ���) : " + Testresult2);
		System.out.println("1 ~ �Է��� �� ������ �հ� : " + Testresult3);
		System.out.println("�迭�� ������� �հ� : " + Testresult4);
		System.out.println("1 ~ 10���� ¦���� �հ� : " + Testresult5);
		System.out.println("�����Ǽ� 10�� �Էµ� �� ¦���� �Ѱ��� : " + Testresult6);

	}

	// 1 ~ 10������ �հ� ���ϴ� ���α׷�
	public static int onetenSumfor() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	// 1 ~ 10������ �հ� ���ϴ� ���α׷�(while ���)
	public static int onetenSumwhile() {
		int sum = 0, i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		return sum;
	}

	// 1 ~ �Է��� �� ������ �հ� ���ϴ� ���α׷�
	public static int oneinputSumfor(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}

	// �迭�� ������� �հ� ��� ��� ����ϴ� ���α׷�
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

	// 1 ~ 10������ ¦���� �հ踦 ���Ͻÿ�
	public static int onetenEvenNum() {

		int evenNum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenNum += i;
			}
		}
		return evenNum;

	}

	// ������ ���� 10�� �Էµ� �� ¦���� �Ѱ����� ���Ͻÿ�
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
