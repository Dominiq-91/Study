package java1020;



interface I3{
	public void x();
}

interface I4 extends I3{   // I4가 I3를 상속받았으므로, I4는 x와 z를 둘다 가진다.
	public void z();
}
/*
interface I5 {
	
	private void y();    Interface의 멤버는 반드시 public으로 사용된다. 그 이외의 것은 허용하지 않는다.
}
*/

public class InterfaceDemo3 implements I4{  // 상속받은 I4를 구현하므로 x와 y를 둘다 구현해 주어야 한다.

	public void x(){
		
	}
	
	public void z( ){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
