package week3day05;

class Animal {

	void sleep() {
		System.out.println("������ ���� �ܴ�");
	}
}

class Dog extends Animal {

	void ������Ų��() {
		System.out.println("���� ���� ��Ų��");
	}
	
	void sleep() {
		System.out.println("���� ���� �ܴ�");
	}
}

public class ClassCast {

	public static void main(String[] args) {
		Animal a = new Dog(); // ��ĳ����, cast(�ڷ��� ��ȯ)
		// a.������Ų��(); // �Ұ���, �θ������� ������ �Ǹ� �θ� ������ ������ �� �� �ִ�.
		((Dog) a).������Ų��(); // ���� , Animal a �� Dog a �� �ٿ�ĳ���� �� ��� �Ѵ�
		a.sleep();  // �θ������� ���������� �ڽ�Ŭ������ �������̵��� �켱���� ������ Dog.sleep�� ����ȴ�
		Animal b = new Animal();
		((Dog) b).������Ų��(); //

	}
}
