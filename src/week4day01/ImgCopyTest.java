package week4day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// �̹��� ���� 

public class ImgCopyTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ĸó.png");
			FileOutputStream fos = new FileOutputStream("Imgcopy.png");

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
