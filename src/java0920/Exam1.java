package java0920;

public class Exam1 {

	public static void main(String[] args) {
		
//		int total = 0;
//		
////		String str = "답은";
//		
//		for(int a=0; a<11; a++) {
//			
//			total = total+ a;
//
//		}
//		System.out.println( "답은:" + total );
		
		
		int a = 0;
		int total = 0;
		
		while(a<11) {
			if (a%2==0) {

				total += a; // total = total + a;
						  // a++;
						  // 와 같다.
				
			} 		
			a++;
		}
		System.out.println("답은:"+total);
	}

}
