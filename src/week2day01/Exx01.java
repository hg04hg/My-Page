package week2day01;

// ������ ����
// class���� ������� , ����޼��� (���) , ������ 
// �����ڰ� �ϴ� ����  :  Ŭ���� ��������� ���� �ʱ�ȭ �ϴ� �۾� ���
// ������� : ��ü�� �����ϴ� new �ڵ忡�� �� �ѹ� �����
// �����ڸ� �δ� ���� : ������ ��ȣ, �����Ͱ��� �Ǽ��� ����Ǵ� ���� ���� �� ����
// �����ڸ� ������ ������ �ϳ� �ڵ����� �������
class Student3 {
	private String name;
	private int age;

	// ���� �����ϴ� ���
	// �����ڸ� ���
	// ��ü�� �����Ҷ� �� �� �� ȣ��Ǵ� ���
	// ������ ��Ģ => 1. class �̸��� ����
	// 						 2.��ȯ�� (void, int ,double) X
	public Student3(String name, int age) { // ����� ���� ������
		this.name = name;
		this.age = age;
	}

	public Student3() { // �⺻������

	}

	// ���� ����ϴ� ���
	public void disp() {
		System.out.println(name + "    " + age);
	}

}

public class Exx01 {

	public static void main(String[] args) {
		Student3 s = new Student3("ȫ�浿", 20);
		Student3 s2 = new Student3();
		s.disp();
		s2.disp();
	}

}
