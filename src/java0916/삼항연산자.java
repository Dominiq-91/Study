package java0916;

public class 삼항연산자 {

//	삼항연산자는 if문과 비슷함.	
	
	public static void main(String[] args) {
		int b1 = (5 > 4) ? 50 : 40; 
				//4가 5보다 큰것이 참이라면
				// 50을 b1, 거짓이라면 40을 b1에 입력하라는 뜻이다.
			System.out.println(b1);
			
		int b2 = 0;
		if(5<4) {
			b2 = 50;
		}else {
			b2 = 40;
			
		}

		System.out.println(b2);
		
		//if구문이 길어진다면 삼항연산자를 사용하는것도 방법중 하나이다.
	}
 
			
}
