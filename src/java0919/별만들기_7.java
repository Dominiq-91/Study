package java0919;

public class 별만들기_7 {

	public static void main(String[] args) {
		
		for(int a=1; a<6; a++) {
			for(int b=0; b<5; b++) {
				if(5-b>a) {
					System.out.print(" ");
				}else {
					System.out.print("*");	
				}
			}
			for(int b=0; b<5; b++) {
				if(6-b>a) {
					System.out.print("*");
				}else {
					System.out.print(" ");	
				}
			}
			System.out.println();
			
		}
		
		

	}

}
