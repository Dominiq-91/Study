package java1018;

public class ClassMember {

/*
		클래스 변수란?
		
		모든 인스턴스가 공유하는 변수가 바로 클래스 변수이다.
		
		인스턴스 변수는..
		
		인스턴스마다 다르게 가지게 되는 변수.
		 
		 
		 
 */
	
	static double PI = 3.14;   // static 한 변수라는것은, 클래스 소속이라는것이고, 이것은 모든 메소드와 모든 인스턴스에서 동일한 값을 가지게 된다는 것이다.
							   // 변하지 않는 값인 상수와 비슷하고, 또 전역변수와도 같다고 보면 된다.
	
	
	
	
	public static void main(String[] args) {
		
		ClassMember cm = new ClassMember();
		
		System.out.println(cm.PI);
		
		
		ClassMember cm1 = new ClassMember(); // 인스턴스가 달라도 값이 같다.
		
		System.out.println(cm1.PI);
		
		
		System.out.println(ClassMember.PI);   // 클래스로부터 직접 가져와도 가능하다.

	}

}
