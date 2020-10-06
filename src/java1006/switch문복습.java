package java1006;

public class switch문복습 {

	public static void main(String[] args) {
		
/*		switch 
		
		사용빈도는 적지만 조건이 많다면 switch문이 로직을 보다 명로가게 보여줄 수 있다.
		
		스위치는 제한된 데이터 타입만 사용 가능하다.
		[ byte, short, char, int, enum, String, Character, Byte, Short, Integer ]
		
*/
		
		System.out.println("switch(1)");
		
		switch(1){                         // switch 블럭에 오는 조건이 하위 case와 일치한다면
					                       // 해당 케이스 하위의 모든 케이스들이 실행된다.
		case 1:
			System.out.println("one");
			
		case 2:
			System.out.println("two");
		
		case 3:
			System.out.println("three");
		}
		
//		----------------------------------
		
		System.out.println("switch(2)");
		
		switch(2){                          // switch 조건이 2이기 때문에 case 2부터 하위가 실행되므로
											// case 2와 3이 실행될 것이다.
		case 1:
			System.out.println("one");
			
		case 2:
			System.out.println("two");
		
		case 3:
			System.out.println("three");
				
		}
		
//		----------------------------------
		
		System.out.println("switch(3)");
		
		switch(3){    						// 해당 숫자에서 멈추고 싶다면 각 case마다 break를 걸어 빠져나오는 로직을 구성해준다.
	
		case 1:
			System.out.println("one");
			break;
			
		case 2:
			System.out.println("two");
			break;
			
		case 3:
			System.out.println("three");
			break;
		
		default:							// switch 블럭안의 조건값이 case 어느곳에도 해당되지 않는다면,
			System.out.println("default");	// default 로 해당되게 해주는 로직이다. if문의 else구문과 비슷한 개념이지만 다르다.
		}
		
		
	}

}
