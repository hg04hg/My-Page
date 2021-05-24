package week2day05.Object;

public class 오브젝트배열Test {

	public static void main(String[] args) {
		
		// 모든클래스를 관리할 수 있는 자료형 => Object
		// 무조건 모든클래스는  Object 클래스를 자동으로 상속받음
		Object[] arr = new Object[3];
		
		arr[0] = new 멤버();
		arr[1] = new VIP고객();
		arr[2] = new 주문();
		
		   	
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			// System.out.println(arr[i].toString);   같다 
		}

	}
}
