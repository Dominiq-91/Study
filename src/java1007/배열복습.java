package java1007;

import java.util.Scanner;

public class 배열복습 {

	public static void main(String[] args) {
/*	
		배열 로직 : 타입 뒤에 [] 변수명 
		
		타입 설정 - ex) int[] array1 = new int[100]; == int[] array1 = {0, 0, 0, 0, 0,....}
		/ 100개의 변수값을 저장하는 int형 배열 array1.
		
		-> array1[0] = 50; / array1번 배열 0번째에 50이란 값을 담음
		
		-> array1[10] = 100; / array1번 배열 10번째에 100이랑 값을 담음
		
		
		배열의 선언과 동시에 변수지정 가능
		 
		int[] array = new int[]{1,2,3,4}; == int[] array = {1,2,3,4}; 
		
		 
		System.out.println(array[3]); == 4가 출력됨.
		 
		int value = array[3];  -> array 3번째 배열의 값을 꺼내서 value에 담는 로직
		
		System.out.println(value); -> 4가 출력됨.
*/
		Scanner scan = new Scanner (System.in);

			int number = scan.nextInt();
			
			int strike = 0;
			int ball = 0;
			
			int[] question = new int[4];
			int[] answer = {8,9,1,3};
			
			question[0] = number / 1000;
			question[1] = (number % 1000 ) / 100;
			question[2] = ((number % 1000 ) %100 ) / 10;
			question[3] = (((number % 1000 ) %100 ) %10 ) / 1;
		    
		for(int i = 0 ; i<question.length; i++) {
				
			for(int j = 0; j<answer.length; j++) {
					
				if ( i == j && question[i] == answer[j] ) {
						
						strike++;
						
				}else if ( i != j && question[i] == answer[j]) {
						
						ball++;
						
				}
					
			}
				
		}
		   System.out.println(strike+"스트라이크"+ball+"볼");
		   
		   
		   
	}

}
