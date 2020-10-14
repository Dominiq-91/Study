package java1014;

public class ClassInstanceObject2 {

	// 아래의 로직들은 ClassInstanceObject 의 로직에서 반복되는 부분들을 메소드를 이용하여 구축한 것이다.
	// 중복을 제거한 것들을 리팩토링(refactoring) 이라고도 한다.
	
	public static void sum(int left, int right) {
		
		System.out.println(left+right);
		
	}
	
	public static void main(String[] args) {
		
		sum(10,20);
		sum(20,40);
		
	}

}
