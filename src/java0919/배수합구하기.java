package java0919;

public class 배수합구하기 {

	public static void main(String[] args) {
		

		// 0부터 100까지중에 2의 배수의 합, 
		// 3의배수의 합,4의배수의 합, 5의 배수의 을 구하여라
		
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i =0; i<101; i++) {
			
			if(i%2==0) {
				sum = sum+i;
			} 
			if(i%3==0) {
				sum1 = sum1+i;
			} 
			if(i%4==0) {
				sum2 = sum2+i;
			} 
			if(i%5==0) {
				sum3 = sum3+i;
			} 
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
