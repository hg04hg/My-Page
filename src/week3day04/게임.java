package week3day04;

import java.util.ArrayList;
import java.util.Collections;

public class ���� implements Comparable<����> {
	String �̸�;
	String �帣;
	String ���ɴ�;
	String ���ۻ�;
	String �����;

	public ����() {
	}

	public ����(String �̸�, String �帣, String ���ɴ�, String ���ۻ�, String �����) {
		this.�̸� = �̸�;
		this.�帣 = �帣;
		this.���ɴ� = ���ɴ�;
		this.���ۻ� = ���ۻ�;
		this.����� = �����;
	}

	@Override
	public String toString() {
		return �̸� + "  " + �帣 + "  " + ���ɴ� + "  " + ���ۻ� + "  " + �����;
	}

	@Override
	public int compareTo(���� g) {
		return this.�����.compareTo(g.�����);
	}

	public static void main(String[] args) {

		ArrayList<����> list = new ArrayList<>();

		���� game1 = new ����("League of Legend", "MOBA ����", "12���̻� �̿밡", "���̾� ������", "2011-12-4");
		���� game2 = new ����("Left 4 Dead 2", "FPS ����", "û�ҳ� �̿�Ұ�", "��� ���۷��̼�", "2008-11-17");
		���� game3 = new ����("Battlegrounds", "�����̹� ���� ����", "15���̻� �̿밡", "�����ֽ�ȸ��", "2017-12-21");
		���� game4 = new ����("�׷���ü�̽� for kakao", "RPG ����", "��ü �̿밡", "KOG", "2018-01-30");

		list.add(game1);
		list.add(game2);
		list.add(game3);
		list.add(game4);

		Collections.sort(list);

		System.out.println("\t\t\t\t\t<< == ���� ���� ��� == >>\n");
		System.out.println("\t����         |" + "\t�帣    |" + "\t    ���ɴ�       |" + "\t\t���ۻ�\t|" + "\t�����");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
