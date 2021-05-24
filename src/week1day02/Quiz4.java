package week1day02;

public class Quiz4 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
		
		for (int i = 1; i < 10; i+=2) {
			++n;
			sum += i;
			if (sum > 10) {
				break;
			}
		}
		System.out.println("마지막 항 : " + n);
		System.out.println("1000을 처음으로 초과한 값 : " + sum);
			
	}
}
