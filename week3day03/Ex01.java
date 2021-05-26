package week3day03;

class Animal {
	public void bark() {
		System.out.println("동물이 짖는다");
	}
}
// 강아지는 Dog 클래스르 정의
class Dog extends Animal {
	public void bark() {
		System.out.println("멍멍");
	}
}

// 고양이
public class Ex01 {

	public static void main(String[] args) {
		// 강아지 객체 생성
		Dog d = new Dog();
		d.bark();

		// 고양이 익명클래스 사용
		new Animal() {
			public void bark() {
				System.out.println("야옹");
			}
		}.bark();
		/*
		Animal a = new Animal() {
			public void bark() {
				System.out.println("야옹");
			}
		};
		a.bark();
		*/
	}
}
