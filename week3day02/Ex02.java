package week3day02;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

	public static void main(String[] args) {
		// ���׸�, ���׸��� <>

		ArrayList<Score> list = new ArrayList<Score>();

		Score s = new Score("���л�", 100, 90);
		list.add(s); 			// ����Ʈ�� ���� �� add();

		Score s2 = new Score("���л�", 70, 85);
		list.add(s2);

		Score s3 = new Score("���л�", 95, 80);
		list.add(s3);

		// ����
		Collections.sort(list);

		// ��� ���ϰ� ���
		for (int i = 0; i < list.size(); i++) {
			list.get(i).calc();
			System.out.println(list.get(i)); // ����Ʈ���� ���� �� get();
			// System.out.println(list.get(i).toString()); toString ����
		}

	}
}
