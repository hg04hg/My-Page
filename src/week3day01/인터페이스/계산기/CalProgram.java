package week3day01.�������̽�.����;

// ����Ŭ������ ���� ����Ŭ������ ����� �̿��Ͽ�  �Ʒ� ������ �ذ��Ϸ��� ��

public class CalProgram {

	public static void main(String[] args) {
		
		���� Cal = new ��ǰ���();
		
		int a = 10, b = 3;
		
		// ���ϱ�
		int result1 = Cal.add(a, b);
		System.out.println(result1);
		
		// ����
		int result2 = Cal.sub(a, b);
		System.out.println(result2);
			
		// ���ϱ�
		int result3 = Cal.mul(a, b);
		System.out.println(result3);
		
		// ������(��)
		int result4 = Cal.div(a, b);
		System.out.println(result4);
		
		// ������(������)
		int result5 = Cal.rem(a, b);
		System.out.println(result5);
		
	}
}
