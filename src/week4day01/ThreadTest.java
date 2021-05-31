package week4day01;

public class ThreadTest {

	public static void main(String[] args) {

		안녕쓰레드 th1 = new 안녕쓰레드();
		나도안녕쓰레드 th2 = new 나도안녕쓰레드();

		th1.start(); // 쓰레드 실행 요청하는 매서드 => .start()
		th2.start();
	}

}
