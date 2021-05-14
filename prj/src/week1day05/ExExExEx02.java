package week1day05;

public class ExExExEx02 {

	public static void main(String[] args) {

		// apple => 문자열(문자집합)

		char[] chs = new char[5]; // 자바에서는 배열부터는 메모리 공간을 사용할 때
													   // new 라는 키워드를 사용
		chs[0] = 'H';
		chs[1] = 'e';
		chs[2] = 'l';
		chs[3] = 'l';
		chs[4] = 'o';

		for (int i = 0; i < chs.length; i++) {
			System.out.print( chs[i] );
		}
		
	}
}
