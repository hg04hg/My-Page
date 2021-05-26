package week3day02;

import java.util.Arrays;

// �������̽� 
/*
	interface �������̽���{
			void �ż����();        // �߻�ż��� : �ż����� �����ΰ� ���� �� 
	}
 */

// 1. �л����� ó�� ���α׷� ���� �л�����	

//Ŭ����
// �����ؾ� �� �����͸� �����ϱ� ���� type�� ����ٰ� �����ϸ��
// �����ؾ� �� �����Ϳ� ���õ� ����� �Բ� �����ϴ� �ڷ���
// ������ + ����� �Բ� ĸ���� ��� ������ ( ������, ���������� )

//�л� ����

public class Score implements Comparable<Score> {

	String name;
	int kor;
	int eng;
	int tot;
	double ave;

	// ������
	public Score() {
	} // �⺻������ (�Ű����� ����)

	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// ��� ���ϱ�
	public void calc() {
		tot = kor + eng;
		ave = tot / 2.0;
	}

	// ��� Ŭ������ Object�� ��ӹ޴´�.
	@Override
	public String toString() {
		return name + "   " + kor + "   " + eng + "   " + tot + "   " + ave;
	}

	/*
	 * @Override public int compareTo(Object o) { Score tmp = (Score) o; return
	 * this.tot - tmp.tot; // � ������ �������� ���ظ� �����ָ� �� // ���� : ���� ������� , ��� : ���� ū��� }
	 */
	@Override
	public int compareTo(Score o) {
		return this.tot - o.tot;
	}

	public static void main(String[] args) {

		Score[] scores = new Score[5];

		scores[0] = new Score("���л�", 100, 90);
		scores[1] = new Score("���л�", 99, 85);
		scores[2] = new Score("���л�", 80, 67);
		scores[3] = new Score("���л�", 95, 78);
		scores[4] = new Score();

		// ��� ���ϱ�
		for (int i = 0; i < scores.length; i++) {
			scores[i].calc();
		}

		Arrays.sort(scores);

		// ����ϱ�
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

	}

}
