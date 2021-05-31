package week4day01;

class A implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "안녕");}}}
class B implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "나도 안녕");}}}

public class ThreadTest2 {
	public static void main(String[] args) {
		// 쓰레드를 만드는 두번쨰 방법
		// 실행되어야 할 코드를 Runnable 인터페이스를 구현한 객체를 쓰레드 생성자에 전달해줌
		Thread t = new Thread(new A());
		t.start();
		Thread t2 = new Thread(new B());
		t2.start();

		// 아래의 익명클래스를 사용
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + "안녕");}}});
		t3.start();

		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + "나도 안녕");	}}});
		t4.start();
}}
