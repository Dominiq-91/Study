package java0920;

public class 반복문문제 {

	public static void main(String[] args) {
		
		//반복문 문제1
		// 0~20까지 출력해보자
		
		for(int a=0; a<21; a++) {
			
			System.out.print(a + " ");
			
		}
		System.out.println();
		System.out.println();
		
		//반복문 문제 2
		// 0부터 100까지 10의 단위만 출력해보자
		
		for(int b=0; b<101; b++) {
			
			if(b%10==0) {
				System.out.print(b+" ");
			}
			
		}
		System.out.println();
		System.out.println();
		
		
		//반복문 문제3
		//0부터 10까지 모두 더한값을 출력해보자
		
		int total = 0;
		
		for(int c=1; c<11; c++ ) {
			
			total = total+c;
	
		}
		System.out.print(total);
		
		System.out.println();
		System.out.println();
		
		//0부터 20까지 짝수만 출력해보자
		
		
		for(int d=0; d<21; d++) {
			if(d%2==0) {
				System.out.print(d+" ");
			}
		}
		System.out.println();
		System.out.println();
		

	}

}
