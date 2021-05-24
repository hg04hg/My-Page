package week2day05.Object;

public class pointTest {

	public static void main(String[] args) {
		
		point point1 = new point(3,5);
		point point2 = new point(3,5);

		
		if (point1 == point2) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 같지 않다");
		}
		
		if (point1.equals ( point2 )) {
			System.out.println("두 점의 위치가 같다");
		}else {
			System.out.println("두 점의 위치가 같지 않다");
		}
		
		
		
	}

}
