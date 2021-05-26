package week3day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 콘솔에서 학생정보 입력받아서 학생정보 처리하는 프로그램

		final int MAX = 3;
		// 3명, ArrayList

		ArrayList<Score> list = new ArrayList<Score>();

		for (int i = 0; i < MAX; i++) {
			System.out.print("이름 : "); String name = sc.next();
			System.out.print("국어 점수 : ");int kor = sc.nextInt();
			System.out.print("영어 점수 : ");int eng = sc.nextInt();
			System.out.println("--------------------------------------------");
			Score s = new Score(name, kor, eng);
			list.add(s);      // 리스트에 담을 때 add();
		}

		// 정렬
		Collections.sort(list);

		// 평균 구하고 출력
		for (int i = 0; i < list.size(); i++) {
			list.get(i).calc();
			System.out.println(list.get(i)); // 리스트에서 꺼낼 때 get();
			// System.out.println(list.get(i).toString()); toString 생략
		}
		sc.close();
	}

}
