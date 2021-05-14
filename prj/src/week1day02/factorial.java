package week1day02;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long  sum = 1;	
		int MAX; //  n! ÀÇ  n°ª 
		
		MAX = sc.nextInt();
		
		for (int i = 1; i <= MAX; i++) {
			sum *= i;
		}
		System.out.println(sum);

	}
}
