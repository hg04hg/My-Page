package week3day03;

class Animal {
	public void bark() {
		System.out.println("������ ¢�´�");
	}
}
// �������� Dog Ŭ������ ����
class Dog extends Animal {
	public void bark() {
		System.out.println("�۸�");
	}
}

// �����
public class Ex01 {

	public static void main(String[] args) {
		// ������ ��ü ����
		Dog d = new Dog();
		d.bark();

		// ����� �͸�Ŭ���� ���
		new Animal() {
			public void bark() {
				System.out.println("�߿�");
			}
		}.bark();
		/*
		Animal a = new Animal() {
			public void bark() {
				System.out.println("�߿�");
			}
		};
		a.bark();
		*/
	}
}
