package week3day03;

public class MyCalc {	
	int M_a;  // �ʵ�(�������)
	int M_b;
	
	public MyCalc(int a, int b) {  // ������
		M_a = a;
		M_b = b;
	}
	// �ν��Ͻ� �ż���
	public int add() {  
		return M_a + M_b;
	}
	// Ŭ���� �ż���
	static int add(int a, int b) {  // ������� �ν��Ͻ�  
		return a + b;
	}
	
	public static void main(String[] args) {
		MyCalc m = new MyCalc(5, 3);
		System.out.println(m.add()); // �ν��Ͻ� �ż���
		System.out.println(MyCalc.add(5, 3)); // Ŭ���� �ż���

	}

}
