package week1day02;

public class Arrarytest {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		int a=10; // �������� ���� ��ӹ��� �� ����.
		int b=20;
		int c=30;
		int d=40;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int sum = a+b+c+d;
		System.out.println("�հ� = " + sum);
		
		int[] arr2 = new int [5];  // �迭�� ����Ͽ� �������� ���� ��ӹ޴´�.
												
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		// �հ�, �ݺ����� ����
		int sum2=0;
		for( int i = 0; i < arr2.length; i++) {
			sum2 = sum2 + arr2[i];
		}
		System.out.println(sum2);
		//���
		
		int sum3=0;
		for( int i = 0; i < arr.length; i++) {
			sum3 = sum3 + arr[i];
		}
		System.out.println(sum3);
		//���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
