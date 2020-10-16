package java1016;

public class AccessObjExam {

	public static void main(String[] args) {
		
		AccessObj obj = new AccessObj();
		
		System.out.println(obj.p);	 // public  - 전부 허용.
		System.out.println(obj.p2);	 // pretected - 같은 패키지 내 허용. 같은 패키지 아닐경우 상속만 허용.
		System.out.println(obj.k);	 // default 접근지정자 - 같은 패키지 접근 허용.
//		System.out.println(obj.i);   // private - 자기 자신만 허용 가능하므로 컴파일에러.

	}

}
