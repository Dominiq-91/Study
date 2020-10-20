package java1020;

public class ledTV implements TV {   // 인터페이스의 상속 = implemnets

	
	
	@Override
	public void turnOn() {
		System.out.println("킨다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끈다");
	}

	@Override
	public void ChangeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 조절한다");
	}

	@Override
	public void ChangeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을 변경한다");
	}

}
