package week1day02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String emp; 				   // �����ȣ
		int time;  					   // ���� �ð�
		int paytime; 				   // �ð� �� �ӱ�
		int tax = 0; 				   // ����
		int totalpay = 0;		   // ���ӱ�
		int provibepay = 0;	   // �����ӱ�
		final int MAX = 2;
		
	 
		for ( int i = 0 ; i < MAX; i++) {
		
		emp = sc.next();
		time = sc.nextInt();
		paytime= sc.nextInt();
		System.out.println("----------------------------");
		
		
		if(time >  40) {
			totalpay =  (int) ((paytime * 40) + ((time - 40) * (paytime * 1.5)));                                          ; 
		}else {
			totalpay = time * paytime;
		}
		if(totalpay > 400000) {
			tax = 30000;
		}
		provibepay = totalpay - tax;
		
		System.out.println("�����ȣ : " + emp);
		System.out.println("�ð� �� �ӱ� : " + paytime);
		System.out.println("���� : " + tax);
		System.out.println("�� �ӱ�: " + totalpay);
		System.out.println("���� �ӱ�: " + provibepay);
		System.out.println("----------------------------");
		}
		sc.close();
		
	}
}
