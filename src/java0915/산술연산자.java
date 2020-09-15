package java0915;

public class 산술연산자 {
	
/* 연산 : 데이터를 처리하여 결과를 산출하는 것
 * ex) x+y+z;
 * 
 * 연산자(Operations): 연산에 사용되는 표시나 기호 (+.-.*./.%,=,...)
 * 		부호 연산자 (+,-) - 단항 연산자
 * 		산술 연산자 (+.-.*,/,%)
 * 		증감 연산자 (++,--) : 1씩 증가하거나 감소시키는 연산
 * 
 * 피연산자(Operand) : 연산 대상이 되는 데이터(리터럴, 변수) */
	 
	public static void main(String[] args) {
		int i1 = -5; //-는 부호연산자, 5는 피연산자
		int i2 = +i1;
		int i3 = -i2; 
		
		System.out.println(i1);
		System.out.println(i2); // 변수 앞에 +라는 부호연산자가 붙게 되면, 부호비트를 그대로 유지시키고, - 부호연산자가 -를 +로, +를 -로 바꿔주는 역할을 함
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3+1;(전위연산자)
		
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; // i3 = i3+1;(후위연산자) , 이유는 먼저 i3의 값을 대입시키고 대입시켜진 이후에 i3+1 의 연산식이 진행된다.
		
		System.out.println(i5);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		System.out.println(j - i);
		System.out.println(i / j); //결과값이 2.5가 나와야하는데, 2가 나옴. 이유는 int로 연산이 되기때문에 int값으로 리턴된다.
		System.out.println(i / (double)j); // j를 강제형변환해서 실행하는걸 캐스팅연산이라 한다.
		System.out.println(i % j); //모듈러연산은 나누고 남은 값 (1)이 출력된다.
		
		
		int x = i-j;
		
		System.out.println(x);
		
		
		
		
		

	}

}
