package java1016;


/*	
	객체를 자기가 만들지 않았거나,
	객체가 다양한 곳에서 사용되고 있는데 메소드를 추가하면, 다른 곳에서는 불필요한 기능이 포함될수 있다.

	상속은 기존의 객체를 그대로 유지하면서 일련의 기능을 추가하는 방법이다.
	기존의 객체는 기능을 물려준다는 의미에서 부모 객체가 되고,
	새로운 객체는 기존 객체의 기능을 물려받는 다는 의미에서 자식 객체가 된다.
*/

class Calculator{  //부
	
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left+this.right);
	}

	public void avg() {
		System.out.println((this.left+this.right)/2);
	}

}

class SubstractionableCalculator extends Calculator { //자식1
	
	public void substract() {
	
		System.out.println(this.left-this.right);
	
	}

}

public class CalculatorDemo1 { 

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.substract();
			
		
	}

}








