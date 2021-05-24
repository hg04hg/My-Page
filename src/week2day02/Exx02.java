package week2day02;

public class Exx02 {

	public static void main(String[] args) {
		int[] kors = { 30, 75, 80, 95, 50 }; // 배열 선언과 초기화
		int MAX = 0, indexvalue = 0, count = 0;
		int sum = 0;
		double ave = 0;

		// . MAX값 찾기
		// 가장 큰 값을 찾아 출력
		for (int i = 0; i < kors.length; i++) {
			if (kors[i] > MAX) {
				MAX = kors[i];
				indexvalue = i;
			}
		}
		
		// 평균 값보다 큰 값 개수 구하기
		for(int i = 0; i < kors.length; i++) {
			sum += kors[i];
		}
		ave = sum / (double) kors.length;
		for(int i = 0; i < kors.length; i++) {
			if (kors[i] > ave) {
				count++;
			}
		}
		System.out.println("배열의  index 값 : " + indexvalue);
		System.out.println("배열의 가장 큰 값 : " + MAX);
		System.out.println("평균 : " + ave);
		System.out.println("평균값보다 큰 값의 개수 : " + count);

	}
}
