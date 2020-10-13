package java1013;

public class Myclass {

// 		메소드 선언방식	: public 리턴타입 메소드명 (매개변수들) {  기능 구현  }

/*		
		필드가 물체의 속성이라면
		메소드는 물체의 행동을 나타낸다. 클래스가 가지고 있는 기능
	
		메소드는 입력값을 받아서 무언가를 한 다음에 결과값을 도출해낸다.
		
		입력값을 매개변수혹은 인자., 결과값을 리턴값 이라고함.
		
		매개변수(Parameter) :전달된 인자를 받아들이는 변수를 의미한다.
		
		인자(Argument) : 어떤 함수를 호출시에 전달되는 값 자체를 의미한다.
		
*/

	 public void method1 () {    // 매개변수도없고, 돌려줄 값(리턴)도 없는 메소드
//		 리턴타입이 없을때 void
		 System.out.println("m1이 실행됨..");
		 
	 }
	 
	 public void method2 (int x) {  // 매개변수(정수형)는 있지만, 돌려줄 값(리턴) 이 없는 메소드
		 System.out.println(x+ "를 이용한 m2가 실행됨");
		 
	 }
	 
	 public int method3 () {   // 매개변수는 없지만, 돌려줄 값(리턴) 정수형 이 있는 메소드
		 System.out.println("m3이 실행됨");
		 return 10;
	 }
	 
	 public void method4 (int x, int y) {  //매개변수가 2개이지만, 돌려줄값(리턴)이 없는 메소드
		 System.out.println( x + y +"m4를 실행함");
	 }
	 
	 public int method5 (int y) {  //매개변수도 있고, 돌려줄 값(리턴)도 있는 메소드
		 System.out.println(y+"이용한 m5실행");
		 
		 return y*2;
	 }
}
