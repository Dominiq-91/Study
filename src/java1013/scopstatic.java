package java1013;

public class scopstatic {

	int globalScope = 10;
	static int staticVal = 7;
	// 모든 클래스는 인스턴스화 하지 않고는 쓸 수 없다.
	
	public void scopeTest(int value) {
		
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		
		System.out.println(globalScope);
//		System.out.println(localScope);   // 사용 불가능한 이유는 해당 변수들이 지역적이기때문이다.
//		System.out.println(value);
		System.out.println(value2);
	}
	
	
	
	public static void main(String[] args) {
		
		
//		System.out.println(globalScope);   // static 클래스를 사용하면 인스턴스화 하지 않아도 사용할 수 있다. global은 static 하지 않았기때문에 사용불가.
		System.out.println(staticVal);		// staticVal 은 밖에서도 Static화 하였기때문에 사용 가능.
//		System.out.println(localScope);
//		System.out.println(value);

		scopstatic  ss = new scopstatic();
		System.out.println(ss.globalScope);
		scopstatic ss2 = new scopstatic();
		
		ss.globalScope = 10;
		ss2.globalScope = 20;
		
		System.out.println(ss.globalScope);
		System.out.println(ss2.globalScope);
		
		ss.staticVal = 50;
		ss2.staticVal = 100;
		
		System.out.println(ss.staticVal);    // static한 변수, 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유한다.
		System.out.println(ss2.staticVal);
//		System.out.println(scopestatic.staticVal); // 클래스이름.클래스 변수명  으로 바로 사용할 수 있다.
	}

}
