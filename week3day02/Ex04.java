package week3day02;

public class Ex04 {

	public static void main(String[] args) {
		
		String str = "i love java";
		System.out.println(str.substring(7, 11)); // 시작 값 부터 끝 값 - 1 까지 잘라서 출력
		
		Object o = str;  // 가능, 모든 클래스는 Object를 상속받음  (업 캐스팅)
		// 단 부모형 참조변수로 담으면 부모형으로 의미가 축소됨
		
		System.out.println(o);  // i love java (String 클래스 toString을 오버라이딩)
		
		String tmp = (String)o; // (다운 캐스팅)
		System.out.println(tmp.charAt(0) );
		

	}

}
