package week2day05.Object;

public class point {
	int x;
	int y;
	
	public point() {
		
	}

	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return x + "      " + y;
	}
	
	@Override  // �θ��� �ż��带 ������
	public boolean equals (Object obj) {
		// �θ�� �θ� �� �ִ�.
		// �θ�� �θ��� �ǹ̰� ��ҵȴ� �׷��� Object�� ������ ���븸 �� �� �ִ�.
		// �׷��� Point ��ü�� ����Ϸ��� �ٿ�ĳ������ �ؾ��Ѵ�
		if (obj instanceof point) {
		point tmp = (point)obj;
		
		if (this.x == tmp.x && this.y == tmp.y) {
			return true;
		}else {
			return false;
			}
		}
		return false;
	}
}
