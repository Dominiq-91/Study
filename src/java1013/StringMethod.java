package java1013;

public class StringMethod {

	public static void main(String[] args) {
	
//		String str = new String("hello");
		String str = "hello";
		
		str.length(); //문자열의 길이를 return 해주는 메소드
		System.out.println(str.length());
		System.out.println(str.concat(" world")); // .concat 은 문자열과 문자열을 결합해주는 메소드다.
		System.out.println(str);
		
		str = str.concat(" world");
		System.out.println(str);
		
		
		
		System.out.println(str.substring(3)); // .substring은 문자를 자른다. 숫자를 하나만 넣으면 시작점을 나타내는것. 0123까지를 다 잘라낸다.
		System.out.println(str.substring(3,7)); // 시작부터 3까지. 7부터 끝까지 잘라낸다.
	}

}
