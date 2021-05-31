package week4day01;

public class 안녕쓰레드 extends Thread {

	@Override
	public void run() { 		// 쓰레드에서 실행되어야 할 코드를 작성하는 곳 (약속됨)

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " 안녕");
		}
	}
}
