package java1014;

public class Method2 {

	
/*		
		리턴을 굳이 하는 이유.
		
		// 결과값을 화면에 출력하지 말고,파일에 저장하거나, 이메일로 보내거나 할때
		// 출력식이 메소드 안에 있기때문에 하나를 가지고 처리 할 수 없다.
	
	 
		public static int one() { 메소드. 
			
			return 1;
			return 2;     // return을 만나는순간 메소드 밖으로 완전히 빠져나오기때문에 이후의리턴 값들은 컴파일 오류가 일어난다.
			return 3;
				
		}
		
		public static void main(String[] args) { 메인.
			
			System.out.println(one());
			
		}
*/
	
		public static String num(int i) {
			
			if(i == 0) {			// i에 1이 들어오면서, 조건문이 실행되고, 두번째 조건문에서 return을 만나 밖으로 빠져나온다. 
				return "zero";      // 결론적으로 메인 메소드의 출력식을 실행하면 one이 출력된다.
			}else if(i == 1) {
				return "one";
			}else if(i == 2) {
				return "two";
			}
			return "none";
		}
	
		public static void main(String[] args) {
			
			System.out.println(num(1)); // 1이라는 매개변수가 메소드로 들어가 식이 실행된다.
		}
		
		
		
}
