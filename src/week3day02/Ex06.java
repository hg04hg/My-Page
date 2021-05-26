package week3day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner( new File("list.txt"));
		ArrayList<Score> list = new ArrayList<Score>();
		
		while(sc.hasNext()) {  // 가져올 것이 있으면 true, 그렇지 않으면 false 를 반환
			
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(","); // 구분자 ,
			String name = sc2.next();
			int kor = sc2.nextInt();
			int eng = sc2.nextInt();

			Score s = new Score(name, kor, eng);
			list.add(s);
			sc2.close();
		}
		
		Collections.sort(list);
		
		// 평균 구하고 출력
		for (int i = 0; i < list.size(); i++) {
			list.get(i).calc();
			System.out.println(list.get(i));
		}
	}

}
