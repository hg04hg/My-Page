package week1day02;

public class Quiz1 {

	public static void main(String[] args) {
	// 1
    int sum = 0;
    
    for (int i = 1; i <= 100; i++) {
    	if(i % 2 == 1) {
    		sum += i;
    	}
    }
    System.out.println("Quiz 1 ´ä :" + sum);
    System.out.println("----------------------------------------");
		
	}
}
