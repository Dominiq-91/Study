package java1006;

import java.util.Scanner;

public class 반복문복습 {

	public static void main(String[] args) {
/*		
		반복문
		
		1. while
			
			1) 로직

				while(조건) {
				   (반복 실행 영역)
				}
				
		2. do while
			
			1) 로직

				do {					
					[반복할 문장]
				} while (조건)     // do에서 문장을 한번 우선실행하고, while로 내려와 조건을 만족하면 다시 do로 올라가 반복한다.

			
*/				
		// 1. while
		
		int i = 0;
		 
		 while( i < 10) {
			 System.out.println("coding everybody"+i);
			 i++;
		 }
		 
		 // 위의 로직에서 while문의 조건이 true일 경우엔 블럭의 연산이 반복된다.
		 // 이때 i++ 를 지정해주면 i는 반복이 될때마다 1씩 증가하면서, i 가 9일때까지 총 9번 반복된다.
		 // i++ 가 없을경우엔 무제한으로 반복된다. i 는 항상 0이고 0은 항상 10보다 작기 때문.
		 
//		 ----------------------------------------
		 
//		2. do while
		 
		 int value = 0;
		 Scanner scan = new Scanner(System.in);  //Scnner 는 java.util 이라는 클래스다.
		 										 // 어디론가부터 값을 입력 받고 싶을때 쓰는 타입 
		 										// System.in -> 키보드
		 
		 do {
			 
			 value = scan.nextInt();			// nextInt 는 입력값의 타입이 정수임을 지정해줌.
			 System.out.println("입력받은값 :" + value);
			 
		 }while(value != 10);
		 
				 System.out.println("반복문 종료");
	}	

}
