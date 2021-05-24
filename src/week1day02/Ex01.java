package week1day02;

import java.util.Scanner;

//정수 int 배열 5개 만들고 , 임의의 값으로 초기화
// 합계, 평균  (배열 요소값의 합계, 평균)


//정수 int 배열 5개 만들고 , 콘솔로 값을 입력받기
// 합계, 평균  (배열 요소값의 합계, 평균)
		

//배열선언 int[] arr = new int[5];

public class Ex01 {

	public static void main(String[] args) {
	
	int[] arr = new int[5];
	double sum = 0, ave = 0;
	
	arr[0] = 100;  // 초기화
	arr[1] = 200;
	arr[2] = 300;
	arr[3] = 400;
	arr[4] = 500;
		
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	ave = sum/arr.length;
	System.out.println("합계 =" + sum); // 합계
	System.out.println("평균 =" + ave); //평균
	
	int[] arr2 = new int[5];
	double sum2 = 0, ave2 = 0;
	
	Scanner sc = new Scanner(System.in);
	
	for (int j = 0; j < arr2.length; j++) {
		arr2[j] = sc.nextInt();
		sum2+= arr2[j];	
	}
	sc.close();
	ave2 = sum2/arr2.length;
	System.out.println("입력 받은 합계 =" + sum2); // 합계
	System.out.println("입력 받은 평균 =" + ave2); //평균
	
	
	
	
	
	
	
	
	
	
	}
}
