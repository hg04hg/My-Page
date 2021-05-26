package week3day02;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

class Calculator {
	// 예외 처리를 강제해 놓은 매서드
	public int substract(int su1, int su2) throws MyException {
		if (su1 < su2) {
			throw new MyException("앞의 수 가 더 작을 수 없습니다.");
		}
		return su1 - su2;

	}
}

public class ExceptionEx04 {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		try {
			int result = c.substract(5, 6);
			System.out.println(result);
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println(" 앞의 수가 더 큰 값이 되도록 하세요");
		}
	}

}
