package week3day03;

public class OList {
	private Object[] nums;
	private int current;
	private int capacity = 3; // 배열 크기의 기본 값
	private int increament = 5; // 기본 값을 넘었을 때 배열에 크키를 더해줄 변수

	public OList() {
		nums = new Object[capacity];
		current = 0;
	}

	public int size() {
		return current;
	}

	public void add(Object obj) {
		// 넘어선 경우
		if (capacity <= current) {
			Object[] tmp = new Object[capacity + increament];
			capacity += increament; // 3, 8, 13, 18, 23... 기본값이 계속 증가

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
		// OList : ArrayList 과거버젼, 낮은버젼
		OList list = new OList();

		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println("저장된 데이터 수 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// list.clear();
		// System.out.println("저장된 데이터 수 : " + list.size());

	}

}
