package week3day03;

public class MyCalc {	
	int M_a;  // 필드(멤버변수)
	int M_b;
	
	public MyCalc(int a, int b) {  // 생성자
		M_a = a;
		M_b = b;
	}
	// 인스턴스 매서드
	public int add() {  
		return M_a + M_b;
	}
	// 클래스 매서드
	static int add(int a, int b) {  // 멤버변수 인스턴스  
		return a + b;
	}
	
	public static void main(String[] args) {
		MyCalc m = new MyCalc(5, 3);
		System.out.println(m.add()); // 인스턴스 매서드
		System.out.println(MyCalc.add(5, 3)); // 클래스 매서드

	}

}
