package week3day02;

import java.io.IOException;

public class ExceptionEx02 {

	public static void main(String[] args) {
		
		// 예외처리 : 필수 예외처리는 반드시 예외처리 (예외가 발생했을 때 대비하는 코드를
		//				  													  반드시 작성하는것을 반드시 해야함)
		
		int ch = 0;
		try {
			ch = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}  // a - > 97 저장 
		System.out.println(ch);
		
	}

}
