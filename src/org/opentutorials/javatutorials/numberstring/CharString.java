package org.opentutorials.javatutorials.numberstring;

public class CharString {

	public static void main(String[] args) {
		
		
		System.out.println('생'); // 한 글자로 되어있는 '문자'이기때문에 작은따옴표로 표기하며, 이것을 Char(Character)라고 한다.
		
		System.out.println("생활코딩"); //문자가 결합되어있기때문에 쌍따옴표로 표기하며, 이것을 String이라고 한다.
		
		System.out.println("생"); //문자가 하나라고 하더라도 쌍따옴표로 표기해도 된다.
		
		
		System.out.println("생활코드"+"입니다"); //문자열과 문자열을 더할대에도 + 연산자를 사용한다.
		System.out.println("1"+"1"); // 큰따옴표 안에숫자가 더라도 숫자가 아닌 문자열로 표기하기에 2가 아닌 11로 표기된다.
		
		
		System.out.println("egoing said \"Welcome programming world \"");
		//문자열을 이어서 쓰고 싶을때는 '역슬래쉬'를 사용하면 되는데,반드시 역슬래쉬다음엔 쌍따옴표를 반드시 붙혀서 사용해야한다.
		// 띄어쓰기를 할 경우엔 컴파일 에러가남.
	
		System.out.println("egoing said");
		System.out.println("Welcome progtaming world");
		//문장 두개를 2개의 출력으로 나타낼수도 있지만..
		
		System.out.println("egoing said \nWelcome programing world\"");
		// 문자열 사이에 \n 을 입력하면 줄바꿈이 되어 후술문장이 다음줄로 넘어가게 된다.
		// 이 방식으로 출력하면 출력문장1개에 2줄의 문장이 서술되게 된다.
		
	}

}
