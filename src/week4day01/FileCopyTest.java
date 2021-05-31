package week4day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 복사

public class FileCopyTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("Book.java");
			FileOutputStream fos = new FileOutputStream("Bookcopy.java");

			int input;
			while ((input = fis.read()) != -1){
				fos.write(input);
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
