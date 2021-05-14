package week1day04;

public class QQuiz5 {

	public static void main(String[] args) {
		// 1 ~ 100사이의  수 중에서  홀수이면서  5의 배수가 아닌 수만 출력

		int value = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1  &&  i % 5 != 0) {
				value = i;
				System.out.println(value);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
