package week3day03;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		
		// auto boxing
		Integer i1 = new Integer(3); // 이제는 이렇게 사용하는 것을 권하지 않는다, 라는 의미를 가지고 있음
		Integer i2 = 3;
		
		//auto unboxing
		int sum1 = i1.intValue() + i2.intValue();
		int sum2 = i1 + i2;
		
		System.out.println("합 : " + sum1 + "   " + "합2  : " + sum2);
		
		Object[] arrs = new Object[4];
		// arrs[0] = new Integer(3); // auto boxing
		arrs[0] = 3;
		arrs[1] = "안녕";
		arrs[2] = 2.5;
		arrs[3] = new Student("김학생", 100, 90);
		
		System.out.println("-------------------------------------------------");
		for(Object obj : arrs) {
			System.out.println(obj);
		}
	}
}
