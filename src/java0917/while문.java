package java0917;

public class while문 {
 
	// while문?
	// 어떠한 것을 반복적으로 사용하고 싶을 때, 자바에서는 반복문으로 while,do while,for문을 제공
	
	public static void main(String[] args) {
		
//		int i = 0;
//		
//		while(i<100) {
//			System.out.println(i);
//			i++;
//		}
		
		
		int total = 0;
		int j = 1;
		
		while(j <= 100) {
			total = total + j;
			j++;
				System.out.println(total);
				
		}
		
		
		while(true) {
			System.out.println("hello");
			
		}
		
	}

}
