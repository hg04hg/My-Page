package week3day03.자바입출력;

import java.io.IOException;

public class SystemInTest02 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 enter를 누르세요");
		int input;

		try {
			// 한글 : 2byte
			// 문자 : 1byte
			while ((input = System.in.read()) != '\n') { // 개행문자 \n = new line
				System.out.print((char) input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
