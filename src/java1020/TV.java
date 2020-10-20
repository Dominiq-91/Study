package java1020;

public interface TV {

	
	public int MIN_VOLUME = 0;		// final을 사용하지 않고도 상수형식으로 선언이 가능하다.
	public int MAX_VOLUME = 100;	
	
	
	public void turnOn();    //메소드는 항상 중괄호(블럭)가 필요하지만, 추상클래스는 블럭이 따로 필요하지 않다. 구동 방식은 필요하지 않기때문. 
							 // 또한 추상메소드는 abstract를 써주어야했지만 interface 자체가 구현은 없고 기능을 가지고 있는것만 선언하기에 오류가 발생하지 않는다.
	
	public void turnOff();
	
	public void ChangeVolume(int volume);
	
	public void ChangeChannel(int channel);
	
}
