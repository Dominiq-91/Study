package java1007;

import java.util.Scanner;
import java.util.Random;

public class random야구 {

	public static void main(String[] args) {

			
			// 게임시작.
//			System.out.println("숫자를 입력하세요");
			
			
			
			
			
			// 출제자가 생각.
			int[] comp = new int[4]; // 컴퓨터가 랜덤으로 생성한 값이 들어갈 int값.
			
			
			Random r = new Random(); // 랜덤 객체 생성	
			
			for(int i =0; i<comp.length; i++){
				
				comp[i] = r.nextInt(10); // 난수를 comp배열에 저장
				
				for(int j =0; j<i; j++) {  
					
					if(comp[i] == comp[j]) {  // 이전순서 배열 (i)와 그 다음에 나올 배열(j)이 숫자가 같다면.
						i--;
					}						  // 이전순서 배열을 다시 초기화 해서 재실행. 
				}							  // comp[0] 과 comp[1]이 같은 값이면, comp[0] 값을 초기화해서 넘어간다.
							
			}			
			System.out.println("출제자가 문제를 설정하였습니다 :"+comp[0]+""+comp[1]+""+comp[2]+""+comp[3]);
			
			
			
			
			
			// 정답자로부터 입력받기위한 작업 
						
			int[] user = new int[4];  // 사용자로부터 입력받은 문자열을 자를 배열자릿수
			
			Scanner scan = new Scanner(System.in);
			
			int strike = 0;
			int ball = 0;
			
		while( strike < 4 ){
	
			strike = 0; 
			ball = 0;
			
			String num = scan.nextLine();	//입력값을 "num"에 저장
			String[] array_num = num.split(""); // 입력받은 문자열을 각각 별개로 자름
						
			
				for(int j = 0; j<user.length; j++) {	
					user[j] = Integer.parseInt(array_num[j]);   // 사용자가 입력한 걸 배열에 저장하는 구간
				}			
			
				for(int i = 0; i<comp.length; i++) {		// 선수의 입력값과 컴퓨터의 입력값을 비교하는 구간
				
					for(int j = 0; j<user.length; j++) {
					
						if( i == j && comp[i] == user[j]){
						
								strike++;
						
						}else if ( i != j && comp[i] == user[j]) {
						
								ball++;
						}
						
					}
					
				}
				
			System.out.println(strike +"스트라이크, "+ball+"볼 입니다.");
							
		}
				
	}
	
}

