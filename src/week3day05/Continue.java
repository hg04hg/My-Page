package week3day05;

public class Continue {

	public static void main(String[] args) {

		// 1���� 10���� Ȧ�� ���(continue ���)
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue; 	// ���� i�� 2�� ���� �������� 0 �̸� continue �Ʒ�
			System.out.println(i); 		   // �ݺ����� �������� �ʰ� �ݺ����� ó������ ���ư���.
		}
	}
}
