package java1016;

public class Bus_New_Exam {

	public static void main(String[] args) {
		
		Car_new c = new Bus_New();
		c.run();
//		c.ppangppang();
		
		Bus_New bus = (Bus_New)c;
		bus.run();
		bus.ppangppang();
		// 부모 타입으로 자식을 카리킬 수 있다. 이것이 클래스의 형변환을 해야지만 가능하다.
		// 이 경우 부모가 가지고 있는 내용만 사용 가능. 
		
		
		
		
//		-------------------------------------
		//부모와 동일한 메소드를 자식이 재 정의한다면, 자식의 메소드만 출력된다.이것을 오버라이딩이라고 한다.
		//그렇지만 오버라이딩 한다고 해서 부모의 메소드가 없어지는 것은 아니다.
		//super 키워드를 이용하면, 부모의 메소드와 자식의 메소드를 둘다 호출 할 수 있다.
		
		
		
	}

}
