package week2day02;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		Calculatorclass cal = new Calculatorclass();
		
		//´õÇÏ±â
		int result1 = cal.add(num1, num2);
		System.out.println("ÇÕ : " + result1);
	
		//»©±â
		int result2 = cal.minus(num1, num2);
		System.out.println("Â÷ : " + result2);
				
		//°öÇÏ±â
		int result3 = cal.mul(num1, num2);
		System.out.println("°ö : " + result3);
				
		//³ª´©±â
		double result4 = cal.div(num1, num2);  			     //	static X
		//double result4 = Calculator.div(num1, num2); // 	static O
		System.out.println("³ª´« ¸ò : " + result4);
				
	}
}
