package week2day04;

public class 고객 {

	public void 포인트적립() {
		System.out.println("100원을 적립한다.");
	}
}

class 골드고객 extends 고객 {
	@Override
	public void 포인트적립() {
		System.out.println("200원을 적립한다.");
	}
}

class VIP고객 extends 고객 {
	@Override
	public void 포인트적립() {
		System.out.println("300원을 적립한다.");
	}
}