package week2day04;

public class ��Test {

	public static void main(String[] args) {

		// VIP�� ȫ�浿 = new VIP��();
		�� ȫ�浿 = new VIP��();
		ȫ�浿.����Ʈ����();

		// ���� ȫ�浿2 = new ����();
		�� ȫ�浿2 = new ����();
		ȫ�浿2.����Ʈ����();

		// ���� �ڵ带 �Ʒ� �迭�� ó���� ( ��Ӱ��迡���� �θ������� �ڽİ�ü�� �迭�� ������ �� ����)
		��[] ���� = new ��[3];

		����[0] = new VIP��();
		����[1] = new ����();
		����[2] = new ��();

		System.out.println("<<=�� �迭 ���=>>");
		for (int i = 0; i < ����.length; i++) {
			����[i].����Ʈ����();
		}

	}

}
