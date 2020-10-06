package java0924;

import java.util.Scanner;

public class 배열복습 {

	public static void main(String[] args) {
		
		// 6개의 문자배열 만들기
		
		String message;
		
		
		String[] array = {"J","U","N","G","O","L"};
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		
		message = scan.nextLine();
	
///////////////////////////////////////////////////////
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(message.equals(array[i])) {
				
				System.out.println("입력하신"+message+"는"+ i +"번째 자리입니다.");
				count++;
			}
		
			}
		if(count < 1) {
			System.out.println("None");
		}	

	}

}
