package week1day03;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	final int month;
	
	month = sc.nextInt();
	
	//if ��
	/*if (month >= 3 && month < 6) {
		System.out.println("��");
	}else if (month >= 6 && month < 9) {
		System.out.println("����");
	}else if (month >= 9 && month < 12) {
		System.out.println("����");
	}else if (month <= 12 || month < 3) {
		System.out.println("�ܿ�");
	}else {
		System.out.println("�߸��� �Է�");
	}*/
	
	// switch case ��
	switch(month) {

	case 3: case 4: case 5:
		System.out.println("��");
		break;
		
	case 6: case 7: case 8:
		System.out.println("����");
		break;
		
	case 9: case 10: case 11:
		System.out.println("����");
		break;
		
	case 12: case 1: case 2:
		System.out.println("�ܿ�");
		break;		
	
	default :
		System.out.println("�߸��� �Է�");
		break;
	}
	}
}
