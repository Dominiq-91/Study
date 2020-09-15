  package java0915;

public class 비교연산자 {

	// 비교연산자의 종류는 =(같다),!=(다르다),<(크다),>(작다),<=(크거나같다),>=(작거나같다)로 표기한다.
	// 답은 예,아니오로 나오기때문에 비교연산자의 결과값은 boolean값이다.
	
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		
		System.out.println(i==j); //두 값이 같기때문에 연산값이 true로 나온다.
		System.out.println(i!=j); //값이 옳지 않기떄문에 false로 나온다.
		System.out.println(i>j);
		System.out.println(i>=j);
		System.out.println(i<j);
		System.out.println(i<=j);
		
		//위의 내용들은 '단순대입연산자'이다.
		
		i += 10; // i= i+10;과 같다. 이것이 '복합대입연산자'이다.
		
		System.out.println(i);
		
		i -= 5;
		
		System.out.println(i);
		
	}

}
