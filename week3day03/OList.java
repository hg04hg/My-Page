package week3day03;

public class OList {
	private Object[] nums;
	private int current;
	private int capacity = 3; // �迭 ũ���� �⺻ ��
	private int increament = 5; // �⺻ ���� �Ѿ��� �� �迭�� ũŰ�� ������ ����

	public OList() {
		nums = new Object[capacity];
		current = 0;
	}

	public int size() {
		return current;
	}

	public void add(Object obj) {
		// �Ѿ ���
		if (capacity <= current) {
			Object[] tmp = new Object[capacity + increament];
			capacity += increament; // 3, 8, 13, 18, 23... �⺻���� ��� ����

			for (int i = 0; i < nums.length; i++) {
				tmp[i] = nums[i];
			}
			nums = tmp;
		}
		nums[current] = obj;
		current++;
	}

	public void clear() {
		current = 0;
	}

	public Object get(int index) {
		return nums[index];
	}

	public static void main(String[] args) {
		// OList : ArrayList ���Ź���, ��������
		OList list = new OList();

		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println("����� ������ �� : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// list.clear();
		// System.out.println("����� ������ �� : " + list.size());

	}

}
