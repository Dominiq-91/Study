package java1020;

/*
		내부 클래스란,
		클래스 안에 선언된 클래스이다.
		
		1번째 형태 : 중첩 클래스(인스턴스 클래스)
		클래스안에 필드를 선언하는 위치에 선언되는 경우 
		
		2번째 형태 : 정적 중첩 클래스 (스태틱 클래스)
		스태틱한 필드로 선언되는 경우.
		
		3번째 형태 : 지역 중첩 클래스 (지역 클래스)
		인스턴스 변수로 선언되는것이 아니라 메소드 안에서 선언되는 경우.
		
		4번째 형태 : 익명 중첩 클래스
		내부 클래스 이기도 하다. 
*/



public class InnerClass {
		
		class Cal{
			
			int value = 0;
			
			public void plus() {
				value++;
			}
		}
	
	public static void main(String[] args) {

		//내부의 Cal 클래스를 사용하는 방법
		
		InnerClass ic = new InnerClass(); // 외부클래스를 객체생성 먼저 해야함. 내부가 독자적으로 생성될 수 없음.    
		InnerClass.Cal cal = ic.new Cal();
//		(외부클래스명.내부클래스명 변수명 = 외부클래스 객체명.내부클래스 생성자.)
		
		cal.plus();
		System.out.println(cal.value);
	}

}
