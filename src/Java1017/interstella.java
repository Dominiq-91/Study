package Java1017;

import java.util.*;

public class interstella {
	
	public void plus(int left, int right) {
		
		System.out.println(left+right);
		
	}
	
	public void subtract(int left, int right) {
		
		System.out.println(left-right);
		
	}
	
	public void multiplication(int left, int right) {
		
		System.out.println(left*right);
		
	}
	
	public void division(int left, int right) {
		
		System.out.println(left/right);
		
	}
	
	public static void main(String[] args) {
		
		interstella is = new interstella();	
		
		Scanner key= new Scanner(System.in);
		
		
		int a,b;
		String c;
		char d;
		
		System.out.print("정수입력 :");
		a = key.nextInt();
		System.out.println("정수입력 :");
		b = key.nextInt();
		
		
		System.out.println("연산(+,-,*,/ 중) :");
		c = key.next();
		d = c.charAt(0);
		
		
		if(d == '+') {
			is.plus(a,b);
		}else if(d == '-') {
			is.subtract(a,b);
		}else if(d=='*') {
			is.multiplication(a,b);
		}else if(d=='/') {
			is.division(a,b);
		}else {
			System.out.println("잘못 입력했습니다");
		}
		
	}


	
	
	
}
