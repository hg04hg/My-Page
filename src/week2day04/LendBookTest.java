package week2day04;

public class LendBookTest {

	public static void main(String[] args) {
		
		Book book1 = new Book("����ִ� å 1", "�Ҽ�");
		Book book2 = new Book("��ġ�� ����ִ� å2", "��ȭ");
		Book book3 = new Book("������å3", "����, ����");
		Book book4 = new Book("������ �ø����� ����å4", "��");
		Book book5 = new Book("����ִ� å 5", "����");
		Book book6 = new Book("����ִ� å 6", "����");

		
		Lend lend = new Lend ("2021-5-20", "ȫ�浿");
		lend.lendBook(book1);
		lend.lendBook(book2);
		lend.lendBook(book3);
		lend.lendBook(book4);
		lend.lendBook(book5);
		lend.lendBook(book6);
		
		lend.showLendBook();
		
		Lend lend2 = new Lend("2021-5-20", "����");
		lend2.lendBook(book1);
		lend2.lendBook(book3);
		lend2.lendBook(book6);
		
		lend2.showLendBook();
	}

}
