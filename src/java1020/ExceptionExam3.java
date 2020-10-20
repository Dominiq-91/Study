package java1020;

public class ExceptionExam3 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		try {
		int k = divide(i,j);
		System.out.println(k);
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException{ 
		
		if( j == 0) {
			throw new IllegalArgumentException("0으로 나눌수 없습니다."); // -> throw new 는 그 줄에서 오류가 발생했다는 뜻임. IllegalArgumentException 오류 타입.
		} // 
		
		int k = i/j;
		
		return k;
	}

}
