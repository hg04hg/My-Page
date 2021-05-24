package Test;

import com.heegeon.util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int su1 = 10;
		int su2 = 3;
		System.out.println("ÇÕ : "+ cal.add(su1, su2));
		System.out.println("Â÷ : "+ cal.minus(su1, su2));
		System.out.println("°ö : "+ cal.mul(su1, su2));
		System.out.println("³ª´« ¸ò : "+ cal.div(su1, su2));
		

	}

}
