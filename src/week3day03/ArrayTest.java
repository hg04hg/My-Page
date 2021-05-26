package week3day03;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 2, 3 }; // int�� �ڷ� 5�� �迭�� ����

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("----------------------------------");

		// 2���� �迭

		int[][] a = new int[3][]; // �� , �� �� => ����, �� => �� �࿡ ���� ���� ����

		a[0] = new int[3];
		a[1] = new int[3];
		a[2] = new int[3];

		// �迭�� �� ����
		int no = 0;
		for (int i = 0; i < a.length; i++) { // �� ����

			for (int k = 0; k < a[i].length; k++) {
				no++;
				a[i][k] = no;
			}
		}
		// ���
		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {
				System.out.print(a[i][k] + "  ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");

		int no1 = 0;
		for (int i = 0; i < a.length; i++) { // �� ����

			for (int k = 0; k < a[i].length; k++) {
				no1 += 3; // 3�� ��� �迭
				a[i][k] = no1;
			}
		}
		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {
				System.out.print(a[i][k] + "  ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");

		// 3���� �迭
		int[][][] array = new int[4][3][3];  

//	for (int i = 0; i < array.length; i++) {
//		array[i] = new int[3][3];  // �� : 3 , �� : 3
//	}
		
		// �迭�� �� ����
		int no2 = 0, count = 1;
		for (int i = 0; i < array.length; i++) {
			no2 = 0;  // �ʱ�ȭ
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					no2 += count; 
					array[i][j][k] = no2;
				}
			}
			count++; // 1 �� ����
		}
		// ���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					System.out.print(array[i][j][k] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		// System.out.println(array[1][0][2]); �� : 1 ��° , �� : 0 ��° ��, �� : 2 ��° ��
		// 6

	}
}
