package week2day02;

public class Exx02 {

	public static void main(String[] args) {
		int[] kors = { 30, 75, 80, 95, 50 }; // �迭 ����� �ʱ�ȭ
		int MAX = 0, indexvalue = 0, count = 0;
		int sum = 0;
		double ave = 0;

		// . MAX�� ã��
		// ���� ū ���� ã�� ���
		for (int i = 0; i < kors.length; i++) {
			if (kors[i] > MAX) {
				MAX = kors[i];
				indexvalue = i;
			}
		}
		
		// ��� ������ ū �� ���� ���ϱ�
		for(int i = 0; i < kors.length; i++) {
			sum += kors[i];
		}
		ave = sum / (double) kors.length;
		for(int i = 0; i < kors.length; i++) {
			if (kors[i] > ave) {
				count++;
			}
		}
		System.out.println("�迭��  index �� : " + indexvalue);
		System.out.println("�迭�� ���� ū �� : " + MAX);
		System.out.println("��� : " + ave);
		System.out.println("��հ����� ū ���� ���� : " + count);

	}
}
