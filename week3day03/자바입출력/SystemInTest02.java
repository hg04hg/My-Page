package week3day03.�ڹ������;

import java.io.IOException;

public class SystemInTest02 {

	public static void main(String[] args) {
		System.out.println("���ĺ� ���� ���� ���� enter�� ��������");
		int input;

		try {
			// �ѱ� : 2byte
			// ���� : 1byte
			while ((input = System.in.read()) != '\n') { // ���๮�� \n = new line
				System.out.print((char) input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
