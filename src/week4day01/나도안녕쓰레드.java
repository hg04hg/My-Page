package week4day01;

public class 나도안녕쓰레드 extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
		System.out.println(i + " 나도 안녕");
		}
	}
}
