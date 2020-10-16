package java1016;



/* 
 		클래스는 필드와 메소를 가진다.
 			
 		필드와 메소드는 반드시 클래스와 관련된 것들이어야 한다.
 		이러한것을 캡슐화(관련된 내용을 모아서 가지고 있는 것) 이라고 한다.	

 */


public class AccessObj {

	// 접근 제한자의 종류.
	
	public int p = 3;			// 어떤 클래스든 아무나 접근 할 수 있다.
	protected int p2 = 4;		// 같은 패키지 내의 것만 접근 할 수 있다. 다른 패키지여도 자식 클래스(상속)라면 접근을 허용한다.
	private int i = 1; 			// 자기 자신만 접근할 수 있다.
	
	int k = 2;					// 아무것도 안쓴경우는 default 접근지정자 이다. 자기자신과 같은 패키지 내에서만 접근을 허용한다.
	
// 접근 허용범위의 순서. public > protected > default > private
}
