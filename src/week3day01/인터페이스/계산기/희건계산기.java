package week3day01.인터페이스.계산기;

public class 희건계산기 implements 계산기 {

	@Override
	public int add(int a, int b) {
		System.out.println("희건계산기의 더하기 기능");
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("희건계산기의 빼기 기능");
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		System.out.println("희건계산기의 곱하기 기능");
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		System.out.println("희건계산기의 나누기(몫) 기능");
		return a / b;
	}
	
	@Override
	public int rem(int a, int b) {
		System.out.println("희건계산기의 나누기(나머지) 기능");
		return a % b;
	}
}
