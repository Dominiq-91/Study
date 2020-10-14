package java1014;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNextInt()) { // hasNextInt : Scanner객체가 가지고 있는 hasNextInt 라는 메소드를 불러오는 것.
			// 1. .hasNextInt는 사용자가 입력을 하고 엔터를 치기 전까지 대기상태이다. 
			// 2. int 형으로 입력되면 true, 문자열이라면 false가 된다.
			// 3. nextInt는 int형이 아닌 다른것을 입력시 false가 아닌 에러가 난다.
			System.out.println(sc.nextInt()*1000);
		}						// nextInt : 사용자가 입력한 정수값.
		sc.close();
		
		
	}

}
