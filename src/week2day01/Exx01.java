package week2day01;

// 생성자 연습
// class에는 멤버변수 , 멤버메서드 (기능) , 생성자 
// 생성자가 하는 역할  :  클래스 멤버변수의 값을 초기화 하는 작업 담당
// 실행시점 : 객체를 생성하는 new 코드에서 단 한번 실행됨
// 생성자를 두는 이유 : 데이터 보호, 데이터값이 실수로 변경되는 것을 막을 수 있음
// 생성자를 만들지 않으면 하나 자동으로 만들어줌
class Student3 {
	private String name;
	private int age;

	// 값을 저장하는 기능
	// 생성자를 사용
	// 객체를 생성할때 단 한 번 호출되는 기능
	// 생성자 규칙 => 1. class 이름과 동일
	// 						 2.반환값 (void, int ,double) X
	public Student3(String name, int age) { // 사용자 정의 생성자
		this.name = name;
		this.age = age;
	}

	public Student3() { // 기본생성자

	}

	// 값을 출력하는 기능
	public void disp() {
		System.out.println(name + "    " + age);
	}

}

public class Exx01 {

	public static void main(String[] args) {
		Student3 s = new Student3("홍길동", 20);
		Student3 s2 = new Student3();
		s.disp();
		s2.disp();
	}

}
