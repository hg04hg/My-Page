package week3day05;

class Score {

	int kor;
	int eng;
	int tot;

	// ������
	public Score() {
	}

	public Score(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}

	// �ż���
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
		s.calc();    // calc(c)    �ż��带 ȣ���� �� ������ �ʰ� ��ü�� �ּҰ� ���޵�
		System.out.println(s.toString());
		
	}
}
