package week2day01;

import java.util.Scanner;

// ���α׷��Ӱ� �޸𸮸� ����ϴ� ��� : ������ �̿��ؼ� ������ �����

// new�� �ǹ� : new �����ڴ� ����� �޸� ��û��
// �����޸�, �����޸�

// 1. �����޸� : �����Ͻ����� �޸𸮰� �������� ��
// 2. �����޸� : ����ÿ� ����� �޸𸮰� �������� ��

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �����޸�
		int kor1 = 90;
		int kor2 = 80;
		int kor3 = 100;
		int kor4 = 70;
		int kor5 = 60;

		System.out.println(kor1);
		System.out.println(kor2);
		System.out.println(kor3);
		System.out.println(kor4);
		System.out.println(kor5);

		int[] kors = new int[5]; // �迭�� new�� ����ؾ� �޸𸮰����� ��� �� �� ����
		kors[0] = 90;
		kors[1] = 95;
		kors[2] = 100;

		System.out.println("�迭�� ũ�⸦ �Է��ϼ��� : ");
		System.out.print("> ");
		int size = sc.nextInt();

		// �迭���� (�����޸� )
		int[] arr = new int[size];

		// �Է�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
