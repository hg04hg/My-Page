package week3day04;

import java.util.ArrayList;
import java.util.Collections;

public class ���� implements Comparable<����> {
	// �������(�ν��Ͻ� ����), �Ӽ�, ��, �ʵ�(filed)
	String �̸�;
	String ������;
	String ��������;
	String �������;
	int �߷�;
	int Į�θ�;
	
	// ������
	public ����() {
	}

	// �����ڸ� �ϳ��� ����� �⺻�����ڸ� �������� ����
	public ����(String �̸�, String ������, String ��������, String �������, int �߷�, int Į�θ�) {
		this.�̸� = �̸�;
		this.������ = ������;
		this.�������� = ��������;
		this.������� = �������;
		this.�߷� = �߷�;
		this.Į�θ� = Į�θ�;
	}

	@Override
	public String toString() {
		return �̸� + "   " + ������ + "   " + �������� + "   " + ������� + "   " + �߷� + "   " + Į�θ�;
	}

	@Override
	public int compareTo(���� o) {
		return this.�̸�.compareTo(o.�̸�);
		// return this.�߷� - o.�߷�;
	}

	public static void main(String[] args) {

		ArrayList<����> list = new ArrayList<>();

		���� ���ڰ�ü1 = new ����("�������ݸ�", "�Ե�", "2021-01-12", "2021-12-31", 40, 350);
		list.add(���ڰ�ü1);
		���� ���ڰ�ü2 = new ����("�Ƹ�廩����", "�Ե�", "2021-01-13", "2021-12-31", 35, 450);
		list.add(���ڰ�ü2);
		���� ���ڰ�ü3 = new ����("Ȩ����", "�Ե�", "2021-01-14", "2021-12-31", 45, 400);
		list.add(���ڰ�ü3);

		Collections.sort(list);

		System.out.println("<< ���� ���� ��� >>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
