package week1day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExExExEx04 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));

		String[] names = new String[5];

		// ���Ͽ��� �о String �迭 ���� ä���
		int i = 0;
		while (sc.hasNext()) {              // ������ ������ ������ true
			names[i] = sc.nextLine();
			i++;
		}

		// �迭 ����ϱ�
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}
	}
}
