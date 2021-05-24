package week2day05.인스턴스오브;

public class 사람Test {

	public static void main(String[] args) {
		
		사람 [] arr = new 사람[3];
		
		arr[0] = new 간호사();
		arr[1] = new 의사();
		arr[2] = new 사람();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].걷다();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof 의사) {  // 
			의사  tmp = (의사)arr[i];	
			tmp.치료하다();
			}
		}
	}
}
