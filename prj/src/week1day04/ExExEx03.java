package week1day04;

import java.util.Scanner;

public class ExExEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0, answer = 0;
		int count = 0;
		
		answer = (int) (Math.random() * 100) +1;         // 1 ~ 100 ������ ����
		//				Math.floor(Math.random() * 10) +1;       ����
		do {
			System.out.println( "1 �� 100 ������ ������ �Է��ϼ���" );
			System.out.print( "> " );
			
			input = sc.nextInt();
			
			if (input > answer) {
				System.out.println( "�� ���� ���� �õ� �غ�����" );
				System.out.println();
			}else if (input < answer) {
				System.out.println( "�� ū ���� �õ� �غ�����" );
				System.out.println();
			}
			count++;
		}while(input != answer);
		
		System.out.println("�õ� Ƚ�� : " + count);
		System.out.println("�����Դϴ�");

		sc.close();
		
	}
}
