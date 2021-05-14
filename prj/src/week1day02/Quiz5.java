package week1day02;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, ave=0, n=0;
		final int MAX = 10; // 1000
		
		for (int i = 0; i < MAX; i++) {
			n = sc.nextInt();
			sum += n;
		}
		sc.close();
		ave = sum/MAX;
		System.out.println("---------------------------------------");
		System.out.println("Че : " + sum);
		System.out.println("ЦђБе : " + ave);
		
	}
}
