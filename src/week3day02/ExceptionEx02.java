package week3day02;

import java.io.IOException;

public class ExceptionEx02 {

	public static void main(String[] args) {
		
		// ����ó�� : �ʼ� ����ó���� �ݵ�� ����ó�� (���ܰ� �߻����� �� ����ϴ� �ڵ带
		//				  													  �ݵ�� �ۼ��ϴ°��� �ݵ�� �ؾ���)
		
		int ch = 0;
		try {
			ch = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}  // a - > 97 ���� 
		System.out.println(ch);
		
	}

}
