package java0925;

public class 이차원배열선언2 {

	public static void main(String[] args) {
		
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] arr2 = {{0,0,0},{0,0,0},{0,0,0}};

		
//		3번만들기
		
//		arr2[0][0] = arr[0][0];
//		arr2[0][1] = arr[1][0];
//		arr2[0][2] = arr[2][0];
//		
//		arr2[1][0] = arr[0][1];
//		arr2[1][1] = arr[1][1];
//		arr2[1][2] = arr[2][1];
//		
//		arr2[2][0] = arr[0][2];
//		arr2[2][1] = arr[1][2];
//		arr2[2][2] = arr[2][2];
		
        /////////////////////////////////
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
			
				arr2[i][j] = arr[j][i];
		
			}

		}

		for(int i=0; i< arr2.length; i++) {
			for(int j=0; j< arr2[i].length; j++) {
				
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
//		
//		System.out.println(arr[2][0]);
//		System.out.println(arr[2][1]);
//		System.out.println(arr[2][2]);
//		
//		
//		
//		////////////////////////////////
//		for( int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		
//		for( int i = 0; i < a.length; i++) {
//			System.out.print(b[i]+" ");
//		}
//		System.out.println();
//		
//		for( int i = 0; i < a.length; i++) {
//			System.out.print(c[i]+" ");
//		}
//		System.out.println();

	}

}
