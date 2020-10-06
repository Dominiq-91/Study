package java1006;

public class if문복습 {

	public static void main(String[] args) {
		
//		조건문
		
//		어떤문장은 수행하고 싶고, 어떤 문장은 수행하고 싶지 않을때 사용.
		
//		자바는 제어와 관련된 문법으로 if,switch같은 문법을 제공한다.
		
/*		ex)
		int x = 50;
		int y = 60;
		
		if(x < y) {
			System.out.println("x는 y보다 작습니다");
		}
		// if 구문의 조건이 만족(true)값일때만 {}(블럭) 안의 식이 출력된다.
		
		if(x == y) {
			System.out.println("x는 y는 같습니다."); (true 출력)
		}else {
			System.out.println("x는 y와 같지 않습니다"); (false 출력)
		}
		
		위와같은 상황은 if조건문에서 true값일때 "x는 y와 같습니다"가 출력되고,
		false 값일때 "x는 y와 같지 않습니다" 를 출력하기 위한 식이다.
		
		else를 적느냐 안적느냐의 차이는 if 조건문 안의 불린값이 false일때 출력을 해줄 필요가 있느냐 없느냐로 나뉜다.
		
		-------------------------------------------------------
*/		

		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		
		for(int a=1; a<100; a++) {
			
			if ( a%2 == 0) {
				total1 = total1 + a;
			}
			
			if ( a%3 == 0) {
				total2 = total2 + a;
			}
			
			if ( a%4 == 0) {
				total3 = total3 + a;
			}
		
			if ( a%5 == 0) {
				total4 = total4 + a;
			}
			
		}
//		System.out.println("2의 배수의 합은"+total1+"입니다.");
//		System.out.println("3의 배수의 합은"+total2+"입니다.");
//		System.out.println("4의 배수의 합은"+total3+"입니다.");
//		System.out.println("2의 배수의 합은"+total4+"입니다.");
		
		
		
//		-------------------------------------------------
		System.out.println("아이디를 입력해주세요.");
		
		String id = args[0]; // arguments 에 kars1313 입력을 했기 때문에 args[0]은 kars1313 된다.
		
		if ( id.equals("kars1313")) {     // .equals는 문자와 문자를 비교할때 사용한다. == 사용안함.
			
			System.out.println("비밀번호를 입력해주세요.");
			
		}else {
			
			System.out.println("아이디가 없거나 올바르지 않습니다.");
			
		}
		
		
//		-------------------------------------------------
		
		String id1 = args[1];
		String password =args[2];
		
		if(id.equals("Donghyun1313")) {
			
			if(password.equals("000000")) {
				
				System.out.println("로그인에 성공하였습니다.");
				
			}else {
				
				System.out.println("비밀번호가 틀렸습니다");
				
			}
			
		}else {
			
			System.out.println("아이디가 틀렸습니다.");
			
		}
		
	}

}
