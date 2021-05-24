package week1day05;

class Singer {
	String name;
	String singTitle;
	int age;
}

public class class01 {

	public static void main(String[] args) {
		// 아이유 가수의 정보

		String name = "아이유";
		String singTitle = "가을아침";
		int age = 29;

		// => 구조가 있는 데이터를 처리할 수 있는 자료형이 필요해짐
		// => class 사용
		System.out.println(name);
		System.out.println(singTitle);
		System.out.println(age);

		Singer s = new Singer(); // 자바에서는 배열부터는 메모리를 사용할때 new 사용
		s.name = "아이유";
		s.singTitle = "가을아침";
		s.age = 29;

		System.out.println(s.name);
		System.out.println(s.singTitle);
		System.out.println(s.age);

	}
}
