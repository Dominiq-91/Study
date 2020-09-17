package java0917;

public class 복습4 {

	public static void main(String[] args) {
		
		
		//조건문
		
		// if와 switch가 있다.
		
		// if()조건문의 괄호 안의 식은 항상 true나 false값을 나타내는데, true값일때만 실행되고 false값일때는 실행되지 않는다.
		
		if(true) {
			System.out.println("result: true");
			// if 값이 true이기때문에 실행결과가 정상적으로 출력되는것을 알수 있다.
		}
		if(false) {
			System.out.println("result: true");
		}	// if 값이 false이기 때문에 실행결과가 출력되지 않는다.
		
		
//		if(false) {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//			System.out.println(4);
//		}
		System.out.println(5); // 이 출력식에서는 if구문이 false이기때문에 중괄호는 실행되지 못하고 중괄호 밖의실행만 출력된다.
		
		
		//else
		// if구문에 추가로 연결해서 사용하는 명령어로, if구문에서 true값을 제외할때 나머지 부분을 출력할지를 지정하는것이다.
		
		int value = 30;
		if(value > 40) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
		
		//위의 식에서는 value = 30	이라는 값을 if구문에 적용하고 그 결과값이 false로 나오기때문에, if구문 출력은 되지않는다.
		//그래서 if구문 출력을 빠져나와 else구문의 출력으로 진행되기에 wrong이 출력되는것이다.
		
		// 응용을 해보자
		
		String id = args[0];
		String password = args[1];
		if (id.equals("kars1313")) {
			if(password.equals("010101")) {
			System.out.println("로그인에 성공하셨습니다.");
			}else {
			System.out.println("로그인에 실패하셨습니다. 아이디와 비밀번호를 확인해주세요.");
			}
		}else {
			System.out.println("로그인에 실패하셨습니다. 아이디와 비밀번호를 확인해주세요.");
		}
	}
}




