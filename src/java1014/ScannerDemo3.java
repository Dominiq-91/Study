package java1014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo3 {

	
	public static void main(String[] args) {
		try {
			File file = new File("out.txt");     // 사용자의 직접입력이 꼭 아니더라도, 존재하는 파일을 스캔하여 사용할 수 있다.
		Scanner sc = new Scanner(file);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
			
		}
		sc.close();
		
		}catch(FileNotFoundException e) {    // 예외 : out.txt를 찾을수 없는 경우에 
			e.printStackTrace();			// e.printStackTrace : 화면에 에러를 표기해라.
		}
	}

}
