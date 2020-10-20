package java1020;

public class ExceptionExam {

/*	   
  		예외처리 문법
	try-catch-finally

	try{
		수행할 코드
		예외가 발생할 가능성이 있는 블록
	
	}catch(예외클래스 변수명){
	
		예외 처리 블록
	
	}finally{      -> 생략 가능한 블럭
		예외 발생 여부와 상관없이 
	  	무조건 실행되는 블럭.
	
	}
	
*/
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		try {
		int k = i/j;
		System.out.println(k);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다. /"+ e.toString());   // .toString()  -> 예외의 정보를 알려주는 메소드
		}finally {
			System.out.println("오류가 발생했든, 발생하지 않았든 무조건 실행");
		}
		System.out.println("main end!!");
		
	}

}
