package java0919;

public class 별만들기_6 {

	public static void main(String[] args) {
		
		for(int a=0; a<5; a++) {
			for(int b=1; b<6; b++) {
				if(b>a) {
					System.out.print("*");
				}else {
					System.out.print(" ");	
				}
				
			}
			for(int b=1; b<6; b++) {
				if(b-1>a) {
					System.out.print(" ");
				}else {
					System.out.print("*");	
				}
				
			}
			System.out.println();			
		}
		
	}

}
