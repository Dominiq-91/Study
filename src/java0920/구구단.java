package java0920;

public class 구구단 {

	public static void main(String[] args) {
		
//		for( int a = 2; a<10; a++) {
//			
//			System.out.print("["+a+"단]\t");
//		}
//		System.out.println();
		
		for( int a = 1; a<10; a++) {
			for( int b = 2; b < 10; b++) {
				
				System.out.print(b+"x"+a+":" + b*a + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
	    // while문에서는 하위 반복문에서 상위 반복문으로 갈때, 변수값을 초기화 해주어야 한다.
		// 허나 for문에선 그럴 필요가 없는것이, 모든 변수는 for문 안에 종속되어있기 때문이다.
		// for문의 괄호는 참이냐 거짓이냐의 유무로 작동하는것이 아니라, 작동 조건일 뿐..
		
		////////////////////////////////////////
		
//		int a = 2;
//		int b = 1;
//		while(a<10) {
//			while( b<10) {
//				
//				System.out.println(a+"x"+b+";" + a*b);
//				b++;
//			}
//			b=1; // b를 재초기화를 해주지 않으면 구구단 성립이 되지않는다
//				 // b라는 변수는 while문 안에 종속되어있는게 아니라 밖에 있다. 
//				 // 따라서 하위 while문의 b++를 통해 b값은 1에서 9로 바뀐상태로 존재한다.
//				 // 하위 while조건이 9이상으로 증가할수 없으므로 작동하지 않기에 상위 while문의 조건도 진행되지 않는다.
//				 // 따라서 b를 다시 1로 만들어 주는 작업을 해줘야한다.
//			a++;
//		}
//		System.out.println();
		
		
		//위의 while문을 if문을 사용하여 재 조정 해줄 수도 있다.
//		
//		int c = 2;
//		int d = 1;
//			while(c<10) {
//			
//				System.out.println(c+"x"+d+":" + c*d+); //c가 10이하일때까지 d가 +1씩 증가하면서 식 출
//				d++;
//				
//				if(d>9) {	// 출력되는 식에서 d값이 9를 넘길때 
//					d=1;	// d를 다시 1로 초기화 해주
//					c++;	// c를 1씩 증가시킴 = x9까지 되면 다음 단으로 넘어감
//				}
//				
//			}
//			System.out.println();
		}

}
