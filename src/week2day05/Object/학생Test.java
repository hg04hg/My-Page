package week2day05.Object;

//변수 : 값을 저장하는 공간, 기억장소
//기본변수 : int a = 10;  a = > (데이터값을 저장하는 변수), int형 변수 기본값 : 0
//참조형 변수 : 위치를 기억(저장)하는 변수, 기본값 : null

public class 학생Test {

	public static void main(String[] args) {

		학생 객체1 = new 학생("김학생", 19); // 객체1은 변수 입니다. 참조형 변수

		// 모든 클래스는 보이지않게 (무조건) Object를 클래스에 상속받게 되어있다.
		// 모든 클래스를 하나의 자료형으로 관리할 수 있는 자료형 => Object

		System.out.println(객체1.toString());  // 패키지명클래스이름@고유ID, 생략할 수 있는 매서드
		System.out.println(객체1); 					 // 객체의 정보를 가져올때 toString() 사용함
		System.out.println(객체1.가져오기());

	}

}
