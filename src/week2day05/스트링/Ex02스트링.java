package week2day05.스트링;

import java.util.Scanner;

public class Ex02스트링 {

	public static void main(String[] args) {

		/* "STOP"이라는 문자열이 입력될 때까지 계속
		입력된 문자열 출력하기 */
		Scanner sc = new Scanner(System.in);
		String name = "";
		do {

			name = sc.nextLine();
			System.out.println(name);

		} while (!name.equals("STOP"));

		// 같음
		/*
		String name = "";
		while(true) {
			name = sc.nextLine();
			System.out.println(name);
			if(name.equals("STOP")) break;
		}*/
		sc.close();
	}
}
