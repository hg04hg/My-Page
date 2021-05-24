package week2day05.Object;

public class 학생 {
	private String name;
	private int age;

	public 학생() {

	}

	public 학생(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String 가져오기() {
		return name + "    " + age;
	}

	@Override
	public String toString() {
		return name + "    " + age;
	}
}
