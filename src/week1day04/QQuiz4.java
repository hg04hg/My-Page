package week1day04;

public class QQuiz4 {

	public static void main(String[] args) {
		// 	1 ~ 100까지  3의 배수만 출력
	
		int value = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				value = i;
				System.out.println(value);
			}
		}
		
		
	}
}
