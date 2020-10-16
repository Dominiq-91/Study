package java1016;

class DivisionableCalculator extends MultiplicationableCalculator { //자식은 부모가 될 수 있다. 
	public void division() {
		System.out.println(this.left / this.right);
	}
}



public class CalculatorDemo3 {

	public static void main(String[] args) {
		
		DivisionableCalculator dc = new DivisionableCalculator();
		dc.setOprands(10,20);
		dc.sum();
		dc.avg();
		dc.multiplication();
		dc.division();

	}

}


/*
	 부모가 만든 코드를 자식이 또 사용할 필요가 없기에 코드 중복을 제거한다.
	 또한 상속을 통해 재활용성의 증가, 유지보수의 향상성등을 제공한다.

*/