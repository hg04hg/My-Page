package week3day05;

public class Constructor {
	String name;
	int age;
	
	public Constructor() {
		this("홍길동", 9999);    // 생성자 내에서 다른 생성자를 호출할 수 있다. => this()
	}
	public Constructor(String name, int age) {
		this.name = name;
		this.age= age;
	}
	public String toString() {
		return name + "   " + age;
	}
	
	
	
	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		Constructor c2 = new Constructor("엄희건", 10000);
		
		System.out.println(c.toString());
		System.out.println(c2.toString());


	}

}
