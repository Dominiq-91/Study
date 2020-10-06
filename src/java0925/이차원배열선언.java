package java0925;

public class 이차원배열선언 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int[] array2 = {0,0,0,0,0};
		
		for (int a=0; a<array2.length; a++) {
			
			array2[a] = array[4-a];
			
		}
		
//		array2[0] = array[4];
//		array2[1] = array[3];
//		array2[2] = array[2];
//		array2[3] = array[1];
//		array2[4] = array[0];
		
	
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
