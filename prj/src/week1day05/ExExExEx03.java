package week1day05;

import java.util.Scanner;

public class ExExExEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� ������    =>   String Ŭ����
		
		String  fruit  =  "Apple";
		System.out.println( fruit );
		
		
		System.out.println( fruit.charAt(0) );	           	 // �ε��� ��ġ�� �´� �� ����
		System.out.println( fruit.toUpperCase() );    // �빮�ڷ� ��ȯ
		System.out.println( fruit.substring(1, 3) );	 // ���ڿ� �ڸ��� (�����̽� )
																		
		
		// ���ڿ�  5����  �Է¹ޱ�  =>  ���ڿ� ������  =>  String  �迭
		String[] names  =  new String[5];
		
		names[0] = "ȫ�浿1";
		names[1] = "ȫ�浿2";
		names[2] = "ȫ�浿3";
		names[3] = "ȫ�浿4";
		names[4] = "ȫ�浿5";
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println( names[i] );
		}
		

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();        // next  = �����̽� �������� �Է¹���
													  			// nextLine  = ���� �������� �Է¹���
		}

		
		for (int i = 0; i < names.length; i++) {
			System.out.println( names[i] );
		}
		sc.close();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
