package week4day01;

class A implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "�ȳ�");}}}
class B implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "���� �ȳ�");}}}

public class ThreadTest2 {
	public static void main(String[] args) {
		// �����带 ����� �ι��� ���
		// ����Ǿ�� �� �ڵ带 Runnable �������̽��� ������ ��ü�� ������ �����ڿ� ��������
		Thread t = new Thread(new A());
		t.start();
		Thread t2 = new Thread(new B());
		t2.start();

		// �Ʒ��� �͸�Ŭ������ ���
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + "�ȳ�");}}});
		t3.start();

		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + "���� �ȳ�");	}}});
		t4.start();
}}
