package java1013;

public class StringClass {

	public static void main(String[] args) {
		
/*		String class = 문자열을 표현하는 자바에서 가장 많이 사용하는 클래스.
		new연산자를 이용하지 않고도 인스턴스를 만들수 있다.

*/
		
		String str1 = "hello";
		String str2 = "hello";
		
//		-> hello메모리가 상수 메모리에 저장된다. 저장된 인스턴스를 검색해서 가져오므로
//		   따라서 str1과 str2는 같은 인스턴스를 가진다. hello는 실질적으로 한개인셈.
		
		
		String str3 = new String("End coding");
		String str4 = new String("End coding");
		
//		-> 별개의 메모리에 End coding을 각각 생성한다. End coding이 실질적으로 2개인셈.
		
		
		if(str1==str2) {
			System.out.println("str1과 str2는 같은 레퍼런스 입니다.");
		}
		
		if(str1==str3) {
			System.out.println("str1과 str3는 같은 레퍼런스 입니다.");
		} // -> false
		
		if(str3==str4) {
			System.out.println("str3과 str4는 같은 레퍼런스 입니다.");
		} // -> false
		
		
		// String class는 한번 생성되면 변하지 않는다. String만 그렇다.
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3));	// -> 3번인덱스부터 출력한다. lo만 출력.
		
		System.out.println(str1); // -> 앞선곳에서 변형했다 하더라도 클래스 자체는 변하지 않는다. hello 출력.
		
		
//		== 과 .equals() 의 차이
		
//		== 는 등호 좌 우의 변수들이 참조하는 인스턴스의 관계를 나타내지만,
//		.equals() 는 좌 우의 변수들이 참조하는 인스턴스의 관계가 아닌 저장되는 값을 비교한다.
		
		String str5 = new String("hello");
		String str6 = new String("hello"); // -> 실질적으로 두개의 별개의 인스턴스가 생겼다. hello 와 hello.
		
		if (str5 == str6) {
			System.out.println("str5와 str6은 같은 레퍼런스 입니다."); // -> 두개의 다른 별도의 레퍼런스이기떄문에 출력되지 않는다. 레퍼런스의 관계를 비교하는 것이기 때문. 출력 X
		} else if (str5.equals(str6));{
			System.out.println("str5와 str6은 같은 값을 가지고 있습니다.");	// -> 관계는 중요치 않고 변수에 저장된 결과값의 여부만 중요하다. 출력 O
		}
	}

}
