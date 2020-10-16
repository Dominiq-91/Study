package java1016;

import java1013.Car;

public class Truck extends Car {
	
	public Truck() {
		super("소방차"); // 부모의 기본 생성자를 호출해주세요. // Car에서 기본생성자가 name 생성자로 바뀌었기 때문에 super에도 name 인자를 넣어줘야한다.
		System.out.println("Truck 의 기본 생성자입니다");
	}
}
