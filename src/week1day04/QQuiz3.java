package week1day04;

public class QQuiz3 {

	public static void main(String[] args) {
		//다중  for문으로 전체 구구단 출력
		
		int i, j;
		
		for (i  = 2; i <= 9; i++) {
			System.out.println( i + "단");
			for (j = 1; j <= 9; j++) {
				System.out.println( i  +  "*"  +  j  +  "="  +  i  *  j );
			}
			System.out.println( "------------------------------------------------" );
		}
	
		
	}
}
