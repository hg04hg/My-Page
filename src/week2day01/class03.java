package week2day01;

//데이터를 이용하는 함수를 하나의 틀에 묶어서 관리  => 캡슐화
class Person2 {
	String name; // 멤버변수, 값을 저장
	int age;

	public void input() { // 멤버함수, 멤버메서드, 기능
		// 입력
		name = "홍길동";
		age = 21;
	}

	public void disp() {
		// 출력
		System.out.println(name);
		System.out.println(age);
	}

}

public class class03 {

	public static void main(String[] args) {

		Person2 p = new Person2();
		p.input();
		p.disp();

	}

}
