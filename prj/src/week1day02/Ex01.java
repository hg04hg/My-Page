package week1day02;

import java.util.Scanner;

//���� int �迭 5�� ����� , ������ ������ �ʱ�ȭ
// �հ�, ���  (�迭 ��Ұ��� �հ�, ���)


//���� int �迭 5�� ����� , �ַܼ� ���� �Է¹ޱ�
// �հ�, ���  (�迭 ��Ұ��� �հ�, ���)
		

//�迭���� int[] arr = new int[5];

public class Ex01 {

	public static void main(String[] args) {
	
	int[] arr = new int[5];
	double sum = 0, ave = 0;
	
	arr[0] = 100;  // �ʱ�ȭ
	arr[1] = 200;
	arr[2] = 300;
	arr[3] = 400;
	arr[4] = 500;
		
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	ave = sum/arr.length;
	System.out.println("�հ� =" + sum); // �հ�
	System.out.println("��� =" + ave); //���
	
	int[] arr2 = new int[5];
	double sum2 = 0, ave2 = 0;
	
	Scanner sc = new Scanner(System.in);
	
	for (int j = 0; j < arr2.length; j++) {
		arr2[j] = sc.nextInt();
		sum2+= arr2[j];	
	}
	sc.close();
	ave2 = sum2/arr2.length;
	System.out.println("�Է� ���� �հ� =" + sum2); // �հ�
	System.out.println("�Է� ���� ��� =" + ave2); //���
	
	
	
	
	
	
	
	
	
	
	}
}
