package week2day05.�ν��Ͻ�����;

public class ���Test {

	public static void main(String[] args) {
		
		��� [] arr = new ���[3];
		
		arr[0] = new ��ȣ��();
		arr[1] = new �ǻ�();
		arr[2] = new ���();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].�ȴ�();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof �ǻ�) {  // 
			�ǻ�  tmp = (�ǻ�)arr[i];	
			tmp.ġ���ϴ�();
			}
		}
	}
}
