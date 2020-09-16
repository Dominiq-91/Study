package java0916;

public class if문 {
	
	// 어떤 문장은 수행하고싶고, 어떤 문장은 수행하고 싶지 않을때 사용하는것이 '조건문'이다.
	// 조건문에는 if문과 switch문이 있다.
	// if문은 변수서식값에 해당하는 조건문값이 true일때만 출력된다.
	
	public static void main(String[] args) {
		
//		int x = 50;
//		int y = 60;

//		if(x > y) { // 주어진 조건식이 만족되었을때만 출력이 되는것이 if문이다. 이와같은경우는 출력이 되지 않음.
//			System.out.println("x는 y보다 작습니다.");
//			System.out.println("test");
//		}  
//
//		if(x == y)
//			System.out.println("x는 y와 같습니다.");
//		System.out.println("test");
//						
				
//		if(x == y) {
//			System.out.println("x는 y와 같습니다.");
//		} else if(x < y){
//			System.out.println("x는 y보다 작습니다.");
//		}else {	
//			System.out.println("x와 y는 다릅니다");
//			System.out.println("test");
			
			// else 구문은 실행되는 조건식에 만족하지 않았을 경우(false)출력할수 있다.
			// 또한 else 구문에 if 조건구문을 사용할수 있다.
			// 하지만 if 와 else 구문은 너무 많이 붙혀서 사용하지 않는것이 좋다,
			
		
		int value = 13;
		
		if (value % 3 > 0) {
//			System.out.println("x");
		}else if (value % 2 > 0) {
			System.out.println("y");
		}else if (value % 1 >= 13)
			System.out.println("z");
		
	}
}	










