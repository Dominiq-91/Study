package java1021;

public class Exception복습 {
/*	
	자바에 있어서 예외와 에러는조금 다른 개념이다.
	예외란, 개발자가 입력한 값에 대한 연산(처리)가 불가능하거나, 프로그램 실행중에 참조된값이 잘못 되었을 경우 등등, 정상적인 프로그램의 흐름에 어긋나는 것을 말한다.
	자바에서는 이러한 것들을 개발자가 직접 처리할 수 있는데, 에러가 발생하는 곳을 예측하여 핸들링 할 수 있다. 이것이 예외 이다.
	
	반면 에러는, 시스템에 무언가 비정상적인 상황이 발생한경우에 사용된다. 예외와 반대로 이를 애플리케이션 코드에서 잡을 수 없다.
	에러의 예로는 OutOfMemoryError, ThreadDeath, StackOverflowError 등이 있다.
	
	예외의 방법에는 여러가지가 있다.
	
	1. try - catch - finally
	
		try{
		...(예외가 발생하는 부분)
		}catch(예외클래스 클래스이름){
		...(출력식)
		}finally{ - 생략가능 (이 부분은 오류가 발생하던 안하든 무조건 실행시키고싶을때 사용한다)
		...(출력식)
		}
	
	2. throws
	
		메소드 선언 뒤에 throws 예외클래스.
		
	ex) public static int divide(int i,int j) throws ArithmeticException {
		메소드 구동식
	}
	
		위와 같다면 예외가 발생한 부분을 divide메소드가 아닌 호출하는 쪽에서 해결하라는 뜻이다 (예외 회피).
		
		
	3. throw (예외 발생시키기)
	
	 	이 경우에는 오류를 떠넘기는 throws와 보통 같이 사용된다.
	 	에러도 발생하지않고, 올바르지 않은 결과를 리턴하지도 않도록 수정.
	 	
	ex) public static int divide(int i, int j) throws IllegalArgumentException{
            if(j == 0){
                throw new IllegalArgumentException("0으로 나눌 수 없어요.");
            }
            int k = i / j;
            return k;
           
           위는 아래와 같다.
           
    ex) public static int divide(int i, int j){
            if(j == 0){
                System.out.println("2번째 매개변수는 0이면 안됩니다.");
                return 0;
            }
            int k = i / j;
            return k;
        }       
            
            아래는 잘못된 값을 입력하면 0이면 안된다는 내용을 출력하고 0을 리턴한다. 하지만 위의 값은 리턴하지않고 호출한 쪽으로 예외처리를 전가한다.
            
            
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
