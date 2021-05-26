package week3day03.�ڹ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest03 {

	public static void main(String[] args) {

		// ��Ʈ�� : �����Ͱ� ������ ������ ���

		// System.in : �ַܼκ��� ������ ��� �޸� <= �ܼ�(Ű����)
		// System.out : �ַܼκ��� ������ ��� �޸� => �ܼ�(�����)

		// ��ݽ�Ʈ�� : System.in, System.out, ....
		// ������Ʈ�� : InputStreamReader, BufferedReader, ....

		// �� ���ڴ����� �о��, �ѱ��� ������ ���� => InputStreamReader(������Ʈ��)
		InputStreamReader r = new InputStreamReader(System.in);

		int ch;
		try {
			ch = r.read();
			System.out.println((char) ch);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ���� ���� �ӵ��� �����ų� ������ ���� => BufferedReader(������Ʈ��)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ch2;
		try {
			while ((ch2 = br.read()) != '\n') {
				System.out.print((char) ch2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
