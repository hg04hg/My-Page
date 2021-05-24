package week1day04;

import java.util.Scanner;

public class ExExEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		do {
			System.out.println("Hello~!");
			input--;
		}while(input != 0);
			
		sc.close();
		
	}
}
