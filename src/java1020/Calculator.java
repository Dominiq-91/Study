package java1020;

public interface Calculator {

	public int plus(int x, int y);
	
	
	public int multiplication(int x, int y);
	
	
	default int exec(int x, int y) {   // 인터페이스는 추상클래스만 취급했으나, default로 선언된 메소드는 구현까지도 가능하다.
		return x + y;
	}
	
	public static int exec2(int x, int y) { // 인터페이스에서 생성한 static method는 호출할때 반드시 interface명.method형식 으로만 호출해야한다.
		return x * y;
	}
	
}
