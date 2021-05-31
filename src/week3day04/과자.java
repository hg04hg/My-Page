package week3day04;

import java.util.ArrayList;
import java.util.Collections;

public class 과자 implements Comparable<과자> {
	// 멤버변수(인스턴스 변수), 속성, 값, 필드(filed)
	String 이름;
	String 제조사;
	String 제조일자;
	String 유통기한;
	int 중량;
	int 칼로리;
	
	// 생성자
	public 과자() {
	}

	// 생성자를 하나라도 만들면 기본생성자를 제공하지 않음
	public 과자(String 이름, String 제조사, String 제조일자, String 유통기한, int 중량, int 칼로리) {
		this.이름 = 이름;
		this.제조사 = 제조사;
		this.제조일자 = 제조일자;
		this.유통기한 = 유통기한;
		this.중량 = 중량;
		this.칼로리 = 칼로리;
	}

	@Override
	public String toString() {
		return 이름 + "   " + 제조사 + "   " + 제조일자 + "   " + 유통기한 + "   " + 중량 + "   " + 칼로리;
	}

	@Override
	public int compareTo(과자 o) {
		return this.이름.compareTo(o.이름);
		// return this.중량 - o.중량;
	}

	public static void main(String[] args) {

		ArrayList<과자> list = new ArrayList<>();

		과자 과자객체1 = new 과자("가나초콜릿", "롯데", "2021-01-12", "2021-12-31", 40, 350);
		list.add(과자객체1);
		과자 과자객체2 = new 과자("아몬드빼빼로", "롯데", "2021-01-13", "2021-12-31", 35, 450);
		list.add(과자객체2);
		과자 과자객체3 = new 과자("홈런볼", "롯데", "2021-01-14", "2021-12-31", 45, 400);
		list.add(과자객체3);

		Collections.sort(list);

		System.out.println("<< 과자 정보 출력 >>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
