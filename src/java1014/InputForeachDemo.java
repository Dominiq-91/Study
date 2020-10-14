package java1014;

public class InputForeachDemo {

	public static void main(String[] args) {  // main mathod의 파라매터인 args가 인자값을 받기 위해선 run configuration의 arguments를 이용해야한다.
		
		for(String e : args) {
			System.out.println(e);
		}

	}

}
