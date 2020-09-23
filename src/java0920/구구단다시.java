package java0920;

public class 구구단다시 {

	public static void main(String[] args) {
		
//		while문으로 구구단 만들기
//		int a = 1;
//		int b = 2;
//		
//		while(a<10) {
//			System.out.print(b+"x"+a+"="+b*a+"\t");
//			b++;
//			
//			if(b>9) {
//				b=2;
//				a++;
//				System.out.println();
//			}
//		}
		
		
//		for문으로 구구단 만들기
		
		for(int a=1; a<10; a++) {
			for(int b=2; b<10; b++) {
				
				System.out.print(b+ "x" +a  + "=" + a*b + "\t");
			}
			System.out.println();
		}

	}

}
