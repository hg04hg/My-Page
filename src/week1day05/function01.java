package week1day05;

/*함수
1. 이름  (기능에 맞게)
2. 입력값  (입력자료)  이 있는지 
3. 반환값  (반환되는 값)  있는지,  없으면  void ,  있으면 => 반환되는 값의 자료형을 줌
*/
public class function01 {

	public static void main(String[] args) {
		// 함수 호출

		printTitle();

		int result1 = getSumTen();
		System.out.println(result1);

		int result2 = getSum(100);
		System.out.println(result2);

	}

	// 함수 정의
	// 함수? : 코드 재사용 , 코드 집중화 (중복제거) => 유지보수

	public static void printTitle() {
		System.out.println("=======성적표=========");
		System.out.println("|                                             |");
		System.out.println("|                                             |");
		System.out.println("====================\n");
	}

	public static int getSumTen() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	public static int getSum(int su) {
		int sum = 0;
		for (int i = 1; i <= su; i++) {
			sum += i;
		}
		return sum;
	}
}
