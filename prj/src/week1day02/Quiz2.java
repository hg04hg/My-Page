package week1day02;

public class Quiz2 {

	public static void main(String[] args) {
	   
		// 2
	    int sum = 0;
	    final int MAX = 100;
	    
	    for (int x = 1; x <= MAX; x++) {
	    	for (int y = 1; y <= x; y++) {
	    	sum += y;
	    	}
	    }
	    System.out.println(sum);
			

	}
}
