package week2day05.인스턴스오브;

public class 사람 {

	public void 걷다() {
		System.out.println("걷다");
	}
	
	public void 먹는다() {
		System.out.println("먹는다");
	}
	
}
class 의사 extends 사람 {
	public void 치료하다() {
		System.out.println("치료하다");
	}
}

class 간호사 extends 사람 {
	public void 돌보다() {
		System.out.println("돌보다");
	}
}