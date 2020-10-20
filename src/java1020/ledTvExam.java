package java1020;

public class ledTvExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new ledTV();  //참조변수의 타입으로 인터페이스를 사용할 수 있다.
		tv.turnOn();
		tv.turnOff();
		tv.ChangeVolume(8);
		tv.ChangeChannel(39);
		
		//만약 ledTv가 Tv인터페이스에서 사용되지 않는 추가적인 기능들 사용하고 있다면, 클래스의 형변환을 통해 확장 할 수 있다.
		
		
	}

}
