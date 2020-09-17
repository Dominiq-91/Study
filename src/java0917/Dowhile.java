package java0917;

 import java.util.Scanner;

public class Dowhile {

	// Do while 문
	// while 문의 경우 조건이 만족되지 않을 때 실행되지 않지만
	// do while 문은 무조건 한번은 수행 된다.
	
	public static void main(String[] args) {

		int value = 0;
		Scanner scan = new Scanner(System.in); // System.in - 키보드
				
		do { value = scan.nextInt();
			System.out.println("입력받은 값:"+value);
			
			
		}while(value != 10);
			System.out.println("반복문 종료");
			
	}

}
