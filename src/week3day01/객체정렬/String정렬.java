package week3day01.객체정렬;

import java.util.Arrays;

public class String정렬 {

	public static void main(String[] args) {
		
		String[] str = {"apple", "banana", "tomato", "strawberry", "melon"};
		
		Arrays.sort(str);  // 자바에서 제공하는 Arrays 클래스 이용

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
	}

}
