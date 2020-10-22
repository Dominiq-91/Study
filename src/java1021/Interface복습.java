package java1021;


 //		인터페이스는 [상호작용이 일어나는 곳] 이다.


public class Interface복습 {
/*
	interface TV{
		public int MAX_VOLUME = 100;
		public int MIN_VOLUME = 0;
		
		public void turnOn();
		public void turnOff();
		public void changeVolume(int Volume);
		public void changeChannel(int Channel);
	}
	
	이 인터페이스에는 4개의 메소드가 선언되어있다. 구체적인 구동방법이 선언되지 않고, 그냥 껍데기만 선언되어있다.
	해당 인터페이스를 상속받으면 상속받은 클래스에서는 이 메소드를 구체적으로 구현해 주어야한다.
	인터페이스를 상속받을땐 implements를 사용한다.
	
public class LedTV implements TV{    -> TV라는 인터페이스를 상속받은 LedTV 클래스
        public void on(){				
            System.out.println("켜다");
        }
        public void off(){						// 인터페이스를 상속받으면서 그 안에있던 메소드들을 하나씩 구체적으로 구현해주었다.
            System.out.println("끄다");   
        }
        public void volume(int value){
            System.out.println(value + "로 볼륨조정하다.");  
        }
        public void channel(int number){
            System.out.println(number + "로 채널조정하다.");         
        }
    }

		이처럼 인터페이스를 상속받으면서 동시에 해당 인터페이스의 메소드들을 반드시 구현화 해주어야한다.
		참고로 일반적인 상속과는 달리 인터페이스 상속은 동시에 여러개를 받을 수 있다.
		(상속은 자식클래스가 부모클래스를 반드시 단 한개만 상속받을 수 있음)
		
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
