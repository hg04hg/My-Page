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
	
	@Override  // 부모의 매서드를 재정의
	public boolean equals (Object obj) {
		// 부모로 부를 수 있다.
		// 부모로 부르면 의미가 축소된다 그래서 Object가 가지는 내용만 알 수 있다.
		// 그래서 Point 객체롤 사용하려면 다운캐스팅을 해야한다
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
