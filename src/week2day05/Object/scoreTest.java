package week2day05.Object;

public class scoreTest {

	public static void main(String[] args) {

		score[] arr = new score[6];

		arr[0] = new score("���л�", 99, 100);
		arr[1] = new score("���л�", 70, 80);
		arr[2] = new score("���л�", 100, 60);
		arr[3] = new score("���л�", 50, 20);
		arr[4] = new score("���л�", 80, 55);
		arr[5] = new score();

		for (int i = 0; i < arr.length; i++) {
			arr[i].calc();
			System.out.println(arr[i]);
		}
		
	}
}
