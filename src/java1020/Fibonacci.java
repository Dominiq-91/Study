package java1020;

public class Fibonacci {
	
	static int count = 0;
	
	public static int fibo(int n) {
		
		count++;
		
		if(n<2) {
			return n;
		}else{
			return fibo(n-1) + fibo(n-2);
		}

	}

	public static void main(String[] args) {
		
		for(int i = 1; i<11; i++) {
			System.out.println(fibo(i));
			
		}
		System.out.println("메소드호출횟수:"+count);
	}

}
