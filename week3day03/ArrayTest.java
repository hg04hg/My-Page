package week3day03;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 2, 3 }; // int형 자료 5개 배열로 선언

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("----------------------------------");

		// 2차원 배열

		int[][] a = new int[3][]; // 행 , 열 행 => 라인, 열 => 한 행에 들어가는 값의 개수

		a[0] = new int[3];
		a[1] = new int[3];
		a[2] = new int[3];

		// 배열에 값 저장
		int no = 0;
		for (int i = 0; i < a.length; i++) { // 행 접근

			for (int k = 0; k < a[i].length; k++) {
				no++;
				a[i][k] = no;
			}
		}
		// 출력
		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {
				System.out.print(a[i][k] + "  ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");

		int no1 = 0;
		for (int i = 0; i < a.length; i++) { // 행 접근

			for (int k = 0; k < a[i].length; k++) {
				no1 += 3; // 3의 배수 배열
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

		// 3차원 배열
		int[][][] array = new int[4][3][3];  

//	for (int i = 0; i < array.length; i++) {
//		array[i] = new int[3][3];  // 행 : 3 , 열 : 3
//	}
		
		// 배열에 값 저장
		int no2 = 0, count = 1;
		for (int i = 0; i < array.length; i++) {
			no2 = 0;  // 초기화
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					no2 += count; 
					array[i][j][k] = no2;
				}
			}
			count++; // 1 씩 증가
		}
		// 출력
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
		// System.out.println(array[1][0][2]); 면 : 1 번째 , 행 : 0 번째 줄, 열 : 2 번째 값
		// 6

	}
}
