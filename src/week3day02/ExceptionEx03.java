package week3day02;

public class ExceptionEx03 {

	public static void main(String[] args) {
		
		String  quantity_s= "125";  // ���ڷ� �� ���ڿ� => ��¥ ���ڷ� ��ȯ, 
														// Java�� Integer.parseInt() �ż��� ���
		
		int quantity = Integer.parseInt(quantity_s);
		int amount = 50000 * quantity;
		System.out.println(amount);
		
		// NumberformatException ���� => ����
		
		try {
		String str = "1212SV";     // "1212SV" => ���ڷ�   ���� NumberformatException �߻�
		int strValue = Integer.parseInt(str);
		System.out.println(strValue);
		}catch (Exception e) {
			System.out.println("���ڷε� ���ڿ��� �����մϴ�.");
			//e.printStackTrace();
			//e.toString();
			//e.getMessage();
		}
		System.out.println("��������");

	}

}
