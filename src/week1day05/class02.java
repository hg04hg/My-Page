package week1day05;

//구조화된 데이터를 저장할 수 있는 자료형, 틀  => 사용자 정의 자료형 class
//접근 제어자 ,  public,  private
class HG {
	// private 접근제어자를 이용해서 변수를 감출 수 있음
	private String name; // 멤버 변수
	private String job;
	private String birth;
	private int num;

	// 함수 (메서드 : 함수가 클래스 내부로 들어가면서 그 클래스를 사용하는 방법이다 라는 의미로 매서드 라고 부름)
	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public String getBirth() {
		return birth;
	}

	public int getNum() {
		return num;
	}

}

public class class02 {

	public static void main(String[] args) {

		HG h = new HG(); // new 연산자 이름

		h.setName("희건"); // .멤버 접근 연산자
		h.setJob("Hanyang Technical High School");
		h.setNum(21211);
		h.setBirth("2004 06 16");

		System.out.println("이름 : " + h.getName());
		System.out.println("학교 : " + h.getJob());
		System.out.println("번호 : " + h.getNum());
		System.out.println("생년월일 : " + h.getBirth());

	}

}
