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
		
		while(sc.hasNext()) {  // ������ ���� ������ true, �׷��� ������ false �� ��ȯ
			
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(","); // ������ ,
			String name = sc2.next();
			int kor = sc2.nextInt();
			int eng = sc2.nextInt();

			Score s = new Score(name, kor, eng);
			list.add(s);
			sc2.close();
		}
		
		Collections.sort(list);
		
		// ��� ���ϰ� ���
		for (int i = 0; i < list.size(); i++) {
			list.get(i).calc();
			System.out.println(list.get(i));
		}
	}

}
