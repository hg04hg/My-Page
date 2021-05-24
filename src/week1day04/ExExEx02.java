package week1day04;

public class ExExEx02 {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 4; i++) { // 열 ,세로
			for (j = 1; j <= 4; j++) { // 행, 가로
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println("-----------------------------------");

		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		for (i = 1; i <= 4; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		for (i = 1; i <= 4; i++) {
			for (j = 4; j > i; j--) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		for (i = 1; i <= 4; i++) {
			for (j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
	}
}
