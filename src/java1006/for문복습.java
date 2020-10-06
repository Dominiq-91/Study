package java1006;

public class for문복습 {

	public static void main(String[] args) {
		
/*		for 반복문
		
	   for (초기화, 종료조건, 반복실행) {
		   반복하려는 문
	   }
	   
*/	   
	   
		int sum = 0;	// total은 전역변수 (gloval variable) 
		// 1에서 100까지의 합을 구하고자하는 변수를 total로 선
		for ( int i = 1; i <= 100; i++) { // i는 지역변수 (local variable), 지역변수는 지정된 곳을 벗어나면 사라진다.
			
			sum = sum + i;
			
		}

		System.out.println(sum); // 출력식은 한번만 출력할것이기 때문에 반복문 안이 아닌 바깥에 빠져나와서 로직을 형성해준다.
		
		
		int sum2 = 0;
		
		for ( int j = 1; j <= 100; j++) {
			if ( j%2 != 0) {  // 2로 나눴을때 0이 아니라면  = 홀수 
				continue;     // continue 를 만나면 그 다음에 나오는것을 실행하지 않기 때문에 반복문이 실행되지 않음.
			}				  // 즉 위의 식은 홀수 일때는 건너 뛰고 짝수의 합을 구하는 또 다른 식인것이다. 
			sum2 = sum2 + j;
		}
/*		
		반복문에서의 
		continue 와 break 의 차이점.
		
		continue 는 조건값에 해당하면 해당하는 순간 continue 밑의 식을 수행하지 않고, 바로 다음으로 넘어가 '계속해서 반복'하지만
		break는 조건값에 해당하는 순간 '반복문 자체'를 빠져나온다.
*/		
		
//		------------------------------------------------
		int x = 0;
		
		while ( x < 10) {
			
			System.out.println("Dumbo"+" "+ x);
			x++;
			
		}
		
		// 위의 while문과 아래의 for문은 같은 구동방식을 가지는 로직이다. 
		// 다만 while문의 변수 x는 전역변수, for문의 변수 z는 지역변수이다.
		
		for (int z  =0; z < 10; z++) {
			
			System.out.println("Dumbo"+" "+ z);
			
		}
		
		
		
	}

}
