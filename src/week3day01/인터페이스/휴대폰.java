package week3day01.인터페이스;

public class 휴대폰 {

	// 배터리
	private 배터리 배터리객체;

	void set배터리 (배터리 배터리객체){
		this.배터리객체 = 배터리객체;
	}
	
	// 기능
	void 켜기() {
		배터리객체.에너지얻어오기();
		System.out.println("휴대폰이 켜집니다");
	}

}
