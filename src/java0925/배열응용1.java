package java0925;

public class 배열응용1 {

	public static void main(String[] args) {
		
		// int형 배열 array 값에서 최대값과 최소값을 구하
		
		
	    int[] array = {45,20,99,2,71,38,65,86,12,54};
	    
	      
	      int[] max = {0,0,0,0,0,0,0,0,0,0,0,0};
	      
	      
	      
	      
	      for(int i=0; i<array.length; i++) {
	      
	    	  if( max[0] < array[i]) { //제일 큰 숫자 구하는 if
	             

	            max[9] = max[8]; 
	            max[8] = max[7]; 
	            max[7] = max[6]; 
	            max[6] = max[5]; 
	            max[5] = max[4]; 
	            max[4] = max[3]; 
	            max[3] = max[2];
	            max[2] = max[1]; 
	            max[1] = max[0];
	            
	            max[0] = array[i];
	         }
	         
//			 if(max[i+1] < array[i] && array[i] < max[i]{
		         
//	         	for(int j = 9; j>i+1; j--){
	         	
//	         	max[i+1] = array[i]
	       
//	         	}
	         
//	      	 }
	    	  
	         if(max[1] < array[i] && array[i] < max[0] ) { //2번째로 큰 숫자 구하는 if
	         
	        	max[9] = max[8]; 
	            max[8] = max[7]; 
	            max[7] = max[6]; 
	            max[6] = max[5]; 
	            max[5] = max[4]; 
	            max[4] = max[3]; 
	            max[3] = max[2]; 
	            max[2] = max[1]; // 맥스 저장 9부터 2까지 (8번)
	            
	            max[1] = array[i]; 
	            
	         }

	         
	         if(max[2] < array[i] && array[i] < max[1] ) {
	            
	        	max[9] = max[8]; 
	            max[8] = max[7]; 
	            max[7] = max[6]; 
	            max[6] = max[5]; 
	            max[5] = max[4]; 
	            max[4] = max[3]; 
	            max[3] = max[2]; // 맥스 저장 9부터 3까지 (7번)
	 
	            max[2] = array[i];
	            
	         }
	       
	       
	         if(max[3] < array[i] && array[i] < max[2] ) {
	           
	        	max[9] = max[8]; 
	            max[8] = max[7]; 
	            max[7] = max[6]; 
	            max[6] = max[5]; 
	            max[5] = max[4]; 
	            max[4] = max[3]; // 맥스 저장 9부터 4까지 (6)

	            max[3] = array[i];
	            
	         }
	       
	       
	         if(max[4] < array[i] && array[i] < max[3] ) {
	           
	        	max[9] = max[8]; 
	            max[8] = max[7]; 
	            max[7] = max[6]; 
	            max[6] = max[5]; 
	            max[5] = max[4]; 
	            
	            max[4] = array[i];
	            
	         }
	       
	       
	         if(max[5] < array[i] && array[i] < max[4] ) { 
	           
	        	max[9] = max[8]; 
	            max[8] = max[7]; 
	            max[7] = max[6];
	            max[6] = max[5];  
	            
	            max[5] = array[i]; 
	            
	         }
	       
	       
	         if(max[6] < array[i] && array[i] < max[5] ) {
	            
	            max[9] = max[8]; 
	            max[8] = max[7]; 
	            max[7] = max[6];
	            
	            max[6] = array[i];
	            
	         }
	       
	       
	         if(max[7] < array[i] && array[i] < max[6] ) {
	            
	            max[9] = max[8]; 
	            max[8] = max[7]; 
	            
	            max[7] = array[i];
	            
	         }
	       
	       
	         if(max[8] < array[i] && array[i] < max[7] ) {
	            
	            
	            max[9] = max[8]; 
	         
	            max[8] = array[i];
	            
	         }
	       
	       
	         if(max[9] < array[i] && array[i] < max[8] ) {
	            
	            max[9] = array[i];
	            
	         }
	         
	         
	         System.out.print(i + ": " + max[0] + " "+max[1] + " " + max[2] + " " + max[3] + " " + max[4] + " " + max[5] + " " + max[6] + " " + max[7] + " " + max[8] + " " + max[9] );
	         
	        System.out.println();
	      }
	      

	      
	      
	    }
	}





//	       for(int a = 9; a<0; a--){
//	                 
//	                   max[a] = max[a-1]; 
//	             }
	            
