package java1007;

public class for문예제_1 {

	public static void main(String[] args) {
		
		
//		☆ ★
		
		for(int i = 0; i<5; i++) {
			
			for(int a = 0; a<5; a++) {
				
				if(a+i<4) {
					
					System.out.print(".");
					
				}else {
					
					System.out.print("★");
					
				}

			}

			
			for(int a = 0; a<4; a++) {
				
				if(i<=a) {
					
					System.out.print(".");
					
				}else {
					
					System.out.print("★");
					
				}
				
			}
			
			
			for(int a = 0; a<5; a++) {
				
				if(a+i<4) {
					
					System.out.print(".");
					
				}else {
					
					System.out.print("★");
					
				}
				
			}
			
			for(int a = 0; a<4; a++) {
				
				if(i<=a) {
					
					System.out.print(".");
					
				}else {
					
					System.out.print("★");
					
				}
				
			}
			System.out.println();
		}
		
		for(int i = 0; i<4; i++) {
			
			for(int a = 0; a<4; a++) {
				
				if(a<i+1) {
					
					System.out.print(".");
					
				}else {
					
					System.out.print("★");
					
				}
				
			}
			for(int a = 0; a<5; a++) {
				
				if(a<4-i) {
					
					System.out.print("★");
					
				}else {
					
					System.out.print(".");
					
				}
				
			}
			
			for(int a = 0; a<4; a++) {
				
				if(a<i+1) {
					
					System.out.print(".");
					
				}else {
					
					System.out.print("★");
					
				}
				
			}
			for(int a = 0; a<5; a++) {
				
				if(a<4-i) {
					
					System.out.print("★");
					
				}else {
					
					System.out.print(".");
					
				}
				
			}
			System.out.println();
		}
	}

}
