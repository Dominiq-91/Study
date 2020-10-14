package java1014;

import java.util.Scanner;   // java.util 이라는것의 안에 들어있는 Scanner라는 객체를 import(불러오기)하겠다는 뜻.

public class ScannerDemo {

	public static void main(String[] args) {
/*		
		앱이 실행중에 데이터를 입력 1
		
		* 사용자의 입력을 받기
*/
		
		Scanner scan = new Scanner(System.in); 	// System.in 은 사용자가 키보드를 이용하여 입력한 값이라는 의미.
		//위의 내용은 () 의 내용을 스캔한다는 뜻이다.
		int i = scan.nextInt();  //사용자가 입력한 값을 int형으로 입력하기를 기다리는 상태.
								 // 사용자가 입력하고 엔터를 치는 순간에 입력한 값이 int형 변수 i 에 초기화 된다.
		System.out.println(i*1000);
		scan.close();
		
	}

}
