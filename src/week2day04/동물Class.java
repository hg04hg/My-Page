package week2day04;

class 동물 {
	String 이름;
	int 나이;

	public void 짖는다() {
		System.out.println("동물이 짖는다.");
	}

	public void 잔다() {
		System.out.println("동물이 잔다.");
	}
}

class 강아지 extends 동물 {   // extends : Class 상속
	@Override 	  
	public void 짖는다() {
		System.out.println("멍멍");
	}

	public void 잔다() {
		System.out.println("동물이 잔다.");
	}

	public void 집을지킨다() {
		System.out.println("집을 지킨다.");
	}
}

class 고양이 extends 동물 {
	@Override 			// 부모의 기능을 재정비해서 사용, 오버라이딩
	public void 짖는다() {
		System.out.println("야옹");
	}

	public void 잔다() {
		System.out.println("동물이 잔다.");
	}

	public void 쥐를잡다() {
		System.out.println("쥐를 잡는다.");
	}

}


