package week3day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ֿܼ��� �л����� �Է¹޾Ƽ� �л����� ó���ϴ� ���α׷�

		final int MAX = 3;
		// 3��, ArrayList

		ArrayList<Score> list = new ArrayList<Score>();

		for (int i = 0; i < MAX; i++) {
			System.out.print("�̸� : "); String name = sc.next();
			System.out.print("���� ���� : ");int kor = sc.nextInt();
			System.out.print("���� ���� : ");int eng = sc.nextInt();
			System.out.println("--------------------------------------------");
			Score s = new Score(name, kor, eng);
			list.add(s);      // ����Ʈ�� ���� �� add();
		}

		// ����
		Collections.sort(list);

		// ��� ���ϰ� ���
		for (int i = 0; i < list.size(); i++) {
			list.get(i).calc();
			System.out.println(list.get(i)); // ����Ʈ���� ���� �� get();
			// System.out.println(list.get(i).toString()); toString ����
		}
		sc.close();
	}

}
