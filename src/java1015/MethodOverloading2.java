package java1015;

public class MethodOverloading2 {

	public static void main(String[] args) {
		
		MethodOverloading mol = new MethodOverloading();
		
		System.out.println(mol.Plus(3,4));
		
		System.out.println(mol.Plus(3,4,5));
		
		System.out.println(mol.Plus("안녕하세요",". 반갑습니다."));
		
		
		// 같은 메소드라도 매개변수의 타입의 종류나, 갯수가 다르다면 사용할 수 있다.
		// 이것을 메소드 오버로딩 이라고 한다.
		
	}

}
