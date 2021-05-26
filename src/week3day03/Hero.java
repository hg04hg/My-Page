package week3day03;

public class Hero {
	String name; 		   // �ν��Ͻ� ����
	int hp;
	static int count; // Ŭ�������� �������� ����ϴ� ����

	public Hero(String a, int b) { 	// ������
		count++;
		name = a;
		hp = b;
	}

	public void punch() { 	// �ż���
		System.out.println(name + " ��ġ => " + hp);
	}

	public static void main(String[] args) {
		// ���� ����� ��ü�� ����� ��ü�� ���� ī��Ʈ
		Hero h1 = new Hero("�Ƽ���", 200);
		Hero h2 = new Hero("������", 180);
		Hero h3 = new Hero("���̳�", 170);
		h1.punch();
		h2.punch();
		h3.punch();
		
		// ������ ��ü�� ��
		System.out.println(Hero.count);

	}

}
