package java1007;

import java.util.Scanner;
import java.util.Random;

public class random야구 {

	public static void main(String[] args) {
		

		  // 입력받기위한 로직
		
			Scanner scan = new Scanner(System.in);
			
			String num = scan.nextLine();	//입력값을 num에 저장
			String[] array_num = num.split(""); // 입력받은 문자열을 각각 별개로 자름
			
			Random rd = new Random(); // 랜덤 객체 생성
			rd.setSeed(System.currentTimeMillis()); // 시드값 설정
			
			int strike = 0; //스트라이크 값 변수 설정
			int ball = 0;   // 볼 값 변수 설정
			
			int[] question = new int[4];  // 입력받은 문자열을 자른 배열자릿수
			int[] answer = new int[4]; // 랜덤으로 생성된 값이 들어갈 int값.
			
			
			
			for(int i = 0; i<answer.length; i++) {
				
				answer[i] = Integer.parseInt(array_num[i]);
				
				for(int j=0; j<question.length; j++) {
					
					question[j] = rd.nextInt(10);
					
					if ( i == j && answer[i] == question[j]) {
						
						strike++;
						
					}else if ( i != j && answer[i] == question[j]) {
						
						ball++;
					}
				}
			}
			System.out.println(strike + "스트라이크, " + ball + "볼 입니다.");
			System.out.print(question[0]);
			System.out.print(question[1]);
			System.out.print(question[2]);
			System.out.print(question[3]);
	}

}
