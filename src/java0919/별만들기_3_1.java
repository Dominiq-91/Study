package java0919;

public class 별만들기_3_1 {

	public static void main(String[] args) {
		
//		System.out.print(" ");  // 	공백4 별1
//		System.out.print(" ");
//		System.out.print(" ");  // 공백을 a
//		System.out.print(" ");  // 별을 b라고 놨을 
//		System.out.print("*");  // 공백 == 5-1별 or 별 == 5-4
//		
//		System.out.println();
//		
//		System.out.print(" "); // 공백3 별2
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println();
//		
//		System.out.print(" "); // 공백2 별3
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println();
//		
//		System.out.print(" "); // 공백1 별4
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println();
//		
//		System.out.print("*"); // 공백0 별5
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println();
		
		//공백은 1씩 감하는걸 5번하고
		//별은  1씩 증가하는걸 1번 한다.
		
	////////////////////////////////
		
		for(int a=1; a<6; a++) {
			for(int b=0; b<5; b++) {
				if(5-b>a) {
					System.out.print(" ");
				}else {
					System.out.print("*");	
				}
			}
			System.out.println();
		}
		
	}

}
