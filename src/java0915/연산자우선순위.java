package java0915;

public class 연산자우선순위 {

/*  연산자 우선순위
	최우선 연산자: . [] ()
	단항 연산자: ++ -- ! ~ +/- : 부정,bit변환>부호>증감
	산술 연산자: * % / > + - > shift/시프트연산자 >> << >>>
	비교 연산자: > < >= <= == !=
	비트 연산자: & ㅣ ^ ~
	논리 연산자: && > ll!
	삼항 연산자: 조건식?
	대입 연산자: = *= /= %= += -=
*/	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a-b*c); // b*c를 먼저 연산
		System.out.println((a-b)*c); //a-b를 먼저 연산함
		
		System.out.println(a>5 && b>5); // 앞은 false로 return. 뒤는 true로 return. && 연산자는 양쪽 연산식이 둘다 true일 경우에만 true로, 아닐경우 false로 return된다.
		System.out.println(a>5 || b>5); // || 연산자는 두 연산식중에 하나만 true여도 true로 return한다.
	
		 // 전위연산자 먼저 return하고 이후 산술연산자를 return한다.
		System.out.println(a++ - 5); // 후위연산자는 단항연산자이지만 다른연산을 먼저 return한 후에 return된다.
        System.out.println(a);
		

	}

}
