package java1015;

public class MethodOverloading {

/*	
		메소드 오버로딩

		매개변수의 수, 타입이 다른경우
		동일한 이름으로 메소드를 여러개 정의 할 수 있다.
		
		여기서 타입과 매개변수의 수가 제일 중요하다.
*/	
	
	
//     1.  정수값 x, y를 받아 x+y해서 정수값을 return하는 메소드.
	
		public int Plus (int x,int y) {
			
			return x+y;
		}
	
	
//	   2. 정수값 x, y, z를 받아 x+y+z해서 정수값을 return하는 메소드.
	
		public int Plus (int x,int y,int z) {
			return x+y+z;
		}
	
	
//	   3. 문자열 x, y를 받아 x+y해서 문자열 값을 return하는 메소드.
	
		public String Plus (String x, String y) {
			return x+y;
		}
	
/*     4. 정수값 i, j를 받아 i+j해서 정수값을 return하는 메소드.
		
		public int Plus(int i, int j) {
			return i+j;
		}
		-> 위의 식이 컴파일 에러가 나는 이유는, 1번 메소드와 4번 메소드의 매개변수의 타입이 같기 때문이다.
		   타입이 같다면 갯수가 달라야 하고, 갯수가 같다면 타입이 달라야 한다.
*/		
		
	public static void main(String[] args) {
		
		

	}

}
