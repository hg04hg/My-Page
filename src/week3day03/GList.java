package week3day03;

public class GList<T> {
	private Object[] nums;
	private int current;
	private int capacity = 3; // �⺻ ��

	public GList() {
		nums = new Object[capacity];
		current = 0;
	}

	public int size() {
		return current;
	}

	public void add(T obj) {
		nums[current] = obj;
		current++;
	}

	public void clear() {
		current = 0;
	}

	public T get(int index) {
		return (T) nums[index];
	}

	public static void main(String[] args) {
		// GList : ArrayList ���׸�����
		GList<Student> list2 = new GList<>();

		Student s1 = new Student("���л�", 100, 90);
		list2.add(s1);

		Student s2 = new Student("���л�", 90, 80);
		list2.add(s2);

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

	}

}
