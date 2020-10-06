package java0924;

public class foreach {

	public static void main(String[] args) {
		
		int[] iarr = {10,20,30,40,50};
		
		for(int i = 0; i < iarr.length; i++) {
			
			int value = iarr[i];
			System.out.print(value+" ");

		}
		System.out.println();
		
		System.out.print(iarr[2]);
		
		System.out.println();
		
		
		//for each의 사용법
		//for(타입값을 받아줄 변수명 : 출력하고 싶은(반복되는) 자료구조)
	
		for(int value:iarr) {
			System.out.print(value+" ");
		}
		System.out.println();

	}

}
