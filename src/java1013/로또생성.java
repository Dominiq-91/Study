package java1013;

import java.util.Random;
import java.util.Scanner;

public class 로또생성 {

	public static void main(String[] args) {
		
		// 유저가 임의의 정수형 숫자 (1~20까지) 6개 지정. 중복 없음.
		
		Scanner scan = new Scanner(System.in); //입력받음
		
		String num = scan.nextLine(); // 문자열 입력받고
		String[] array_num = num.split(","); // 그걸 , 기준으로 잘라서
		
		int[] user = new int[6]; 

		// 유저 입력값을 배열에 저장
		
		for(int i = 0; i<user.length; i++) {
			user[i] = Integer.parseInt(array_num[i]); //넣은 문자열을 int형으로 변환.
		}
		
//		----------------------------------------------------------------------		
		
		// 컴퓨터 난수값을 배열에 저장
		
		Random r = new Random(); //랜덤 배열 선언
		
		int[] comp = new int[6]; // 컴퓨터 배열 선언
		int duplication = 0; // 정답 중복 선언
		
		int grade5 = 0;
		int grade4 = 0;
		int grade3 = 0;
		int grade1 = 0;
		int GGwang = 0;
		
		while ( true ){
		
			
			
			duplication = 0;
			
							
				for ( int j = 0; j<comp.length; j++) {
					
					comp[j] = r.nextInt(20);
					
					for(int k = 0; k<j; k++) {
						
						if(comp[j] == comp[k]) {
							
							j--;
							
						}
						
					}
						
				}
				
				for ( int i = 0; i<user.length; i++) {
					
					for (int j = 0; j<comp.length; j++) {
						
						if(user[i]==comp[j]) {
							
							duplication++;
							
							
							}
							
						}
						
					}
					if (duplication == 3) {
						
						grade5++;
					}
					if (duplication == 4) {
						
						grade4++;
					}
					if (duplication == 5) {
						
						grade3++;
					}
					if (duplication == 6) {
						
						grade1++;
						break;
					
					}
				}
			System.out.println("로또 총 구매 수는 '" + grade5 + grade4 +grade3 +grade1 +"' 장 입니다.");
			System.out.println("1등 당첨 갯수는 '" + grade1 + "' 장 입니다.");
			System.out.println("3등 당첨 갯수는 '" + grade3 + "' 장 입니다.");
			System.out.println("4등 당첨 갯수는 '" + grade4 + "' 장 입니다.");
			System.out.println("5등 당첨 갯수는 '" + grade5 + "' 장 입니다.");
	}
}

