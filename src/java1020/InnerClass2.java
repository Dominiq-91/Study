package java1020;

public class InnerClass2 {

	static class Cal{	// 정적 중첩 클래스
		
		int value = 0;
		
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		
		// 스태틱필드는 외부클래스를먼저 생성할 필요가 없이 바로 사용 가능하다.
		
		InnerClass2.Cal cal = new InnerClass2.Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}
