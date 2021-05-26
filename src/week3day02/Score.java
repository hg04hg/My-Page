package week3day02;

import java.util.Arrays;

// 인터페이스 
/*
	interface 인터페이스명{
			void 매서드명();        // 추상매서드 : 매서드의 구현부가 없는 것 
	}
 */

// 1. 학생성적 처리 프로그램 에서 학생정렬	

//클래스
// 관리해야 할 데이터를 저장하기 위한 type을 만든다고 생각하면됨
// 관리해야 할 데이터와 관련된 기능을 함께 관리하는 자료형
// 데이터 + 기능이 함께 캡슐로 묶어서 제공함 ( 생성자, 접근제한자 )

//학생 성적

public class Score implements Comparable<Score> {

	String name;
	int kor;
	int eng;
	int tot;
	double ave;

	// 생성자
	public Score() {
	} // 기본생성자 (매개변수 없음)

	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// 평균 구하기
	public void calc() {
		tot = kor + eng;
		ave = tot / 2.0;
	}

	// 모든 클래스는 Object를 상속받는다.
	@Override
	public String toString() {
		return name + "   " + kor + "   " + eng + "   " + tot + "   " + ave;
	}

	/*
	 * @Override public int compareTo(Object o) { Score tmp = (Score) o; return
	 * this.tot - tmp.tot; // 어떤 값으로 정렬할지 기준만 정해주면 됨 // 음수 : 내가 작은경우 , 양수 : 내가 큰경우 }
	 */
	@Override
	public int compareTo(Score o) {
		return this.tot - o.tot;
	}

	public static void main(String[] args) {

		Score[] scores = new Score[5];

		scores[0] = new Score("김학생", 100, 90);
		scores[1] = new Score("이학생", 99, 85);
		scores[2] = new Score("박학생", 80, 67);
		scores[3] = new Score("최학생", 95, 78);
		scores[4] = new Score();

		// 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			scores[i].calc();
		}

		Arrays.sort(scores);

		// 출력하기
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

	}

}
