package week3day03.자바입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest03 {

	public static void main(String[] args) {

		// 스트림 : 데이터가 들어오고 나가는 통로

		// System.in : 콘솔로부터 들어오는 통로 메모리 <= 콘솔(키보드)
		// System.out : 콘솔로부터 나가는 통로 메모리 => 콘솔(모니터)

		// 기반스트림 : System.in, System.out, ....
		// 보조스트림 : InputStreamReader, BufferedReader, ....

		// 한 문자단위로 읽어옴, 한글이 깨지지 않음 => InputStreamReader(보조스트림)
		InputStreamReader r = new InputStreamReader(System.in);

		int ch;
		try {
			ch = r.read();
			System.out.println((char) ch);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 좀더 빠른 속도로 들어오거나 나가게 해줌 => BufferedReader(보조스트림)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ch2;
		try {
			while ((ch2 = br.read()) != '\n') {
				System.out.print((char) ch2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
