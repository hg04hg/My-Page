package Test;

import com.heegeon.util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int su1 = 10;
		int su2 = 3;
		System.out.println("�� : "+ cal.add(su1, su2));
		System.out.println("�� : "+ cal.minus(su1, su2));
		System.out.println("�� : "+ cal.mul(su1, su2));
		System.out.println("���� �� : "+ cal.div(su1, su2));
		

	}

}
