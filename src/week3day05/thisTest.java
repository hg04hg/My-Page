package week3day05;

class Score {

	int kor;
	int eng;
	int tot;

	// 생성자
	public Score() {
	}

	public Score(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}

	// 매서드
	public void calc() {   // public void calc(Score this) 
		tot = kor + eng;		// this.tot = this.kor + this.eng;
	}

	public String toString() {
		return kor + "    " + eng + "   " + tot;
	}
}

public class thisTest {

	public static void main(String[] args) {

		Score s = new Score(100, 90);
		s.calc();    // calc(c)    매서드를 호출할 때 보이지 않게 객체의 주소가 전달됨
		System.out.println(s.toString());
		
	}
}
