package week3day02;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

class Calculator {
	// ���� ó���� ������ ���� �ż���
	public int substract(int su1, int su2) throws MyException {
		if (su1 < su2) {
			throw new MyException("���� �� �� �� ���� �� �����ϴ�.");
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
			System.out.println(" ���� ���� �� ū ���� �ǵ��� �ϼ���");
		}
	}

}
