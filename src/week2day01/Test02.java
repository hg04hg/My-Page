package week2day01;

import java.util.Scanner;

// 프로그래머가 메모리를 사용하는 방식 : 변수를 이용해서 공간을 사용함

// new의 의미 : new 연산자는 실행시 메모리 요청함
// 정적메모리, 동적메모리

// 1. 정적메모리 : 컴파일시점에 메모리가 정해지는 것
// 2. 동적메모리 : 실행시에 사용할 메모리가 정해지는 것

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정적메모리
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

		int[] kors = new int[5]; // 배열은 new를 사용해야 메모리공간을 얻어 올 수 있음
		kors[0] = 90;
		kors[1] = 95;
		kors[2] = 100;

		System.out.println("배열의 크기를 입력하세요 : ");
		System.out.print("> ");
		int size = sc.nextInt();

		// 배열선언 (동적메모리 )
		int[] arr = new int[size];

		// 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
