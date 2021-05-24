package week2day01;

//�л� ���� ó��, class �̿�
//�� �л��� ������ ���� = �̸�, ��������, ��������, ����, ���, ����
class Student {
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	char grade;
	int count;

	// �Է¹޴� ���
	public void input(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// ���� ���ϴ� ���
	public void calc() {
		total = kor + eng;
		avg = total / 2.0;
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
	}

	// ����ϴ� ���
	public void disp() {
		System.out.println(name + "   " + kor + "   " + eng + "   " + avg + "   " + grade);
	}
}

public class class04 {

	public static void main(String[] args) {

		Student s = new Student(); // ��ü ����, new�� �� ���־����
		// Student : class => �ڷ���
		// s : ��ü , ������ ����

		s.input("ȫ�浿", 95, 90);
		s.calc();
		s.disp();

		// �л� �������� ���� ó��
		Student[] scores = new Student[3];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new Student();
		}

		// ���� �Է�
		scores[0].input("���л�", 80, 80);
		scores[1].input("���л�", 70, 78);
		scores[2].input("���л�", 65, 72);

		// ���� ���, ���
		for (int i = 0; i < scores.length; i++) {
			scores[i].calc();
			scores[i].disp();
		}

	}
}
