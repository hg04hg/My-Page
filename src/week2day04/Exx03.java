package week2day04;

import week2day02.Calculatorclass;

public class Exx03 {

	public static void main(String[] args) {
		Calculatorclass cal = new Calculatorclass();
		int result1 = cal.add(10, 15);
		double result2 = cal.add(2.3, 8.2);
		System.out.println(result1);
		System.out.println(result2);
		
		// System.out.println 기능은 같은 이름으로 여러개가 준비되어 있다 (오버로딩)
		System.out.println("-----------------------------------------");
		System.out.println("오버로딩");
		System.out.println(55);
		System.out.println(134.2);
		System.out.println('A');
		System.out.println("Hello");
	}
}
