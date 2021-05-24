package week2day05.Object;

public class scoreTest {

	public static void main(String[] args) {

		score[] arr = new score[6];

		arr[0] = new score("김학생", 99, 100);
		arr[1] = new score("이학생", 70, 80);
		arr[2] = new score("박학생", 100, 60);
		arr[3] = new score("최학생", 50, 20);
		arr[4] = new score("정학생", 80, 55);
		arr[5] = new score();

		for (int i = 0; i < arr.length; i++) {
			arr[i].calc();
			System.out.println(arr[i]);
		}
		
	}
}
