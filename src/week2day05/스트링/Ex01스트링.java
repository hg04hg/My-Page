package week2day05.��Ʈ��;

public class Ex01��Ʈ�� {

	public static void main(String[] args) {

		String name = "ȫ�浿"; // �ڹٴ� ���ڿ��� ó���ϴ� Ŭ������ �����Ѵ�, String Ŭ����

		System.out.println(name);
		System.out.println(name.toString());

		// ���ڿ� ��������� "hello" ���ڸ� �����ϰ� ���� �ּҸ� ����, ���뵵 ���� �ּҵ� ����
		//String str1 = "hello";
		//String str2 = "hello";
		
		
		//�� �� ��ü�� ����, ������ ������  ���� �ٸ� �ּҸ� ����
		String str3 = new String ("hello");
		String str4 = new String ("hello");
	
		
		// ==�����ڴ� �ּҸ�  ���ϴ� �������̴�,  ���ڿ��� ������ �����Ĵ� equals�� ���
		if(str3.equals(str4)) {
			System.out.println("������ ����");
		}else {
			System.out.println("������ �����ʴ�");
		}
		
		if(str3.equals("�ȳ�")) {
			System.out.println("�� ���ڿ��� ����");
		}else {
			System.out.println("�� ���ڿ��� �����ʴ�");
		}
		
		
		
	}
}
