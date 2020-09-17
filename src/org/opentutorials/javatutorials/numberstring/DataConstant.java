	
	package org.opentutorials.javatutorials.numberstring;

	public class DataConstant {

		
		int a = 1; // a는 선언된 변수, 1은 변하지않는 '상수'이다.
		
		float b = 2.2f; // float을 사용할때는 상수에 f를 써줌으로써 2.2 상수(double형)를 float 타입으로 지정해준것이다.
		
		
		//정수의 데이터 타입을 가진 유형
		
		int c = 2147483647; //integer는 2147483647까지만 표현할수 있기때문에 1 많은 214748368은 표현 못한다.
//		long d = 2147483648; // 데이터타입이 long인데도 컴파일 오류가 나는 이유는, 여전히 상수값이 int형이기 때문이다.
		long e = 2147483648l; // 
		
		//예외는 있다. byte와 short의 상수입력시에는 integer형으로 써도 컴파일 오류가 뜨지 않는다. 범위만 맞춰주면 된다.
		
		
	}

