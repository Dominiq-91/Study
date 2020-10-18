package java1018;

public class 클래스형변환 {
	
	public void run() {
		System.out.println("Car의 run메소드");
	}


public class Bus extends 클래스형변환{
	
	public void ppangppang() {
		System.out.println("빵빵");
	}
}

	public static void main(String[] args) {
/*		
		클래스형변환 car = new Bus();
		car.run()
		car.ppangppang  -> 컴파일 오류. 부모가 자식을 참조하면 부모의 메소드밖에 사용할 수 없다.
		
		Bus bus = (Bus) 클래스형변환(); -> 부모타입을 자식 타입으로 형변환 (큰 범위를 작은범위로 형변환)
		bus.run();
		bus.ppangppang(); -> 사용 가능.
		
*/		
	}

}
