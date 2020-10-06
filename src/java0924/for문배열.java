package java0924;

public class for문배열 {

	public static void main(String[] args) {
		
		int [] iarray = new int[100];
		
		iarray[0] = 1;
		iarray[1] = 2;
		
		System.out.println(iarray.length); //iarray.length 는 배열로 지정된 iarray의 길이( []값 )을 출력해준다.
		// 기본 배열 설정방법.
		// 그러나 1부터 100까지 값을 차례대로 넣으려면 노가다인데, 이럴때 반복문 사용하면 됨
		
		for( int i = 0; i < iarray.length; i++) { // 각 배열에 수를 채워 넣는 방법.
			
			iarray[i] = i + 1;
			
		}
		
		int total = 0;
		
		for( int i = 0; i < iarray.length; i++) {
			
			total = total + iarray[i];
		}
		
		System.out.println(total);
		
		// 변수의 스코프..?
		// 변수는 선언된 블럭 안에서만 사용 가능하고 블럭안에서 선언된 변수는 블럭 밖에선 사용할 수 없다.
		// 따라서 변수는 타입을 작성하기 이전에 선언해 주는것이 좋다..?
		
		// 제대로 이해한게 맞나.. 하늘이한테 물어봐야지.

	}

}
