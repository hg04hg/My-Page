package week2day05.스트링;

public class Ex01스트링 {

	public static void main(String[] args) {

		String name = "홍길동"; // 자바는 문자열을 처리하는 클래스를 지원한다, String 클래스

		System.out.println(name);
		System.out.println(name.toString());

		// 문자열 상수영역에 "hello" 문자를 저장하고 같은 주소를 참조, 내용도 같고 주소도 같다
		//String str1 = "hello";
		//String str2 = "hello";
		
		
		//각 각 객체를 생성, 내용은 같지만  각자 다른 주소를 참조
		String str3 = new String ("hello");
		String str4 = new String ("hello");
	
		
		// ==연산자는 주소를  비교하는 연산자이다,  문자열의 내용이 같으냐는 equals를 사용
		if(str3.equals(str4)) {
			System.out.println("내용이 같다");
		}else {
			System.out.println("내용이 같지않다");
		}
		
		if(str3.equals("안녕")) {
			System.out.println("두 문자열이 같다");
		}else {
			System.out.println("두 문자열이 같지않다");
		}
		
		
		
	}
}
