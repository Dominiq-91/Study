package java1020;

public class ExceptionExam2 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		try {
		int k = divide(i,j);
		System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("오류는 다음과 같습니다 : " + e.toString());
		}
	}
	
	public static int divide(int i, int j) throws ArithmeticException,ClassCastException { //-> 오류 해결을 호출하는 쪽에서 해결해야함 throws. 뒤에는 오류 타입 복수 가능
		
		int k = i/j;
		
		return k;
	}

}
