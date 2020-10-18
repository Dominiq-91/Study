package java1018;

public class 상속복습 {

/*	
	상속은 부모클래스와 자식클래스의 관계에서 자식클래스가 부모클래스의 요소들을 가져오는것을 말한다.
	두개의 클래스가 있다고 가정하자.
	
	class Calculator{
	
	 	int left,right
	 	
	 	public void setOperands(int left, int right){
	 		this.left = left;
	 		this.right = right;
	 	}
	 	
	 	public void sum(){
	 		System.out.println(this.left+this.right);
	 	}
	 	
	 	public void avg(){
	 		System.out.println((this.left+this.right)/2);
	 	}
	}
	
	
	
	class multiplicationableCaclulator extends Calculator{   -> 이것이 가능 한 이유는 extends Calculator 때문이다.
																Calculator를 상속받음으로써, Calculator의 메소드를 전부 사용할 수 있다.
		public void multiplication(){
		
			System.out.println(this.left * this.right);		 -> 자식 클래스에서 정의되않은 메소드를 상속을 통해 사용할 수 있다. 부모 클래스에서 정의 해 뒀으니까.
		
		}
				+ 추가로 부모클래스를 여러 자식 클래스에서 상속받을 수는 있으나, 하나의 자식 클래스에서 여러 부모 클래스를 상속받을 수 없다.
				  후자는 다중상속이라고 하는데, 자바는 다중상속을 허용 하지 않는다.
		}
	}
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
