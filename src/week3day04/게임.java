package week3day04;

import java.util.ArrayList;
import java.util.Collections;

public class 게임 implements Comparable<게임> {
	String 이름;
	String 장르;
	String 연령대;
	String 제작사;
	String 출시일;

	public 게임() {
	}

	public 게임(String 이름, String 장르, String 연령대, String 제작사, String 출시일) {
		this.이름 = 이름;
		this.장르 = 장르;
		this.연령대 = 연령대;
		this.제작사 = 제작사;
		this.출시일 = 출시일;
	}

	@Override
	public String toString() {
		return 이름 + "  " + 장르 + "  " + 연령대 + "  " + 제작사 + "  " + 출시일;
	}

	@Override
	public int compareTo(게임 g) {
		return this.출시일.compareTo(g.출시일);
	}

	public static void main(String[] args) {

		ArrayList<게임> list = new ArrayList<>();

		게임 game1 = new 게임("League of Legend", "MOBA 게임", "12세이상 이용가", "라이엇 게임즈", "2011-12-4");
		게임 game2 = new 게임("Left 4 Dead 2", "FPS 게임", "청소년 이용불가", "밸브 코퍼레이션", "2008-11-17");
		게임 game3 = new 게임("Battlegrounds", "서바이벌 슈팅 게임", "15세이상 이용가", "펍지주식회사", "2017-12-21");
		게임 game4 = new 게임("그랜드체이스 for kakao", "RPG 게임", "전체 이용가", "KOG", "2018-01-30");

		list.add(game1);
		list.add(game2);
		list.add(game3);
		list.add(game4);

		Collections.sort(list);

		System.out.println("\t\t\t\t\t<< == 게임 정보 출력 == >>\n");
		System.out.println("\t게임         |" + "\t장르    |" + "\t    연령대       |" + "\t\t제작사\t|" + "\t출시일");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
