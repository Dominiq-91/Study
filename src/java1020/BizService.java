package java1020;

public class BizService {

		public void BizMethod(int i) throws BizException{
			System.out.println("비지니스 메소드 시작");
			
			if(i < 0) {
				throw new BizException("메개변수 i는 0이상이어야 합니다.");
			}
			
			System.out.println("비지니스 메소드 종료");
		}
}
