package java1016;

public class ConstructorDemo {

	//아무것도 쓰지 않았을때는 생성자가 기본생성자로 생성된다.
	public ConstructorDemo() { // 사용자가 임의로 생성자를 생성한 후에 기본생성자를 생성하려면. 
							   // 컴퓨터가 자동으로 기본생성자를 생성해주지 않기때문에사용자가 기본생성자를 생성해주어야한다.
		
	}
	
	public ConstructorDemo(int parma1) { // 매개변수가 들어오면서 더이상 기본생성자가 아니게 된다.
		
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo c = new ConstructorDemo(); //따라서 해당 로직은 매개변수 미 입력으로 컴파일 에러가 발생한다.
		
	}
	
}
