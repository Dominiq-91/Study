package java0915;

public class 상수 {

	public static void main(String[] args) {
		int i;
		i = 10;
		i = 5;
		
		final int J; //상수를 선언할때는 대문자의 명명규칙을 사용한다. (변수는 소문자를 사용)
		J = 10;
//		J = 5; // 상수값은 변경할수 없기때문에 도중에 바꿀수 없다.
		
		double circleArea;
		final double PI = 3.14159; //상수값을 지정함으로써 대체자를 설정?
		circleArea = 3*3*PI;
		
		final int OIL_PRICE = 1390; //상수에 정수를 조합하면 이름을 지정할때 둘다 대문자이기에 가운데에 언더바로 연결해준다.
		
		int totalPrice = 50 * OIL_PRICE; //상수의 장점은 상수값이 변경되었을때 상수명령어의 수치만 변경해주면 이하의 모든 명령문의 수치가 일괄적으로 변경
		
	}

}
