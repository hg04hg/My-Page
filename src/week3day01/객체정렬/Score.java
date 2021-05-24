package week3day01.객체정렬;

public class Score implements Comparable<Object>{
	int bunho;
	int kor_subject;
	int eng_subject;
	int total;
	double ave;

	public Score() {

	}

	public Score(int bunho, int kor_subject, int eng_subject) {
		this.bunho = bunho;
		this.kor_subject = kor_subject;
		this.eng_subject = eng_subject;
		this.total = this.kor_subject + this.eng_subject;
		this.ave = total / 2.0;
	}

	public String toString() {
		return bunho + "    " + kor_subject + "    " + eng_subject + "    " + total + "    " + ave;
	}
	
	@Override
	public	 int compareTo(Object o) {
		Score tmp = (Score) o;  // 내가 작으면 음수, 크면 양수
		return this.total - tmp.total;
	}
}
