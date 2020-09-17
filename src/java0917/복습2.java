package java0917;

public class 복습2 {

	public static void main(String[] args) {
		
		//연산자
		
		//1. 산술연산자
		
		// +(더하기), -(빼기), *(곱하기), /(나누기), %(나머지) 
		
		int result = 1 + 2; // 	3
			System.out.println(result);
		
		result = result-1;  //  2
			System.out.println(result);
		
		result = result*4;  //  8
			System.out.println(result);
		
		result = result/2;  //  4
			System.out.println(result);
		
		result = result%3;  //  1
			System.out.println(result);
			
			
		// 산술연산자 말고도 문자열로 연산을 진행할 수 있다.
			
		String firstString = "This is";
		String secondString = " a concatenated string";
		String thirdString = firstString + secondString;
			
			System.out.println(thirdString);
			
			
		//연산자의 형번환
			
			int a = 10;
			int b = 3; //일 때는 두 값이 모두 정상적으로 출력된다. 상수값이 정수타입의 변수에 대입되었기 때문.
			
			float c = 10.0F;
			float d = 3.0F; // 이렇게 진행될때는 소수점자리수의 실수가 해당하는 타입에 알맞게 들어갔기때문에 정상출력.
			
				System.out.println(a/b); //a를 b로 나눈 값은 3이다. 나머지값은 표기되지 않는다. 정수와 정수를 나눈것임.
				System.out.println(c/d); //c를 d로 나눈 값은 3.333333으로 출력된다. 출력되는 타입값이 소수점을 포함하기때문이다.
				System.out.println(a/d); //a를 d로 나눈 값은 3.333333으로 출력된다. 정수에서 실수를 나눈것이므로, 묵시적 형번환이 일어난다.
										 // 더 자세히 설명하면. 10이라는 숫자와 3.0이라는 숫자를 계산할때, 더 세부적인 3.0으로 10이 변환된다.
										 // 그래서 사실상의계산은 3.0으로 10.0을 나누는 결과가 출력된다. (2번째 출력식과 동일결과)
				
		
			
			
			
			
	}

}
