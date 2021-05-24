package week2day04;

class 곤충 {
	public void 관찰한다() {
		System.out.println("곤충을 관찰한다.");
	}
}

class 개미 extends 곤충{
	@Override
	public void 관찰한다() {
		System.out.println("개미를 관찰한다.");
	}
}

class 사슴벌레 extends 곤충{
	@Override
	public void 관찰한다() {
		System.out.println("사슴벌레를 관찰한다.");
	}
}

class 잠자리 extends 곤충{
	@Override
	public void 관찰한다() {
		System.out.println("잠자리를 관찰한다.");
	}
}
