package java1007;

import java.util.Scanner;

public class string으로복습 {

	public static void main(String[] args) {
		
	  // 입력받기위한 로직
		
		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		String[] array_num = num.split("");
		
		int strike = 0;
		int ball = 0;
		
		int[] question = new int[4];
		int[] answer = {8,9,1,3};
		
		for(int i = 0; i<question.length; i++) {
			
			question[i] = Integer.parseInt(array_num[i]);
			
			for(int j=0; j<answer.length; j++) {
				
				if ( i == j && question[i] == answer[j]) {
					strike++;
				}else if ( i != j && question[i] == answer[j]) {
					ball++;
				}
			}
		}
		System.out.println(strike + "스트라이크, " + ball + "볼 입니다.");
		
		
	}

}
