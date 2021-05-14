package week1day04;

import java.util.Scanner;

public class ExExEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0, answer = 0;
		int count = 0;
		
		answer = (int) (Math.random() * 100) +1;         // 1 ~ 100 사이의 난수
		//				Math.floor(Math.random() * 10) +1;       내림
		do {
			System.out.println( "1 과 100 사이의 정수를 입력하세요" );
			System.out.print( "> " );
			
			input = sc.nextInt();
			
			if (input > answer) {
				System.out.println( "더 작은 수로 시도 해보세요" );
				System.out.println();
			}else if (input < answer) {
				System.out.println( "더 큰 수로 시도 해보세요" );
				System.out.println();
			}
			count++;
		}while(input != answer);
		
		System.out.println("시도 횟수 : " + count);
		System.out.println("정답입니다");

		sc.close();
		
	}
}
