package week1day05;

/*�Լ�
1. �̸�  (��ɿ� �°�)
2. �Է°�  (�Է��ڷ�)  �� �ִ��� 
3. ��ȯ��  (��ȯ�Ǵ� ��)  �ִ���,  ������  void ,  ������ => ��ȯ�Ǵ� ���� �ڷ����� ��
*/
public class function01 {

	public static void main(String[] args) {
		// �Լ� ȣ��

		printTitle();

		int result1 = getSumTen();
		System.out.println(result1);

		int result2 = getSum(100);
		System.out.println(result2);

	}

	// �Լ� ����
	// �Լ�? : �ڵ� ���� , �ڵ� ����ȭ (�ߺ�����) => ��������

	public static void printTitle() {
		System.out.println("=======����ǥ=========");
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
