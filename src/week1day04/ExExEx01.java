package week1day04;

import java.util.Scanner;

public class ExExEx01 {

	public static void main(String[] args) {
		/* ���ڸ� �Է¹޾Ƽ� �ش��ϴ� ���� ����ϰ� ���� �Է¹��� 
		���ڰ�  0�̸� ��ü �������� ��� */
		
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		int MAX;
		
		//while (true) {
		MAX = sc.nextInt();
	
		if (MAX == 0) {
			for (i = 2; i <= 9; i++) {
				System.out.println( i + "��");
				for (j = 1; j <= 9; j++) {
					System.out.println( i  + "*" +  j  +  "="  +  i * j );
				}
				System.out.println("---------------------------------------------- ");
			}
		}else {
		for (i = MAX; i <= MAX; i++) {
			System.out.println( MAX + "��");
			for (j = 1; j <= 9; j++) {
				System.out.println( i  + "*" +  j  +  "="  +  i * j );
			}
			System.out.println("---------------------------------------------- ");
		//}
			}
		}
	}
}
