package week3day05;

public class Continue {

	public static void main(String[] args) {

		// 1부터 10까지 홀수 출력(continue 사용)
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue; 	// 만약 i를 2로 나눈 나머지가 0 이면 continue 아래
			System.out.println(i); 		   // 반복문을 실행하지 않고 반복문의 처음으로 돌아간다.
		}
	}
}
