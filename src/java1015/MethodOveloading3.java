package java1015;

public class MethodOveloading3 {
		
//		오버로딩을 했을때 매개변수가 같지만 리턴타입이 다르면 오류가 발생한다.

	
	void A() {
		System.out.println("void A()");
	}
	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}
	void A(String arg1) {
		System.out.println("void A(String args1");
	}
/*	int A() {		//메소드의 이름이 같고 매개변수가 같다면 리턴값이 다르다고 하더라도 실행할 수없다.
		System.out.println("void A()");
	}
*/	
	public static void main(String[] args) {		

		MethodOveloading3 od = new MethodOveloading3();
		
		od.A();
		od.A(1);
		od.A("coding everybody");
	}

}
