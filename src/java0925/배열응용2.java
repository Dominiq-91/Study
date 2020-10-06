package java0925;

public class 배열응용2 {

	public static void main(String[] args) {
		
		int[] array = {45,20,99,2,71,38,65,86,12,54};

		int[] max = {0,0,0,0,0,0,0,0,0,0};

		

				for(int i=0; i<array.length; i++){
					
					
					if (max[i] < array[i]) {
						
						for(int a = 9; a > 0; a--) {
						
						max[a] = max[a-1];
						
						}
						
						max[i] = array[i];
						
					}
				
					for(int j=1; j<max.length; j++) {

						if ( max[j]<array[i] && array[i] < max[j-1]){

							for(int a = 9; a > j; a--){

								max[a] = max[a-1];

								max[j] = array[i];

							}

						}

					}

			}
		for(int a = 0; a<max.length; a++) {
			System.out.print(max[a]+" ");
		}
	}

}
