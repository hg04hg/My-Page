package week2day01;

//�����͸� �̿��ϴ� �Լ��� �ϳ��� Ʋ�� ��� ����  => ĸ��ȭ
class Person2 {
	String name; // �������, ���� ����
	int age;

	public void input() { // ����Լ�, ����޼���, ���
		// �Է�
		name = "ȫ�浿";
		age = 21;
	}

	public void disp() {
		// ���
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
