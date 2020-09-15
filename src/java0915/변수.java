package java0915;

public class 변수 {

	// 변수는 값(data)를 담는 그릇같은 것(메모리저장)
	// 변수는 타입과 변수 이름으로 구분되는데, 타입은 정해진 규칙이 있는 반면 변수 이름은 사용자 임의로 지정가능하다.
	// 타입을 다른말로 키워드, 변수이름을 다른말로 식별자 라고도 한다
	// 식별자가 두개이상의 단어로 지정 될 때는, 첫단어의 맨 앞글자는 소문자, 그 다음단어의 첫글자는 대문자여야한다.
	
	public static void main(String[] args) {
		int count;
//      int count; 는 정수를 담을 수 있는 변수	를 선언

		count = 10;
		
		count = 20;
		
		System.out.println(count);
		
//		count = 11.1;

		double avg = 11.1;

		System.out.println(avg);
		
		//		double average(avg로 축약가능); 는 실수를 담을 수 있는 변수를 선언

		String name = "carami";
//		왜 여기서 string name = "carami"; 가 나오는지 의문.
		
		int totalCount;
		
		
	}

}
