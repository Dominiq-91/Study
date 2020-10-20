package java1020;

/*
	사용자 정의 Exception
	
	public class 클래스이름 extends Exception {
	   ...
	}
	
	Exception 이나 Exception 의 후손을 상속받아 만들어진 클래스
	클래스의 이름만으로 어떤 오류가 발생했는지 알려주어 코드의 직관성을 높인다.
	
	Exception을 상속받은 클래스 = Checked Exception
	
	그 이외에 Runtime Exception을 상속받은 클래스 = unchecked Exception 
		
*/	

public class BizException extends RuntimeException {
	
	public BizException (String msg) {
		super(msg);
	}
	public BizException(Exception ex) {
		super(ex);
	}
}
