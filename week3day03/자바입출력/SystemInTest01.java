package week3day03.자바입출력;

import java.io.IOException;

public class SystemInTest01 {

	public static void main(String[] args) {

		System.out.println("자바입출력 왕재미");
		System.err.println("에러 발생");

		try {
			int ch = System.in.read(); // read() => 콘솔로 부터 1바이트 읽어옴, ui코드값
			System.out.println("입력한 내용 : " + (char) ch);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
