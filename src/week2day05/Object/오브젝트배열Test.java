package week2day05.Object;

public class ������Ʈ�迭Test {

	public static void main(String[] args) {
		
		// ���Ŭ������ ������ �� �ִ� �ڷ��� => Object
		// ������ ���Ŭ������  Object Ŭ������ �ڵ����� ��ӹ���
		Object[] arr = new Object[3];
		
		arr[0] = new ���();
		arr[1] = new VIP��();
		arr[2] = new �ֹ�();
		
		   	
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			// System.out.println(arr[i].toString);   ���� 
		}

	}
}
