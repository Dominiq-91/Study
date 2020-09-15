package java0915;

public class 기본형변환 {

	public static void main(String[] args) {
		//byte < short,char < int < long < float < double 순으로 크기 나열을 해볼수 있음
		
		int x = 50000;
		long y = x;    // 자연스럽게 일어나는 경우를 '묵시적 형변환' 이라고 한다.
		
		long x2 = 5;
		int y2 =(int) x2; //실제 값은 5이므로 충분히 담을수 있지만 컴파일러는 인식하지 못한다. long type -> int type으로는 불가능하다는 얘기
						  // 변환시 강제로 명령어를 삽입해 변환시키는것을 '강제 형변환'이라고 한다.
	

	}

}
