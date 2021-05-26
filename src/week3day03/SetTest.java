package week3day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest { 
// ���� ������� �� , �ߺ��� ������ ��� �ϰ� ���� ���� �� => Set ���

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("one"); // ������ ����(�߰�)
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("4");
		set.add("5");
		set.add("six");
		System.out.println("����� ������ �� : " + set.size()); // ������ �� ���

		Iterator<String> it = set.iterator(); // Iterator(�ݺ���) ����

		while (it.hasNext()) { // �����Ͱ� ������ true, ������ false�� ��ȯ
			System.out.println(it.next()); // next() : ���� ������ ����
		}
		System.out.println("-----------------------------------");
		set.remove("three"); // ������ ����

		System.out.println("����� ������ �� : " + set.size()); // ������ �� ���
		it = set.iterator(); // �ݺ��� �����( ���� �ݺ������� next �ż���� �����͸�
									   // �� �����Ա� ������ ������� �ؾ���

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
