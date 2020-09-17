package java0917;

public class 반복문복습 {
	
	// 반복문의 문법
	
	//  while(조건){        /조건에는 '언제까지 반복할 것'인지가 온다.
	//	반복 실행 영역		   /실행 영역에는 '반복되는 작업'이 들어온다.
	//  }
	// 	"조건이 참(true)인 동안 반복적인 작업을 반복적으로 실행한다.
		
	public static void main(String[] args) {
		
	    int i = 0;
//		i의 값이 10보다 작다면 true, 크다면 false가 된다. 현재 i값은 0이기때문에 0부터 9까지 나올것이다.
		
		while(i<10) { //비교연산자의 값은 항상 true나 false로만 return 된다.
			System.out.println("Coding Everybody" + i);
			i++; 
		}
		
		
		// for문의 문법
		 
		// for(초기화; 종료조건; 반복실행){
		//	    반복적으로 실행될 구문
		// {
		
		
		// for문의 구성요소는 사실 while문의 구성과 다르지않지만.
		// 다른점은 for문은 while문의 구성요소를 한줄에 처리할 수 있다는 것이다.
		
		
		for (int j = 0; j <= 10; j++) {
			System.out.println("Nice good job" + j);
			
		} 
		
	}

}
