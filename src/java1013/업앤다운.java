package java1013;

import java.util.Random;
import java.util.Scanner;

public class 업앤다운 {

	public static void main(String[] args) {
		
		
		// 컴퓨터가 임의의 숫자(1~50사이) 하나 설정.
		
		Random r = new Random(); // 랜덤 객체 생성
		
		int comp = r.nextInt(50); // 0부터 50사이의 숫자를 생성 후 int형 변수 i에 초기화.
		
		System.out.println("업앤다운 게임을 시작합니다!");
		System.out.println("컴퓨터가 임의로 지정한 숫자를 맞춰주세요");
		System.out.println("기회는 총 10번입니다.");
		
		
		
		// 유저가 키보드로 임의의 숫자를 입력.
		
		Scanner scan = new Scanner(System.in); // 키보드로부터 입력받을수 있는 로직
		
		int a = 1; // 횟
		
		
		//반복 
		
		while ( a<11 ) {
			
			int user = scan.nextInt();  // 키보드에서 입력받은걸 정수형으로 J에다가 초기화.
						
			if(user < comp) {
				System.out.println("Up!");
				System.out.println("현재 "+ a+ " 번 시도하셨습니다");
				a++;
			}else if(user > comp) {
				System.out.println("Down!");
				System.out.println("현재 "+ a+ " 번 시도하셨습니다");
				a++;
			}else if(user == comp) {
				System.out.println("정답입니다! 게임을 종료합니다!");
				break;
			}
			
			
		}

	}

}
