package week2day01;

//���� �˻�
class Booksearch {
	String bookname; // �����̸�
	String writer; // ����
	String pub; // ���ǻ�
	long ISBN; // ������ȣ

	// �Է¹޴� ���
	public void input(String bookname, String writer, String pub, long ISBN) {
		this.bookname = bookname;
		this.writer = writer;
		this.pub = pub;
		this.ISBN = ISBN;
	}

	// ����ϴ� ���
	public void disp() {
		System.out.println("���� �̸� : " + bookname);
		System.out.println("���� : " + writer);
		System.out.println("���ǻ� : " + pub);
		System.out.println("���� ��ȣ : " + ISBN);
		System.out.println("---------------------------------------------------------");
	}

}

public class class05 {

	public static void main(String[] args) {
		Booksearch b = new Booksearch();
		b.input("���� ���� ����������", "J.M �� �ٽ��ܼ��ν�", "����", 9788972976196L);
		b.disp();

		Booksearch[] books = new Booksearch[3];

		for (int i = 0; i < books.length; i++) {
			books[i] = new Booksearch();
		}

		books[0].input("�޷���Ʈ �� ��ȭ��", "�̹̿�", "���丮����", 9791165341909L);
		books[1].input("�Ķ� å", "���̽� ������", "���е���", 9788954679176L);
		books[2].input("�߸��Ҽ����� ���λ��", "�����ó� ���̰�", "�ҹ̵̹��", 9791166111983L);

		for (int i = 0; i < books.length; i++) {
			books[i].disp();
		}

	}
}
