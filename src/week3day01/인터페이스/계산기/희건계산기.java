package week3day01.�������̽�.����;

public class ��ǰ��� implements ���� {

	@Override
	public int add(int a, int b) {
		System.out.println("��ǰ����� ���ϱ� ���");
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("��ǰ����� ���� ���");
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		System.out.println("��ǰ����� ���ϱ� ���");
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		System.out.println("��ǰ����� ������(��) ���");
		return a / b;
	}
	
	@Override
	public int rem(int a, int b) {
		System.out.println("��ǰ����� ������(������) ���");
		return a % b;
	}
}
