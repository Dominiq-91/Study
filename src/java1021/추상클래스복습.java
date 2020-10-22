package java1021;

public class 추상클래스복습 {
/*
	추상클래스는 구체적이지 않은 클래스를 의미한다.
	예를들면, 타조,닭,비둘기,오리는 구체적인 개체를 지칭하지만, 그 상위 카테고리인 새, 포유류는 구체적이지 않기도하고 너무 다양하다.
	이러한 것을 구현하는것이 추상 클래스이다.
	
	추상클래스를 사용할때는 클래스앞에 abstract 키워드를 이용해서 정의한다.
	추상메소드도 같은 원리고 생성이 가능한데. 추상클래스 안에 추상메소드를 포함할 수 있다.
	다만 추상메소드는 abstract을 클래스가 아닌 리턴타입 앞에 붙혀야 한다.
	또 추상클래스는 인스턴스를 생성할 수 없다.(객체생성불가)
	
	ex) public abstract class Bird{ -> 추상클래스를 상속받은 해당 클래스에서 추상 메소드를 구현하지 않으면 해당 클래스는 추상클래스가 된다.  
		
		public abstract void sing();  -> 추상메소드는 구체적이지 않기때문에 블럭을 생성하지 않는다.
		
		public void fly(){		->일반적인 메소드이다.
			System.out.println("날다");
		}
	}
	ㄴ> 추상클래스를 상속받은 클래스는 그 안의 추상메소드를 구체적으로 구현해줘야 한다.
	
	ex2) Bird b = new Bird  -> 추상클래스는 인스턴스생성이 불가능하다.

	
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
