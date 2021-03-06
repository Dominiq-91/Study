package java0924;

public class 배열2차원 {

	public static void main(String[] args) {
		
//		2차원 배열이란 배열의 배열이라는 뜻
//		
//		2차원 배열의 형식은 배열표시를 두개 적어주면 됨.
		
		int [][] array4 = new int[3][4];
		
//		array[0] = 1,2,3,4 
//		array[1] = 1,2,3,4
//		array[2] = 1,2,3,4

//		array[0,1,2]는 참조변수(정수값을 담을수 없는 참조변수) 3개이고, 뒤의 1,2,3,4는 배열 그릇이다.
//		이런식으로 만들어진다.
		
		array4[0][1] = 10; // 이런식으로 넣어주어야 한다.
		
		/////////////////////////////////////
		
		int [][] array5 = new int[3][];
		
//		array[0][] = 10; 이렇게 쓰면 실행시엔 오류가 없지만 콘솔창에 오류가 생긴다.
//					   0번째 참조변수에 값을넣을수 있는 1차원배열이 만들어 지지 않았기 때문.

		array5[0] = new int[1]; // 이런식으로 지정해 주어야지만 값을 넣을 수 있다.
		array5[0][0] = 10;
		
		
		//////////////////////////////////////////////////
		
		
		int[][] array6 = {{1},{1,2},{1,2,3},{1,2,3,4}};
		
		System.out.println(array6[0][0]);
		System.out.println(array6[3][3]);
		
		//한번에 참조변수와 배열을 지정해준것 {},{},{},{} 의 개수가 참조변수의 개수이고,
		// {}안의 숫자가 각 {}마다의 지정된 1차원배열이다.
		// 즉 0번째 참조변수의 0번째 칸에 1이라는 숫자가 들어가있고
		// 1번째 참조변수의 0번째 칸에 1이라는 숫자, 1번째 칸에 2라는 숫자
		// 2번째 참조변수의 0번째 칸에 1이라는 숫자, 1번째 칸에 2라는 숫자, 2번째 칸에 3이라는 숫자가 들어가 있는 것이다.
		
	}

}
