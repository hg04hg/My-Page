package week3day02;

public class Ex04 {

	public static void main(String[] args) {
		
		String str = "i love java";
		System.out.println(str.substring(7, 11)); // ���� �� ���� �� �� - 1 ���� �߶� ���
		
		Object o = str;  // ����, ��� Ŭ������ Object�� ��ӹ���  (�� ĳ����)
		// �� �θ��� ���������� ������ �θ������� �ǹ̰� ��ҵ�
		
		System.out.println(o);  // i love java (String Ŭ���� toString�� �������̵�)
		
		String tmp = (String)o; // (�ٿ� ĳ����)
		System.out.println(tmp.charAt(0) );
		

	}

}
