package week3day02;

import java.util.ArrayList;

// Collections	: ArrayList
// 바구니 : 저장하는 바구니
// 배열과 같은 구조를 가짐
// 순서가 있고 , 중복을 허용

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		// 한 학생정보 생성
		Score s = new Score("이학생", 95, 100);
		list.add(s);
		
		Score s2 = new Score("김학생", 100, 85);
		list.add(s2);
		
		Score s3 = new Score("박학생", 50, 80); 
		list.add(s3);
		
		for (int i  =0; i < list.size(); i++) {
			// 꺼내서 사용할 때는 다시 형변환 해서 사용해야 함
			((Score) list.get(i)).calc();
			
		}
		
		for (int  i = 0; i < list.size(); i++) {	
			System.out.println( list.get(i));
			// System.out.println( list.get(i).toString());  toString 생략
		}
		
		
	}

}
