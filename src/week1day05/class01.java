package week1day05;

class Singer {
	String name;
	String singTitle;
	int age;
}

public class class01 {

	public static void main(String[] args) {
		// ������ ������ ����

		String name = "������";
		String singTitle = "������ħ";
		int age = 29;

		// => ������ �ִ� �����͸� ó���� �� �ִ� �ڷ����� �ʿ�����
		// => class ���
		System.out.println(name);
		System.out.println(singTitle);
		System.out.println(age);

		Singer s = new Singer(); // �ڹٿ����� �迭���ʹ� �޸𸮸� ����Ҷ� new ���
		s.name = "������";
		s.singTitle = "������ħ";
		s.age = 29;

		System.out.println(s.name);
		System.out.println(s.singTitle);
		System.out.println(s.age);

	}
}
