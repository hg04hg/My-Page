package week3day05;

public class Constructor {
	String name;
	int age;
	
	public Constructor() {
		this("ȫ�浿", 9999);    // ������ ������ �ٸ� �����ڸ� ȣ���� �� �ִ�. => this()
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
		Constructor c2 = new Constructor("�����", 10000);
		
		System.out.println(c.toString());
		System.out.println(c2.toString());


	}

}
