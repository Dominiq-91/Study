package java1016;

class MultiplicationableCalculator extends Calculator{ //자식 2
	
	public void multiplication() {
		System.out.println(this.left*this.right);
	}
}


public class CalculatorDemo2 {

	public static void main(String[] args) {
	
		MultiplicationableCalculator mc = new MultiplicationableCalculator();
		mc.setOprands(10,20);
		mc.sum();
		mc.avg();
		mc.multiplication();
	}

}
