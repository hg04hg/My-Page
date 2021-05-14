package week1day02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String emp; 				   // 사원번호
		int time;  					   // 일한 시간
		int paytime; 				   // 시간 당 임금
		int tax = 0; 				   // 세금
		int totalpay = 0;		   // 총임금
		int provibepay = 0;	   // 지급임금
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
		
		System.out.println("사원번호 : " + emp);
		System.out.println("시간 당 임금 : " + paytime);
		System.out.println("세금 : " + tax);
		System.out.println("총 임금: " + totalpay);
		System.out.println("지급 임금: " + provibepay);
		System.out.println("----------------------------");
		}
		sc.close();
		
	}
}
