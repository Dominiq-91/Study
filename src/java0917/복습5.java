package java0917;

public class 복습5 {

	public static void main(String[] args) {
	
		if(true && true) {
			System.out.println(1);
		}
		if(true && false) {
			System.out.println(2); // 출력되지 않음. 구문이 false이기 떄문.
		}
		if(false && true) {
			System.out.println(3);
		}
		if(false || true) {
			System.out.println(4); //or연산자는 두 항중에 하나라도 true일때 true를 return한다.
		}
		
		
		// !의 사용법
		
		if(!true)
			System.out.println(1); // !는 boolean값을 역전시키는 연산자로. true->false, false-true로 출력값이 바뀐다. 고로 미출력.
		if(!false)
			System.out.println(2);
		
		//응용
		
		String id = args[0];
		String password = args[1];
			
		if((id.equals("kars1313")) || (id.equals("sdh8377")) || (id.equals("gwd258"))
				&& password.equals("010101")) {
			System.out.println("right");
		}else {
			System.out.println("worng");
			//아이디 3개중 어떤것이 들어가도 right이 나온다.
		}
				
	}

}
