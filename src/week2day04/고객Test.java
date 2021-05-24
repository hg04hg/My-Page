package week2day04;

public class 고객Test {

	public static void main(String[] args) {

		// VIP고객 홍길동 = new VIP고객();
		고객 홍길동 = new VIP고객();
		홍길동.포인트적립();

		// 골드고객 홍길동2 = new 골드고객();
		고객 홍길동2 = new 골드고객();
		홍길동2.포인트적립();

		// 위에 코드를 아래 배열로 처리함 ( 상속관계에서는 부모형으로 자식객체를 배열로 관리할 수 있음)
		고객[] 고객들 = new 고객[3];

		고객들[0] = new VIP고객();
		고객들[1] = new 골드고객();
		고객들[2] = new 고객();

		System.out.println("<<=고객 배열 출력=>>");
		for (int i = 0; i < 고객들.length; i++) {
			고객들[i].포인트적립();
		}

	}

}
