package week2day05;

public class Exxx01 {

	public static void main(String[] args) {

		// 추상클래스는 new 불가능 ( 미완성 클래스 )
		// 부모로서만 사용

		extend1 홍길동 = new extend1();

		홍길동.잔다();
		홍길동.먹는다();
		홍길동.춤춘다();

		사람 홍길동1 = new extend1();

		홍길동1.잔다();
		홍길동1.먹는다();
		홍길동1.춤춘다();

	}

}
