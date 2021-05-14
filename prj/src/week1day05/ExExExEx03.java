package week1day05;

import java.util.Scanner;

public class ExExExEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 맛보기    =>   String 클래스
		
		String  fruit  =  "Apple";
		System.out.println( fruit );
		
		
		System.out.println( fruit.charAt(0) );	           	 // 인덱스 위치에 맞는 값 추출
		System.out.println( fruit.toUpperCase() );    // 대문자로 변환
		System.out.println( fruit.substring(1, 3) );	 // 문자열 자르기 (슬라이싱 )
																		
		
		// 문자열  5개를  입력받기  =>  문자열 여러개  =>  String  배열
		String[] names  =  new String[5];
		
		names[0] = "홍길동1";
		names[1] = "홍길동2";
		names[2] = "홍길동3";
		names[3] = "홍길동4";
		names[4] = "홍길동5";
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println( names[i] );
		}
		

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();        // next  = 스페이스 기준으로 입력받음
													  			// nextLine  = 엔터 기준으로 입력받음
		}

		
		for (int i = 0; i < names.length; i++) {
			System.out.println( names[i] );
		}
		sc.close();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
