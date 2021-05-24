package week3day01.인터페이스.계산기;

// 계산기클래스를 만들어서 계산기클래스의 기능을 이용하여  아래 문제를 해결하려고 함

public class CalProgram {

	public static void main(String[] args) {
		
		계산기 Cal = new 희건계산기();
		
		int a = 10, b = 3;
		
		// 더하기
		int result1 = Cal.add(a, b);
		System.out.println(result1);
		
		// 빼기
		int result2 = Cal.sub(a, b);
		System.out.println(result2);
			
		// 곱하기
		int result3 = Cal.mul(a, b);
		System.out.println(result3);
		
		// 나누기(몫)
		int result4 = Cal.div(a, b);
		System.out.println(result4);
		
		// 나누기(나머지)
		int result5 = Cal.rem(a, b);
		System.out.println(result5);
		
	}
}
