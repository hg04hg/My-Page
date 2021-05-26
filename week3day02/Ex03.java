package week3day02;

class Test1 {
	public int add(int su1, int su2) {
		return su1 + su2;
	}
}

// static => 일반 멤버변수를 사용하지 않으면 가능
class Test2 {	
	public static int add(int su1, int su2) {
		return su1 + su2;
	}
}

public class Ex03 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 2;

		// static X => 메모리에 올리는 작업 필요 O
		Test1 t = new Test1();
		int result = t.add(num1, num2);

		// static O => 메모리에 올리는 작업 필요 X
		int result2 = Test2.add(num1, num2);

		System.out.println(result);
		System.out.println(result2);
	}
}
