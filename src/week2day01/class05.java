package week2day01;

//도서 검색
class Booksearch {
	String bookname; // 도서이름
	String writer; // 저자
	String pub; // 출판사
	long ISBN; // 도서번호

	// 입력받는 기능
	public void input(String bookname, String writer, String pub, long ISBN) {
		this.bookname = bookname;
		this.writer = writer;
		this.pub = pub;
		this.ISBN = ISBN;
	}

	// 출력하는 기능
	public void disp() {
		System.out.println("도서 이름 : " + bookname);
		System.out.println("저자 : " + writer);
		System.out.println("출판사 : " + pub);
		System.out.println("도서 번호 : " + ISBN);
		System.out.println("---------------------------------------------------------");
	}

}

public class class05 {

	public static void main(String[] args) {
		Booksearch b = new Booksearch();
		b.input("나의 라임 오렌지나무", "J.M 데 바스콘셀로스", "동녘", 9788972976196L);
		b.disp();

		Booksearch[] books = new Booksearch[3];

		for (int i = 0; i < books.length; i++) {
			books[i] = new Booksearch();
		}

		books[0].input("달러구트 꿈 백화점", "이미예", "팩토리나인", 9791165341909L);
		books[1].input("파란 책", "류이스 프라츠", "문학동네", 9788954679176L);
		books[2].input("추리소설가의 살인사건", "히가시노 게이고", "소미미디어", 9791166111983L);

		for (int i = 0; i < books.length; i++) {
			books[i].disp();
		}

	}
}
