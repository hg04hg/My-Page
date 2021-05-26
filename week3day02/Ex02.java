package week3day02;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

	public static void main(String[] args) {
		// 제네릭, 제네릭스 <>

		ArrayList<Score> list = new ArrayList<Score>();

		Score s = new Score("김학생", 100, 90);
		list.add(s); 			// 리스트에 담을 때 add();

		Score s2 = new Score("이학생", 70, 85);
		list.add(s2);

		Score s3 = new Score("박학생", 95, 80);
		list.add(s3);

		// 정렬
		Collections.sort(list);

		// 평균 구하고 출력
		for (int i = 0; i < list.size(); i++) {
			list.get(i).calc();
			System.out.println(list.get(i)); // 리스트에서 꺼낼 때 get();
			// System.out.println(list.get(i).toString()); toString 생략
		}

	}
}
