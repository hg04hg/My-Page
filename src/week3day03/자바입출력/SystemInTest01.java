package week3day03.�ڹ������;

import java.io.IOException;

public class SystemInTest01 {

	public static void main(String[] args) {

		System.out.println("�ڹ������ �����");
		System.err.println("���� �߻�");

		try {
			int ch = System.in.read(); // read() => �ַܼ� ���� 1����Ʈ �о��, ui�ڵ尪
			System.out.println("�Է��� ���� : " + (char) ch);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
