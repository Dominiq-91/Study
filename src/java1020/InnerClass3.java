package java1020;

public class InnerClass3 {

	public void exec() {   // 메소드를 먼저 선언하고 그 안에 클래스를 생성한다.
		
		class Cal{
			
			int value = 0;
			
			public void plus() {
				value++;
			}
		}
		
		Cal cal = new Cal();    // Cal이라는 객체를 생성할수 있는 곳은 메소드 안에서밖에 사용 못한다.
		cal.plus();
		System.out.println(cal.value);
	}
	
	
	public static void main(String[] args) {
		
		InnerClass3 ic = new InnerClass3();    // 이것을 꺼내서 사용하려면, 외부 클래스객체를 생성한후에, 메소드를 생성하면 그 메소드 안의 Cal 클래스안의 것들이 실행된다.
		ic.exec();

	}

}
