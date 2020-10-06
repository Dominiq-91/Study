package java1006;

public class 논리연산자복습 {

	public static void main(String[] args) {
		
/*		* 논리 연산자
		
		&& : "논리 곱" - 피연산자가 모두 true일때만 true로 출력해 줌.
		|| : "논리 합" - 피연산자 둘중에 하나만 true라도 true로 출력해 줌.
		!A : "논리 부(Not)" - 피연산자 들의 boolean 값을 반대로 출력해 줌.
		^ : "배타적 논리 합Exclusive or" - 두 피연산자의 boolean 값이 서로 달라야 true라고 출력해 줌.
*/
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);   // and 연산
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);	// or 연산
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		
		int score = 88;
		
		if( score <=100 && score >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		System.out.println(!b1);
		
		
//		----------------------------------------------------------------
		
/*		* 로그인 시스템을 논리연산자로 만들기
		if문으로 만들었을때는 아래와 같다.
		
		String id = args[0];
		String password = args[1];
		
			if(id.equals("kars1313")){
				if(password.equals("000000")){
					System.out.println("로그인에 성공하셨습니다");
				}else{
					System.out.println("비밀번호가 틀립니다.");
				}
			}else{
				System.out.println("아이디가 틀립니다")
			}
			
*/		
		String id = args[0];       //컴파일 오류가 났었던 이유는 컨피규레이션 - 아규먼트 run  안해줬음. 해줘야함.
		String password = args[1];
		
			if(id.equals("kars1313") && password.equals("000000")) {
				System.out.println("로그인에 성공하였습니다.");
			}else {
				System.out.println("로그인에 실패하였습니다.");
			}
		
			
		// 다만 if문일때는 아이디와 비밀번호의 true값과 false값에 따른 출력문이 개별적이었다면,
		// 논리연산자를 이용한 로직은 둘다 true값일때의 출력문을 제외한 나머지는 전부 실패처리 된다는것이다.
		// 가령 아이디는 맞고 비밀번호가 틀렸을때, 아이디가 틀렸을때, 존재하지 않는 아이디일때 등등의 여러가지 경우의 수를 구현하려면
		// if문이 더 나을것이라고 본다.
			
	}

}
