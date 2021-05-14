package week1day04;

import java.util.Scanner;

public class QQuiz7 {

	public static void main(String[] args) {
		// 배열에 5개의 입력받는 수를 받고 순서대로, 거꾸로 출력
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			System.out.println("입력받은 숫자 :" + arr[i]);
		}
		System.out.println("-----------------------------------------");
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(i+1  +  "번  : "  +  arr[i]);
		}
		System.out.println();
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(i+1  +  "번  : "  +  arr[i]);
		}
		
		sc.close();
	}
}
