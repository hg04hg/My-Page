package week3day01.객체정렬;

import java.util.Arrays;

public class 성적처리프로그램 {
	public static void main(String[] args) {
		
		Score[] arr = new Score[5];
		
		arr[0] = new Score(1, 100, 90);
		arr[1] = new Score(2, 80, 60);
		arr[2] = new Score(3, 100, 78);
		arr[3] = new Score(4, 56, 80);
		arr[4] = new Score(5, 90, 95);
		
		// 정렬 전
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 정렬
		Arrays.sort(arr);

		// 정렬 후
		System.out.println("<<=정렬 후=>>");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
