package week2day05.��Ʈ��;

import java.util.Scanner;

public class Ex02��Ʈ�� {

	public static void main(String[] args) {

		/* "STOP"�̶�� ���ڿ��� �Էµ� ������ ���
		�Էµ� ���ڿ� ����ϱ� */
		Scanner sc = new Scanner(System.in);
		String name = "";
		do {

			name = sc.nextLine();
			System.out.println(name);

		} while (!name.equals("STOP"));

		// ����
		/*
		String name = "";
		while(true) {
			name = sc.nextLine();
			System.out.println(name);
			if(name.equals("STOP")) break;
		}*/
		sc.close();
	}
}
