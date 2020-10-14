package java1014;

public class Method3 {

	
	//복수의 리턴
/*	
	public static String getMember1() {
	
		return "최진혁";
	
	}
	
	public static String getMember2() {
	
		return "최유빈";
	
	}
	
	public static String getMember3() {
	
		return "한이람";
	
	}
	
*/
	public static String[] getMembers() {
		
		String[] members = {"최진혁","최유빈","한이람"};   // 복수의 리턴은 이처럼 배열을 사용해 만들 수 있다.
		
		return members;
		}
	
	
	public static void main(String[] args) {
		
		String[] members = getMembers();
	}

	
}
