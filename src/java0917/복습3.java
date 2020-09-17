package java0917;

public class 복습3 {

	public static void main(String[] args) {
		
		//비교 연산자
		
		// 비교연산자의 종
		// ==, !=, >, <, >=, <=, .equals(문자열 비교 ==과 같음.)
		
		// 비교연산자를 출력식에 입력하면 true와 false 값으로 출력된다 (boolean과 같음)
		
		System.out.println(1 == 1); //true
		System.out.println(1 == 2); //false
		System.out.println(2 > 3); //false
		System.out.println(2 < 3); //true
		System.out.println(4 <= 4); //true
		System.out.println(4 <= 6); //true
		
		//문자열의 비교연산자의 사용
		
		String a = "apple";
		String b = new String("apple");
			
			System.out.println(a == b);
			System.out.println(a.equals(b)); 
			
			// 위의 출력식이 false인것은 ==는 두개의 데이터 타입이 동일한 객체인지를 알아내기 위해 사용하는 것이므로, false가나온다.
			// 밑의 출력식은 객체의 타입이 아닌 객체의 값을 비교하는것이므로 이용할수 있다. 이것이 .equals이다.
	}

}
