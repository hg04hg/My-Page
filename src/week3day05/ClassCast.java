package week3day05;

class Animal {

	void sleep() {
		System.out.println("동물이 잠을 잔다");
	}
}

class Dog extends Animal {

	void 집을지킨다() {
		System.out.println("개가 집을 지킨다");
	}
	
	void sleep() {
		System.out.println("개가 잡을 잔다");
	}
}

public class ClassCast {

	public static void main(String[] args) {
		Animal a = new Dog(); // 업캐스팅, cast(자료형 변환)
		// a.집을지킨다(); // 불가능, 부모형으로 참조가 되면 부모가 가지는 정보만 알 수 있다.
		((Dog) a).집을지킨다(); // 가능 , Animal a 를 Dog a 로 다운캐스팅 해 줘야 한다
		a.sleep();  // 부모형으로 생성했지만 자식클래스의 오버라이딩이 우선순위 임으로 Dog.sleep이 실행된다
		Animal b = new Animal();
		((Dog) b).집을지킨다(); //

	}
}
