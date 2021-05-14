package week1day05;

public class ExExExEx01 {

	public static void main(String[] args) {
		// 배열 : 동일한 자료형을 연속적으로 여러개 사용하는 것 (변수의 집합)

		int[] arr = new int[5]; // 정수형 값 5개를 저장할 수 있는 int형 배열, [] 안에 개수를 지정
		// 참조형 변수
		// 배열의 각 요소를 접근해야 값을 넣거나 갑을 꺼내오는 것이 가능함 ( 기억장소가 하는 역할 )
		// 배열의 순번 (index) 0, 1, 2, 3, 4 (offset)

		arr[0] = 90;
		arr[1] = 95;
		arr[2] = 70;
		arr[3] = 75;
		arr[4] = 60;
		
		int total = 0;
		
		System.out.println("한개씩 배열 출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("-------------------------------------");

		System.out.println("반복문으로 배열 출력");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			total += arr[i];
		}
		System.out.println("-------------------------------------");
		System.out.println("합계");
		System.out.println(total);
		
		
		
	}
}
