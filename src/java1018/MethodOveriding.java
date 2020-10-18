package java1018;

public class MethodOveriding {
/*
	
	MethodOveriding 은 부모클래스의 메소드를 자식 클래스에서 재 정의 해주는것을 말한다.
	
	아래의 예재를 보자.
	
	class Calculator(){
		
		int left, right;
		
		public void setOperands (int left, int right){
		
		 this.left = left;
		 this.right = right;
		 
		}
		
		public void sum(){
			System.out.println(this.left+this.right);
		{
	
		public void avg(){
			System.out.println((this.left+this.right)/2);
		}
	
	}
	
	class SubstractionableCalculator extends Calculator{
	
		public void sum(){				-> 부모클래스에서 정의한 메소드를 자식클래스에서 다시 정의 했다. 이것이 메소드 오버라이딩이다.
			System.out.println("실행 결과는" + (this.left+ this.right)+"입니다.");
		}
		
		public void substract(){		-> 자식클래스에서 새로추가된 메소드이다.
			System.out.println(this.left-this.right);
		}
	
	}
	
		+ 메소드 오버라이딩을 하기위한 조건이 있다.
		
		 1. 메소드의 이름.
		 2. 메소드 매개변수의 갯수와, 데이터타입, 그리고 메소드의 순서.
		 3. 메소드의 리턴 타입.
	
		이 세가지중 하나라도 같지 않으면 메소드 오버라이딩을 할 수 없다.
*/	
	public static void main(String[] args) {
		

	}

}
