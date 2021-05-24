package week3day01.인터페이스;

// 클래스 : 멤버변수, 생성자, 멤버매서드
// 상속 : 다형성예제, 추상클래스
// 인터페이스


public class Program {

	public static void main(String[] args) {

		휴대폰 삼성폰 = new 휴대폰();
		삼성배터리 삼성배터리객체 = new 삼성배터리();
		
		삼성폰.set배터리(삼성배터리객체);
		삼성폰.켜기();
		
	}
}