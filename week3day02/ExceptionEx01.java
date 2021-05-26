package week3day02;

// Exception 예외처리
//예외가 발생했을 때 대비하는 코드를 작성하는것

// 예외를 처리한다는 것은 예외가 발생했을 때 비정상적인 종료를 하지 않고 

// 예외가 발생했을 때 실행되어야 할 대비코드가 실행되는 것.

// 예외처리하기 : 반드시 => 필수 예외처리
//					  	선택 => 선택 예외처리

// 배열의 범위를 벗어났을 때 발생하는 예외 : ArrayIndexOutOfBoundsException 
//																   (선택 예외처리) :  반드시 try ~ catch()
public class ExceptionEx01 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch (Exception e) 도 가능하다, 가능한 이유 => 모든 예외는 Exception클래스
			// 를 상속 받았기 때문에
			System.out.println("배열의 범위를 벗어남");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" 정상종료 ");

	}
}
