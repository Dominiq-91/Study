package java1007;
import java.util.Random;

public class 난수 {

	public static void main(String[] args) {

/*	 자바에서 난수 받기
	 
	 Random 클래스를 이용하는 방법과 Math클래스를 이용하는 방법 두가지가 있다.
	 
	 1. Math.random() - 0.0 ~ 1 사이의 double 난수를 얻는것밖에 못함. (소수점이하 무한소수 무한에 가까운 경우의 수가 나옴)
	 					실수형에서 정수형으로 가공하려면 나머지, 곱셈활용 두가지가 있다.
	 			        종자값(seed, 뭔지 잘 모름) 현재시간으로 고정 / 임의 설정 불가.
	 			        최상위 클래스인 Object에 속해있으므로, 따로 import 안해줘도 됨 ( static 메소드로 이루어져 있어서 바로 호출 가능)
	 			        	 				 
	 2. Random 클래스 - boolean, int, long, float, double 난수를 다 얻을 수 있음.
	 			       종자값(seed, 여전히 뭔지 잘 모름) 사용자 임의 설정 가능.
	 			       java.util 패키지 안에 있어서, 반드시 Import 가 필요하고, new를 통해 객체를 생성해줘야 한다.
	 			     
	       * 종자값은 난수를 만드는 알고리즘에 사용되는 값으로 종자값이 같으면 같은 난수를 얻습니다.
*/
		
//		Math.random으로 0~10까지의 난수 출력하여 1자리로또번호 6자리 뽑기
	
		for(int i=0; i<6; i++) {
			
		System.out.print("["+(int)((Math.random()*10000)%10)+"]");
		
		}
		
		System.out.println();
		System.out.println();
		
		
//		Math.random으로 0~100까지의 난수 출력하여 1~2자리수 로또번호 6자리 뽑기
		
		for(int i=0; i<6; i++) {
			
		System.out.print("["+(int)((Math.random()*100))+"]");
		
		}
		
		System.out.println();
		System.out.println();
		
		
//		Random 클래스로 0이상 10이하의 난수 출력하여 1자리 로또번호 6자리 뽑기
		
		Random rd = new Random();  // import 별도로 지정하고, 객체 별도 생성작업이 우선 필요함.
		
		for(int i=0; i<6; i++) {
			
			System.out.print("["+ rd.nextInt(10)+"]");
			
			}
			
			System.out.println();
			System.out.println();
	
//		Random 클래스 0이상 100이하의  난수 출력하여 1자리~2자리 로또번호 6자리 뽑기
			
		for(int i=0; i<6; i++) {
				
			System.out.print("["+ rd.nextInt(100)+"]");
				
			}
				
			System.out.println();
			System.out.println();
			
	}

}
