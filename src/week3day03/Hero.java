package week3day03;

public class Hero {
	String name; 		   // 인스턴스 변수
	int hp;
	static int count; // 클래스에서 공통으로 사용하는 변수

	public Hero(String a, int b) { 	// 생성자
		count++;
		name = a;
		hp = b;
	}

	public void punch() { 	// 매서드
		System.out.println(name + " 펀치 => " + hp);
	}

	public static void main(String[] args) {
		// 여러 히어로 객체를 만들고 객체의 수를 카운트
		Hero h1 = new Hero("아서스", 200);
		Hero h2 = new Hero("레오닉", 180);
		Hero h3 = new Hero("제이나", 170);
		h1.punch();
		h2.punch();
		h3.punch();
		
		// 생성된 객체의 수
		System.out.println(Hero.count);

	}

}
