package week3day02;

import java.util.ArrayList;

// Collections	: ArrayList
// �ٱ��� : �����ϴ� �ٱ���
// �迭�� ���� ������ ����
// ������ �ְ� , �ߺ��� ���

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		// �� �л����� ����
		Score s = new Score("���л�", 95, 100);
		list.add(s);
		
		Score s2 = new Score("���л�", 100, 85);
		list.add(s2);
		
		Score s3 = new Score("���л�", 50, 80); 
		list.add(s3);
		
		for (int i  =0; i < list.size(); i++) {
			// ������ ����� ���� �ٽ� ����ȯ �ؼ� ����ؾ� ��
			((Score) list.get(i)).calc();
			
		}
		
		for (int  i = 0; i < list.size(); i++) {	
			System.out.println( list.get(i));
			// System.out.println( list.get(i).toString());  toString ����
		}
		
		
	}

}
