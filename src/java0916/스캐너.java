package java0916;

import java.util.Scanner;

public class 스캐너 {

	public static void main(String[] args) {
		
		String message;
		Scanner scan = new Scanner(System.in); //(System.in)하는 새 작업(new Scanner)를(을) scan으로 명명?
		
		System.out.println("메세지를 입력하세요"); //초기 출력 화면.
		
		message = scan.nextLine(); //Scanner 타입이기때문에 nextLine? () 입력하면..
		
		System.out.println("입력 메시지: \""+ message +"\""); // 여기서 입력한 메세지를 다시 읽어 출력.
		
		
		int kilometer; // kilometer 선
		double liter, kpl; // liter와 mpg 선
		
		System.out.println("주행 거리를 입력하세요." + "(단위:km)"); //초기 출력 화면
		
		kilometer = scan.nextInt(); //그렇다면 이건 int타입이기때문에 nextInt? ()입력하면..
		
		System.out.println("리터 값을 입력하세요"+"단위(L)");
		
		liter = scan.nextDouble();
		
		kpl = kilometer / liter;
		
		System.out.println("거리당(km) 리터값은 :"+ kpl +"(L)" + "입니다");
		
		
		
		
		
		
		
	}

}
