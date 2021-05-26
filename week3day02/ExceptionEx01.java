package week3day02;

// Exception ����ó��
//���ܰ� �߻����� �� ����ϴ� �ڵ带 �ۼ��ϴ°�

// ���ܸ� ó���Ѵٴ� ���� ���ܰ� �߻����� �� ���������� ���Ḧ ���� �ʰ� 

// ���ܰ� �߻����� �� ����Ǿ�� �� ����ڵ尡 ����Ǵ� ��.

// ����ó���ϱ� : �ݵ�� => �ʼ� ����ó��
//					  	���� => ���� ����ó��

// �迭�� ������ ����� �� �߻��ϴ� ���� : ArrayIndexOutOfBoundsException 
//																   (���� ����ó��) :  �ݵ�� try ~ catch()
public class ExceptionEx01 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch (Exception e) �� �����ϴ�, ������ ���� => ��� ���ܴ� ExceptionŬ����
			// �� ��� �޾ұ� ������
			System.out.println("�迭�� ������ ���");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" �������� ");

	}
}
