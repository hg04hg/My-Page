package week1day03;

public class ExEx01 {

	public static void main(String[] args) {
		
		int a;  // ����,  �޸𸮺�,  ������,  ���� �����ϴ� ����
		int b;
		
		// �ڷ��� (  �޸�ũ��, �ؼ����   )

		// �ڷ��� ���� 
		
		// ����  - ���� : byte,  short,  int , long  �⺻�� : int
		//            �Ǽ� : float, double  �⺻��: double
		
	    // ����  - 'A'        :���� : char
		// ���ڿ� - "Hello"  :  String  
		// ���� - true, false  : boolean
		
		
		int su1;
		byte su2;
		short su3;
		long su4;
		
		// �� ��ü�� �ڷ����� ���´�.	     long�� �����   L�� �ٿ���
		//                                                  float�� �����   F�� �ٿ���
		su4 = 21000000000L;
		float su5 = 65.2F;       // �Ǽ� ����� �⺻�� double , 
											   // float�� �Ǽ��ϰ� ǥ���ϰ� ��������  f �� ǥ��
		
		int c = 10;
		float f = 23.9F;
		int result =  (int)  (c + f);   //  ĳ��Ʈ ������, �ڷ����� �ӽ÷� ������ �� ���
		System.out.println(result);
		
		
		int d = 10;
		int e = 3;
		double dou = d/ e;            //  ����  /  ����  =>  �����θ� ����
		System.out.println(dou);
		System.out.println("--------------------------------------------");
	
		// ���� ������
		int n1 = 5, n2 = 5, n3 = 10;
		int r1 = n1++;     // 		 ������  :  �������� ���� ������ ����� ��
		int r2 = ++n2;     //       ������  :  �������� ���� ������ ����� ��
	
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("--------------------------------------------");
		
		// ��� ������	
		int h = 10;
		int i = 5;
		
		int hi1 = h + i;		  // 15
		int hi2 = h - i;			  // 5
		int hi3 = h * i;		  // 50
		int hi4 = h / i;		  // 2  => ��
		int hi5 = h % i;		  // 0  => ������
	
		
		// ���� ������
		// >(�ʰ�) ,  <(�̸�) ,  >=(�̻�),  <=(����),  ==(����),  !=(�ٸ���)
		
		int myage = 27;
		boolean value = (myage > 25);
		System.out.println(value);
		System.out.println("--------------------------------------------");
		
		
		// �� ������
		//&& - AND (����),  || - OR (����),  ! - NOT(����)
		
		int num = 15;
		boolean rst1 = ( (num >= 10)  &&  (num <= 30) );	  // AND  �Ѵ� �����ؾ� ��
		boolean rst2 = ( (num >= 10)  ||  (num <= 30) );  // OR �ϳ��� �����ص� ��
		boolean rst3 = !(num >= 15);  //  NOT     !(��) �̹Ƿ� �����̴�.
		System.out.println(rst1);
		System.out.println(rst2);
		System.out.println(rst3);
		System.out.println("--------------------------------------------");
			
		
		// ���� ���� ������
		// +=,  -=,  *=,  /=,  %=  
		int num2 = 0;
		num2 += 10;      //  num2  =  num2  +  10
		System.out.println(num2);	
		num2 *= 2;   	    //  num2  =  num2  *  10 
		System.out.println(num2);
		num2 -=	 10;	    //  num2  =  num2  -  10  
		System.out.println(num2);
		num2 /= 2;        //  num2  =  num2  /  10
		System.out.println(num2);
		num2 %= 2;      //  num2  =  num2  %  10
		System.out.println(num2);
		System.out.println("--------------------------------------------");
		
		
		// ���� ������(���� ������)
		// ���ǽ�?  ��� 1(��)   :  ��� 2(����)      => ���ǽĿ� ���� ��� 1�Ǵ� ��� 2�� �����

		int num3 =  ( 15  >  5 )  ?  10  :  20 ;  // ������ ���ǽ���  if �� ��� ��� ����
		System.out.println(num3);
		boolean num4 = ( ( 1000 * 10 ) < ( 300 * 15 ) )  ?  true  :  false;
		System.out.println(num4);	
		System.out.println("--------------------------------------------");
		
		
		// �����  :  ����  ,  �б� ,  �ݺ�,  
		
		// �б�,  if ��
		
		int age2 = 24;
		if (age2 > 0 && age2 < 20) {
			System.out.println("��� �Դϴ�.");
		}else if (age2 >= 20 && age2 < 30) {
			System.out.println("20���Դϴ�.");
		}else if (age2 >= 30 && age2 < 40) {
			System.out.println("30���Դϴ�.");
		}else if (age2 >= 40 && age2 < 50) {
			System.out.println("40���Դϴ�.");
		}else if (age2 >= 50 && age2 < 60) {
			System.out.println("50���Դϴ�.");
		}else if (age2 >= 60 && age2 < 70) {
			System.out.println("60���Դϴ�.");
		}else if (age2 >= 70 && age2 < 110) {
			System.out.println("��� �Դϴ�.");
		}else {
			System.out.println("Error");
		}
		System.out.println("--------------------------------------------");
		
		
		// �б⹮  switch
		int menu = 1;           // 1 : ���,  2 : ��ȸ,  3 : ����,  4 : ���� 
		
		switch(menu) {
		
		case 1 :
			System.out.println("��� �� �����ϼ̱���");
			break;
		case 2 :
			System.out.println("��ȸ �� �����ϼ̱���");
			break;
		case 3 :
			System.out.println("���� �� �����ϼ̱���");
			break;
		case 4 :
			System.out.println("���� �� �����ϼ̱���");
			break;
		default : 
			System.out.println("�߸� ���� �ϼ̽��ϴ�.");
			break;
		}
		
		
		// �ݺ���  for
		
		for (int  z = 1; z <= 5; z++) {
			System.out.println("�ȳ�");
		}
		
		// 3�� ���
			
		for (int w = 1; w <= 9; w++) {
			System.out.println(  3  *  w  );
		}
		System.out.println("--------------------------------------------");
		int w = 1;
		while (  w  <=  9  ) {
			System.out.println(  3  *  w  );
			w++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}
}
