package week1day03;

public class ExEx01 {

	public static void main(String[] args) {
		
		int a;  // 변수,  메모리블럭,  기억장소,  값을 저장하는 공간
		int b;
		
		// 자료형 (  메모리크기, 해석방법   )

		// 자료형 종류 
		
		// 숫자  - 정수 : byte,  short,  int , long  기본형 : int
		//            실수 : float, double  기본형: double
		
	    // 문자  - 'A'        :문자 : char
		// 문자열 - "Hello"  :  String  
		// 논리형 - true, false  : boolean
		
		
		int su1;
		byte su2;
		short su3;
		long su4;
		
		// 값 자체도 자료형을 갖는다.	     long형 상수는   L을 붙여줌
		//                                                  float형 상수는   F를 붙여줌
		su4 = 21000000000L;
		float su5 = 65.2F;       // 실수 상수는 기본이 double , 
											   // float형 실수하고 표시하고 싶을때는  f 로 표시
		
		int c = 10;
		float f = 23.9F;
		int result =  (int)  (c + f);   //  캐스트 연산자, 자료형을 임시로 변경할 때 사용
		System.out.println(result);
		
		
		int d = 10;
		int e = 3;
		double dou = d/ e;            //  정수  /  정수  =>  정수로만 나옴
		System.out.println(dou);
		System.out.println("--------------------------------------------");
	
		// 단항 연산자
		int n1 = 5, n2 = 5, n3 = 10;
		int r1 = n1++;     // 		 후위형  :  증가전의 값을 연산의 결과로 줌
		int r2 = ++n2;     //       전위형  :  증가후의 값을 연사의 결과로 줌
	
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("--------------------------------------------");
		
		// 산술 연산자	
		int h = 10;
		int i = 5;
		
		int hi1 = h + i;		  // 15
		int hi2 = h - i;			  // 5
		int hi3 = h * i;		  // 50
		int hi4 = h / i;		  // 2  => 몫
		int hi5 = h % i;		  // 0  => 나머지
	
		
		// 관계 연산자
		// >(초과) ,  <(미만) ,  >=(이상),  <=(이하),  ==(같다),  !=(다르다)
		
		int myage = 27;
		boolean value = (myage > 25);
		System.out.println(value);
		System.out.println("--------------------------------------------");
		
		
		// 논리 연산자
		//&& - AND (논리곱),  || - OR (논리합),  ! - NOT(부정)
		
		int num = 15;
		boolean rst1 = ( (num >= 10)  &&  (num <= 30) );	  // AND  둘다 만족해야 참
		boolean rst2 = ( (num >= 10)  ||  (num <= 30) );  // OR 하나만 만족해도 참
		boolean rst3 = !(num >= 15);  //  NOT     !(참) 이므로 거짓이다.
		System.out.println(rst1);
		System.out.println(rst2);
		System.out.println(rst3);
		System.out.println("--------------------------------------------");
			
		
		// 복합 대입 연산자
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
		
		
		// 조건 연산자(삼항 연산자)
		// 조건식?  결과 1(참)   :  결과 2(거짓)      => 조건식에 따라 결과 1또는 결과 2가 실행됨

		int num3 =  ( 15  >  5 )  ?  10  :  20 ;  // 간단한 조건식을  if 문 대신 사용 가능
		System.out.println(num3);
		boolean num4 = ( ( 1000 * 10 ) < ( 300 * 15 ) )  ?  true  :  false;
		System.out.println(num4);	
		System.out.println("--------------------------------------------");
		
		
		// 제어구조  :  순차  ,  분기 ,  반복,  
		
		// 분기,  if 문
		
		int age2 = 24;
		if (age2 > 0 && age2 < 20) {
			System.out.println("어린이 입니다.");
		}else if (age2 >= 20 && age2 < 30) {
			System.out.println("20대입니다.");
		}else if (age2 >= 30 && age2 < 40) {
			System.out.println("30대입니다.");
		}else if (age2 >= 40 && age2 < 50) {
			System.out.println("40대입니다.");
		}else if (age2 >= 50 && age2 < 60) {
			System.out.println("50대입니다.");
		}else if (age2 >= 60 && age2 < 70) {
			System.out.println("60대입니다.");
		}else if (age2 >= 70 && age2 < 110) {
			System.out.println("어르신 입니다.");
		}else {
			System.out.println("Error");
		}
		System.out.println("--------------------------------------------");
		
		
		// 분기문  switch
		int menu = 1;           // 1 : 등록,  2 : 조회,  3 : 변경,  4 : 삭제 
		
		switch(menu) {
		
		case 1 :
			System.out.println("등록 을 선택하셨군요");
			break;
		case 2 :
			System.out.println("조회 를 선택하셨군요");
			break;
		case 3 :
			System.out.println("변경 을 선택하셨군요");
			break;
		case 4 :
			System.out.println("삭제 를 선택하셨군요");
			break;
		default : 
			System.out.println("잘못 선택 하셨습니다.");
			break;
		}
		
		
		// 반복문  for
		
		for (int  z = 1; z <= 5; z++) {
			System.out.println("안녕");
		}
		
		// 3단 출력
			
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
