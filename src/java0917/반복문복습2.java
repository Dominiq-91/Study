package java0917;

public class 반복문복습2 {

	public static void main(String[] args) {
		
		
		//로직을 구성할때 반드시 인지해야할것은 '가변'적인것과 '고정'적인것들을 구분해야한다는것이다.
		
//		int max = 100; // while(i < 100) 할수도 있겠지만 100이라는 가변적 수치를 int타입으로 지정해서 i < max로 고정화 시켜주는것이 좋다.
//		int i = 0;
//		
//		while(i < max) {
//			System.out.println("Nice good job");
//			i++;
//		}

		//반복문의 중첩
		
		for(int m = 0; m < 10; m++) {
			for(int j = 0; j < 10; j++) {
				System.out.println(m+""+j);
				
			}
		}
	}
}
