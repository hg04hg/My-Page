package week2day02;

import java.util.Scanner;

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

	public Student() {

	}

	// 입력받는 기능
	public Student(String name, int kor, int eng) {
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

public class classStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s = new Student("홍길동", 100, 30);
		s.calc();
		s.disp();

		Student[] arr = new Student[3];

		for (int i = 0; i < arr.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			arr[i] = new Student(name, kor, eng);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i].calc();
		}

		System.out.println("----------------------성적표-----------------------");
		for (int i = 0; i < arr.length; i++) {
			arr[i].disp();
		}
		sc.close();
	}

}
