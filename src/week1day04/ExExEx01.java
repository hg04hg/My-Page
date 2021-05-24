package week1day04;

import java.util.Scanner;

public class ExExEx01 {

	public static void main(String[] args) {
		/* 숫자를 입력받아서 해당하는 단을 출력하고 만약 입력받은 
		숫자가  0이면 전체 구구단을 출력 */
		
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		int MAX;
		
		//while (true) {
		MAX = sc.nextInt();
	
		if (MAX == 0) {
			for (i = 2; i <= 9; i++) {
				System.out.println( i + "단");
				for (j = 1; j <= 9; j++) {
					System.out.println( i  + "*" +  j  +  "="  +  i * j );
				}
				System.out.println("---------------------------------------------- ");
			}
		}else {
		for (i = MAX; i <= MAX; i++) {
			System.out.println( MAX + "단");
			for (j = 1; j <= 9; j++) {
				System.out.println( i  + "*" +  j  +  "="  +  i * j );
			}
			System.out.println("---------------------------------------------- ");
		//}
			}
		}
	}
}
