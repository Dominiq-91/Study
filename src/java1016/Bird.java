package java1016;

/*
 		새라는 것을 생각해보면 여러가지를 떠올릴수 있
 		ex. 독수리, 매, 앵무새, 타조 etc...
 		
 		그러나 비둘기 라는것을 생각해보면 대부분은, 비둘기를 생각한다.
 		이런것은 구체적이라고 표현한다.
 		
 		새와 같은것을 추상 클래스라고 한다.
 	    ex. 가구, 차, 음식, 꽃 etc...
 	    
 	    이렇게 모호한 단어들을 가진 클래스들은 부모로써의 역할은 수행할 수 있지만, 객체는 될수 없다.
 	    객체는 구체적인 클래스들만 가능하다.
 		
 
*/ 

public abstract class Bird {
	//추상 클래스를 정의하는 방법.
	// 메소드가 하나라도 추상메소드일경우 해당클래스도 추상 클래스이다.
	public abstract void sing();
	public void fly() {
		System.out.println("날다");
	}
	
}
