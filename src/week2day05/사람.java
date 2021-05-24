package week2day05;

public abstract class 사람 {
	String name;
	int age;
	
	public 사람() {
		
	}
	
	public 사람(String name, int age) {	//부모의 다른 생성자를 호출하려면 super 사용
		this.name = name;
		this.age = age;
	}
	
	public void 잔다() {
		System.out.println("잔다");
	}
	
	public void 먹는다() {
		System.out.println("먹는다");
	}
	
	public abstract void 춤춘다();    //함수의  선언부분만 가지는 매서드를 추상매서드라 한다.
	
}
