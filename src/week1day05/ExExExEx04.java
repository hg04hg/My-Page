package week1day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExExExEx04 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));

		String[] names = new String[5];

		// 파일에서 읽어서 String 배열 내용 채우기
		int i = 0;
		while (sc.hasNext()) {              // 가져올 내용이 있으면 true
			names[i] = sc.nextLine();
			i++;
		}

		// 배열 출력하기
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}
	}
}
