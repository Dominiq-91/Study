package java1006;

public class 삼항연산자복습 {

	public static void main(String[] args) {
				//true or false
		int b1 = ( 5 > 4 ) ? 50 : 40;
				// 5가 4보다 큰것이 사실이라면 50을 b1에 넣고, 거짓이라면 40을 b1에 넣어주세요.
				
			System.out.println(b1);
			
//		------------
		int b2 = 0;
		
		if( 5 < 4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		
			System.out.println(b2);
//		------------

	}

}
