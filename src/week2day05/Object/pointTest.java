package week2day05.Object;

public class pointTest {

	public static void main(String[] args) {
		
		point point1 = new point(3,5);
		point point2 = new point(3,5);

		
		if (point1 == point2) {
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� ���� �ʴ�");
		}
		
		if (point1.equals ( point2 )) {
			System.out.println("�� ���� ��ġ�� ����");
		}else {
			System.out.println("�� ���� ��ġ�� ���� �ʴ�");
		}
		
		
		
	}

}
