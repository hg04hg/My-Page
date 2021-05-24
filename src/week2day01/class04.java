package week2day01;

//학생 성적 처리, class 이용
//한 학생이 가지는 정보 = 이름, 국어점수, 영어점수, 총점, 평균, 학점
class Student {
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	char grade;
	int count;

	// 입력받는 기능
	public void input(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// 학점 구하는 기능
	public void calc() {
		total = kor + eng;
		avg = total / 2.0;
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
	}

	// 출력하는 기능
	public void disp() {
		System.out.println(name + "   " + kor + "   " + eng + "   " + avg + "   " + grade);
	}
}

public class class04 {

	public static void main(String[] args) {

		Student s = new Student(); // 객체 생성, new를 꼭 써주어야함
		// Student : class => 자료형
		// s : 객체 , 참조형 변수

		s.input("홍길동", 95, 90);
		s.calc();
		s.disp();

		// 학생 여러명의 성적 처리
		Student[] scores = new Student[3];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new Student();
		}

		// 성적 입력
		scores[0].input("김학생", 80, 80);
		scores[1].input("이학생", 70, 78);
		scores[2].input("박학생", 65, 72);

		// 성적 계산, 출력
		for (int i = 0; i < scores.length; i++) {
			scores[i].calc();
			scores[i].disp();
		}

	}
}
