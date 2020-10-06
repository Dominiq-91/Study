package java0924;

public class 배열 {

	public static void main(String[] args) {
		
		//배열
		// 1000명의 학생 점수를 저장하기 위해서는 변수가 '1000'개가 필요하다
		// 이럴때 쓰는것이 배열임
		
		
		int[] array1 = new int[1000]; //배열을 만드는형태
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[] {1,2,3,4};
		
		// 배열의 개수와, 배열안에 들어가는 숫자를 동시에 선언하는 방법
		
		int[] array3 = {1,2,3,4};
		
		//위의 것과 같음. '1차원배열'이라고 함
		
		
//		배열안의 값을 꺼내서 사용할때 
		
		System.out.println(array3[3]);
		
		// 이것을 꺼내서 다른곳에 쓰고 싶다면?
		
		int value = array3[0];
		
		System.out.println(value);
		
		
		// 반복문을 활용해서 차례대로 꺼내는 방법
		
	}

}
