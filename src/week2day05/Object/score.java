package week2day05.Object;

public class score {
	private String name;
	private int kor;
	private int eng;
	private int total;
	private double ave;
	private char scoreChar;

	// ������
	public score() {

	}

	public score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	public void calc() {
		total = kor + eng;
		ave = total / 2.0;
		if (ave >= 90) {
			scoreChar = 'A';
		} else if (ave >= 80) {
			scoreChar = 'B';
		} else if (ave >= 70) {
			scoreChar = 'C';
		} else if (ave >= 60) {
			scoreChar = 'D';
		} else {
			scoreChar = 'F';
		}
	}

	// �θ��� �ż��带 ������ �ϴ°� ���ٶ��̵�, �ݵ�� �θ��� �ż���� ����ΰ� ��ġ�ؾ���
	@Override
	public String toString() {
		return name + "    " + kor + "    " + eng + "    " + total + "    " + ave + "    " + scoreChar;
	}

}
