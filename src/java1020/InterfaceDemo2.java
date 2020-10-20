package java1020;


interface I1{
	public void x();
}

interface I2{
	public void z();
}



public class InterfaceDemo2 implements I1,I2{ // 하나의 클래스는 복수개의 인터페이스를 구현할 수있다. 

	public void x() {  // I1의 메소드
		
	}
	
	public void z() {  // I2의 메소드
		
	}
	
	public static void main(String[] args) {
		

	}

}
