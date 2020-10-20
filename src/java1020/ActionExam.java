package java1020;

public class ActionExam {

	public static void main(String[] args) {
		
		//일반적인 형태
		Action action = new MyAction();  // 추상클래스는 자기자신을 객체로 생성할 수 없다. 따라서 자식 클래스를 가져와서 암묵적 형변환을 사용한다.
		action.exec();
		
		
		// 익명클래스는 자식클래스인 MyAction을 만들지 않고 , 새로운 익명 클래스를 만들어 사용한다.
		Action action1 = new Action() {
//			(......................)  실제로는 이름 없는객체 가 생성된것.
			public void exec() {
				System.out.println("exec");
			}
			
		}; // <- 익명 클래스 생성시 필요함.
		action1.exec();
		
/*		
		만드는 이유.
		액션을 상속받는 클래스를 굳이 만들어낼 필요가 없는 경우
		액션을 상속받는 클래스가 해당클래스 안에서만사용되고 다른 클래스에선 전혀 사용될 필요 없는 경우.
*/
		
	}

}
