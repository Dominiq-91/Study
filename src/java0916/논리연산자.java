package java0916;

public class 논리연산자 {

	
//	A&&B (논리곱) : 피연산자가 모두 true일때만 true결과값을 return한다.
//	A||B(논리합): 피연산자 둘중에 하나라도 true값이면 true결과값을 return 한다.
//	!A(not) : 결과를 반대로 바꿔주는 단항연산자 (ex,true -> false, false -> true)
//	A^B(배타적논리합,익스클루시브오어) : 피연산자 두개중 하나는 true, 하나는 false일때만 true값을 return 한다.
	
	
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); // 논리곱연산자이기때문에 둘중에 하나가 false라서 false로 return
		System.out.println(b1 && b3); // 두 값이 모두 true라서 true를 return
		
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		
		int score = 68;
		if(score <= 100 && score >= 70 ) { // 100보다 작거나 같으면서, 70보다 크거나 같은 두 조건이 모두 true인값을 내고자 한다면. 
										   // 둘다 true여야 하는 논리곱연산자를 사용해야한다.
			System.out.println("성공");
		}else {   // 이 부분에서 그렇지않을 경우엔 else 구문 뒤에 아무것도 입력 안한상태로 return해주면 된다.
			System.out.println("실패");
		}
		
		
		System.out.println(b1 ^ b3); // 배타적논리합은 두 사실이 다를때만 true를 return 하기때문에. 이출력은 false를 출력한다.
		System.out.println(b1 ^ b2); // 이 출력은 두 값이 서로 다른사실이기에 true를 return한다.
		System.out.println(!b1); // not연산자를 통해 true값이던 b1이 false값으로 변환.
		
		
	
	}

}
