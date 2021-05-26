package week3day03;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		
		// auto boxing
		Integer i1 = new Integer(3); // ������ �̷��� ����ϴ� ���� ������ �ʴ´�, ��� �ǹ̸� ������ ����
		Integer i2 = 3;
		
		//auto unboxing
		int sum1 = i1.intValue() + i2.intValue();
		int sum2 = i1 + i2;
		
		System.out.println("�� : " + sum1 + "   " + "��2  : " + sum2);
		
		Object[] arrs = new Object[4];
		// arrs[0] = new Integer(3); // auto boxing
		arrs[0] = 3;
		arrs[1] = "�ȳ�";
		arrs[2] = 2.5;
		arrs[3] = new Student("���л�", 100, 90);
		
		System.out.println("-------------------------------------------------");
		for(Object obj : arrs) {
			System.out.println(obj);
		}
	}
}
