package week1day05;

public class ExExExEx01 {

	public static void main(String[] args) {
		// �迭 : ������ �ڷ����� ���������� ������ ����ϴ� �� (������ ����)

		int[] arr = new int[5]; // ������ �� 5���� ������ �� �ִ� int�� �迭, [] �ȿ� ������ ����
		// ������ ����
		// �迭�� �� ��Ҹ� �����ؾ� ���� �ְų� ���� �������� ���� ������ ( �����Ұ� �ϴ� ���� )
		// �迭�� ���� (index) 0, 1, 2, 3, 4 (offset)

		arr[0] = 90;
		arr[1] = 95;
		arr[2] = 70;
		arr[3] = 75;
		arr[4] = 60;
		
		int total = 0;
		
		System.out.println("�Ѱ��� �迭 ���");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("-------------------------------------");

		System.out.println("�ݺ������� �迭 ���");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			total += arr[i];
		}
		System.out.println("-------------------------------------");
		System.out.println("�հ�");
		System.out.println(total);
		
		
		
	}
}
