package week3day01.��ü����;

public class String����2 {

	public static void main(String[] args) {
		
		String[] str = {"apple", "banana", "tomato", "strawberry", "melon"};
		
		// String ����
		
		for (int i = 0; i < str.length - 1; i++) {
			for(int j = i + 1; j < str.length; j++) {
				if(str[i].compareTo(str[j]) > 0) {
					String tmp;
					tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

}
